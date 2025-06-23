package com.simpleproject.hospital_management.controller;

import com.simpleproject.hospital_management.model.Doctor;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctor/apis")
public class DoctorController {
    // Debugging -> tracing the flow of the application

    Map<Integer, Doctor> doctorMap = new HashMap<>();
    //  id, doctor instance(obj)

    @PostMapping("/save")
    public String saveDoctor(@RequestBody Doctor doctorInput){

        try{

            if(doctorMap.containsKey(doctorInput.getId())) throw new RuntimeException();

            doctorMap.put(doctorInput.getId(), doctorInput);
            System.out.println(doctorMap);
            return "Saved Successfully";

        }catch(Exception e){
            System.out.println(e);
            return "Request Failed";
        }
    }

    @GetMapping("/findById/{id}")
    public Doctor findDoctorById(@PathVariable int id){
        try{
            return doctorMap.get(id);
        }catch(Exception e){
            System.out.println("Something went wrong"+e);
            return null;
        }
    }

    @GetMapping("/findAll")
    public Map<Integer, Doctor> findAll(){
        return doctorMap;
    }

    @DeleteMapping("/deleteById/{id}")
    public Doctor deleteById(@PathVariable int id){
        try{
            if(!doctorMap.containsKey(id)) throw new RuntimeException();
            Doctor doctor = doctorMap.get(id);
            doctorMap.remove(id);
            return doctor;
        }catch (Exception e){
            System.out.println("Something went wrong");
            return null;
        }
    }
}

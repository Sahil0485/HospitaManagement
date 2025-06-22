package com.simpleproject.hospital_management.controller;

import com.simpleproject.hospital_management.model.Doctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
            doctorMap.put(doctorInput.getId(), doctorInput);
            System.out.println(doctorMap);
            return "Saved Successfully";
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "Request Failed";
        }

    }
}

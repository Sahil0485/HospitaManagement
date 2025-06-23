package com.simpleproject.hospital_management.controller;

import com.simpleproject.hospital_management.model.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/patient/apis")
public class PatientController {

    Map<Integer, Patient> patientMap = new HashMap<>();

    @PostMapping("/save")
    public String savePatient(@RequestBody Patient patientInput){
        try{

            if(patientMap.containsKey(patientInput.getId())) throw new RuntimeException(); //here we can create our own exception accordingly

            patientMap.put(patientInput.getId(), patientInput);
            System.out.println(patientMap);
            return "Saved successfully";

        }catch(Exception e){
            System.out.println(e);
            return "Request failed";
        }
    }
}

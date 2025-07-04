package com.simpleproject.hospital_management.model;

public class Doctor {

    private int id;
    private String name;
    private String email;
    private String gender;
    private String specialization;

    public Doctor() {
    }

    public Doctor(int id, String name, String email, String gender, String specialization) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}

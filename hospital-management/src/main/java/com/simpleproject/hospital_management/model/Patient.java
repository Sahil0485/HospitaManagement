package com.simpleproject.hospital_management.model;

public class Patient {

    private int id;
    private String name;
    private String address;
    private String DOB;
    private Doctor doctor;
    private Ward ward;

    public Patient() {
    }

    public Patient(int id, String name, String address, String DOB, Doctor doctor, Ward ward) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.DOB = DOB;
        this.doctor = doctor;
        this.ward = ward;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", DOB='" + DOB + '\'' +
                ", doctor=" + doctor +
                ", ward=" + ward +
                '}';
    }
}

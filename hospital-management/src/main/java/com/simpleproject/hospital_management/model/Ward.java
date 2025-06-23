package com.simpleproject.hospital_management.model;

public class Ward {

    private int id;
    private String wardType;
    private String charge;
    private Patient patient;

    public Ward() {
    }

    public Ward(int id, String wardType, String charge, Patient patient) {
        this.id = id;
        this.wardType = wardType;
        this.charge = charge;
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Ward{" +
                "id=" + id +
                ", wardType='" + wardType + '\'' +
                ", charge='" + charge + '\'' +
                ", patient=" + patient +
                '}';
    }
}

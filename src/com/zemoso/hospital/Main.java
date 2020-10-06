package com.zemoso.hospital;

public class Main {
    public static void main(String[] args) {
        String speciality="ent";
        MainHospital hospital=new HospitalHyd();
        HospitalDetails hd=hospital.appointment(speciality);
    }
}

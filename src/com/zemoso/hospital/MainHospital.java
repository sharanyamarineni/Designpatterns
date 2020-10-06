package com.zemoso.hospital;

public abstract class MainHospital {
    HospitalDetails appointment(String speciality){
        HospitalDetails hd;
        hd=create(speciality);
        hd.add_dep();
        hd.add_patient();
        return  hd;
    }
    abstract public HospitalDetails create(String speciality);
}

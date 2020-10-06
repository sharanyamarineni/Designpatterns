package com.zemoso.hospital;

public class HospitalHyd extends MainHospital{
    @Override
    public HospitalDetails create(String speciality) {

        if(speciality.equals("ent")) {
            return new Ent();
        }
        else if(speciality.equals("nuero")){
            return new HydNeuro();
        }
        else return  null;
    }
}

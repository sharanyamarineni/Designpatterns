package com.zemoso.hospital;

public class Creation {
    public HospitalDetails create(String speciality){
        HospitalDetails hd=null;
        if(speciality.equals("ent")){
            hd=new Ent();
        }
        else if(speciality.equals("neuro")){
            hd=new Neuro();
        }
        return hd;
    }
}

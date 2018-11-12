package com.labtehdent;

public class Doctor {
    private  String numeDoctor;
    private int idDoctor;

    public Doctor(String numeDoctor, int idDoctor) {
        this.numeDoctor = numeDoctor;
        this.idDoctor = idDoctor;
    }

    public String getNumeDoctor() {
        return numeDoctor;
    }

    public void setNumeDoctor(String numeDoctor) {
        this.numeDoctor = numeDoctor;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }
}

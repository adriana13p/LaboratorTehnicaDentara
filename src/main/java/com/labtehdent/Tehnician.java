package com.labtehdent;

public class Tehnician {
    private  String numeTechnician;
    private int idTechnician;
    private String tipTehnician;

    public Tehnician(String numeTechnician, int idTechnician, String tipTehnician) {
        this.numeTechnician = numeTechnician;
        this.idTechnician = idTechnician;
        this.tipTehnician = tipTehnician;
    }

    public String getNumeTechnician() {
        return numeTechnician;
    }

    public void setNumeTechnician(String numeTechnician) {
        this.numeTechnician = numeTechnician;
    }

    public int getIdTechnician() {
        return idTechnician;
    }

    public void setIdTechnician(int idTechnician) {
        this.idTechnician = idTechnician;
    }

    public String getTipTehnician() {
        return tipTehnician;
    }

    public void setTipTehnician(String tipTehnician) {
        this.tipTehnician = tipTehnician;
    }
}

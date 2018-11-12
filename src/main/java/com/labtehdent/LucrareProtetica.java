package com.labtehdent;

import java.util.Date;

public class LucrareProtetica {
    private String tipLucrareProtetica;
    private int idLucrareProtetica;
    private String culoare;
    private Date dataIntrare;
    private Date dataProba1;
    private Date dataProba2;
    private Date dataFinalizare;
    private String numePacient;
    private Doctor doctorLucrare;
    private Tehnician tehnicianLucrare1;
    private Tehnician technicianLucrare2;

    public LucrareProtetica(String tipLucrareProtetica, int idLucrareProtetica, String culoare, Date dataIntrare, Date dataProba1, Date dataProba2, Date dataFinalizare, String numePacient, Doctor doctorLucrare, Tehnician tehnicianLucrare1, Tehnician technicianLucrare2) {
        this.tipLucrareProtetica = tipLucrareProtetica;
        this.idLucrareProtetica = idLucrareProtetica;
        this.culoare = culoare;
        this.dataIntrare = dataIntrare;
        this.dataProba1 = dataProba1;
        this.dataProba2 = dataProba2;
        this.dataFinalizare = dataFinalizare;
        this.numePacient = numePacient;
        this.doctorLucrare = doctorLucrare;
        this.tehnicianLucrare1 = tehnicianLucrare1;
        this.technicianLucrare2 = technicianLucrare2;
    }

    public String getTipLucrareProtetica() {
        return tipLucrareProtetica;
    }

    public void setTipLucrareProtetica(String tipLucrareProtetica) {
        this.tipLucrareProtetica = tipLucrareProtetica;
    }

    public int getIdLucrareProtetica() {
        return idLucrareProtetica;
    }

    public void setIdLucrareProtetica(int idLucrareProtetica) {
        this.idLucrareProtetica = idLucrareProtetica;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Date getDataIntrare() {
        return dataIntrare;
    }

    public void setDataIntrare(Date dataIntrare) {
        this.dataIntrare = dataIntrare;
    }

    public Date getDataProba1() {
        return dataProba1;
    }

    public void setDataProba1(Date dataProba1) {
        this.dataProba1 = dataProba1;
    }

    public Date getDataProba2() {
        return dataProba2;
    }

    public void setDataProba2(Date dataProba2) {
        this.dataProba2 = dataProba2;
    }

    public Date getDataFinalizare() {
        return dataFinalizare;
    }

    public void setDataFinalizare(Date dataFinalizare) {
        this.dataFinalizare = dataFinalizare;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public Doctor getDoctorLucrare() {
        return doctorLucrare;
    }

    public void setDoctorLucrare(Doctor doctorLucrare) {
        this.doctorLucrare = doctorLucrare;
    }

    public Tehnician getTehnicianLucrare1() {
        return tehnicianLucrare1;
    }

    public void setTehnicianLucrare1(Tehnician tehnicianLucrare1) {
        this.tehnicianLucrare1 = tehnicianLucrare1;
    }

    public Tehnician getTechnicianLucrare2() {
        return technicianLucrare2;
    }

    public void setTechnicianLucrare2(Tehnician technicianLucrare2) {
        this.technicianLucrare2 = technicianLucrare2;
    }
}

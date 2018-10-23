package com.labtehdent;

import java.util.Date;

public class LucrareProtetica {
    private  String tipLucrareProtetica;
    private String idLucrareProtetica;
    private String culoare;
    private Date dataIntrare;
    private Date dataProba1;
    private Date dataProba2;
    private Date dataFinalizare;
    private String numePacient;

    public String getTipLucrareProtetica() {
        return tipLucrareProtetica;
    }

    public void setTipLucrareProtetica(String tipLucrareProtetica) {
        this.tipLucrareProtetica = tipLucrareProtetica;
    }

    public String getIdLucrareProtetica() {
        return idLucrareProtetica;
    }

    public void setIdLucrareProtetica(String idLucrareProtetica) {
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
}

package com.labtehdent;

import java.util.Date;

public class LucrareProtetica {
    public  String tipLucrareProtetica;
    public String idLucrareProtetica;
    public String culoare;
    public Date dataIntrare;
    public Date dataProba1;
    public Date dataProba2;
    public Date dataFinalizare;

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
}

package com.company;

public class Auto {
    private String szin="KEK";
    private int sebesseg=0;

    public Auto(){
    }

    public Auto( String szin ){
        this.szin = szin;
    }

    public int getSebesseg(){
        return sebesseg;
    }

    public void novelSebesseg(){
        this.sebesseg += 120;
    }

    public String toString(){
        return szin+" "+sebesseg;
    }



}

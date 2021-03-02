package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
    Auto comcompanyauto=new Auto ();
    Auto comcompanyauto2=new Auto ("SARGA" ,60);
    System.out.println(comcompanyauto);
    System.out.println(comcompanyauto2);
    System.out.println(comcompanyauto.getSebesseg());
    comcompanyauto.getSebesseg("0");

    }
}

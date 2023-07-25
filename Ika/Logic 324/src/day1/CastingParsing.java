package day1;

import java.security.SecureRandom;

public class CastingParsing {
    public static void main(String[] args) {
        double a = 12.5;

        //casting value a menjadi int
        int b = (int) a; // (int) adalah casting untuk mengganti a dari double menjadi int
        // casting digunakan ketika dari tipedata kapasitas yang lebih besar dimasukan ketipe data yang lebih kecil

        long c= b; // bisa karena long tipedata yang kapasitasnya lebih besar dibandingkan int.

        //parsing
        String strA = "120";
        String strB = "100";
        System.out.println(strA+strB);

        //parsing dari String ke Integer
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);
        System.out.println(intA+intB);

        // String ke long
        long longA = Long.parseLong(strA);
        System.out.println(longA);

        // integer ke string ada dua cara
        // 1. dengan menambahkan string kosong
        // 2. dengan menggunakan String.valueOf(intName)
        String strAB = intA + " ";
        String strBC = String.valueOf(intA);



    }
}

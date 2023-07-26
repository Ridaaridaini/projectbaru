package day1.Latihan;

import java.text.DecimalFormat;

public class Soal9 {
    public static void main(String[] args) {

        // mengubah nilai String ke bentuk doubel
        String a = "10";
        String b = "3";

        double doubelA = Double.valueOf(a);
        double doubelB = Double.valueOf(b);
        DecimalFormat df = new DecimalFormat("##.00");

        String hasilpembagian = df.format(doubelA/doubelB);

        System.out.println("hasil pembagian "+ a +" dengan "+ b + " adalah " + hasilpembagian);

    }
}

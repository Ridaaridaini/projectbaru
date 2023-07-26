package day1.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.00");
        String a = "10";
        String b = "3";
        double intA = Integer.parseInt(a);
        double intB = Integer.parseInt(b);

        System.out.println("Hasil " + (intA / intB));
    }
}

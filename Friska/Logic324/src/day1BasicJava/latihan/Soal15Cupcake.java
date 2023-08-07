package day1BasicJava.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal15Cupcake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Cupcake yang akan dibuat: ");
        int jumCupcake = input.nextInt();
        input.close();

        double jumTerigu = 125/15f;
        double jumGula = 100/15f;
        double jumSusu = 100/15f;

        //Desimal Float
        DecimalFormat df = new  DecimalFormat("##.00");

        String jumTerigu2 = df.format(jumTerigu*jumCupcake);
        String jumGula2 = df.format(jumGula*jumCupcake);
        String jumSusu2 = df.format(jumSusu*jumCupcake);
        System.out.println("Bahan yang diperlukan untuk Membuat "+jumCupcake+ " Cupcake adalah:");
        System.out.println(jumTerigu2 +" gr Terigu");
        System.out.println(jumGula2 + " gr Gula");
        System.out.println(jumSusu2 + " ml Susu");













}}
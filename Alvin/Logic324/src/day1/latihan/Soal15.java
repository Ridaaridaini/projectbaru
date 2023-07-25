package day1.latihan;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        double teriguSatuCup = 125/15f, gulaSatuCup = 100/15f,  susuSatuCup = 100/15f;

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan jumlah cupcake: ");
        int jumlahCupcake =  scanner.nextInt();

        scanner.close();

        double jumlahTerigu = Math.round(jumlahCupcake * teriguSatuCup);
        double jumlahGula = Math.round(jumlahCupcake * gulaSatuCup);
        double jumlahSusu = Math.round(jumlahCupcake * susuSatuCup);

        System.out.println((int)jumlahTerigu + " gr Terigu, " + (int)jumlahGula + " gr Gula dan " + (int)jumlahSusu + " mL Susu untuk " + (int)jumlahCupcake + " Cupcake");
    }
}

package day1.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        double teriguSatuCup = 125/15f, gulaSatuCup = 100/15f,  susuSatuCup = 100/15f;

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan jumlah cupcake: ");
        int jumlahCupcake =  scanner.nextInt();

        scanner.close();

        DecimalFormat decimal = new DecimalFormat("##.00");

        String jumlahTerigu = decimal.format(jumlahCupcake * teriguSatuCup);
        String jumlahGula = decimal.format(jumlahCupcake * gulaSatuCup);
        String jumlahSusu = decimal.format(jumlahCupcake * susuSatuCup);

        System.out.println(jumlahTerigu + " gr Terigu, " + jumlahGula + " gr Gula dan " +
                jumlahSusu + " mL Susu untuk " + jumlahCupcake + " Cupcake");
    }
}

package day1.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah cup : ");
        int cup = input.nextInt();

        double Terigu1 = 125/15f;
        double Pasir1 = 100/15f;
        double Susu1 = 100/15f;


        DecimalFormat df = new DecimalFormat("##.00");
        String Terigu = df.format(Terigu1 * cup);
        String Pasir = df.format(Pasir1 * cup);
        String Susu = df.format(Susu1 * cup);

        System.out.println("Takaran untuk Cupcake sebanyak : " + cup);
        System.out.println("Terigu  : " + Terigu + " gr");
        System.out.println("Gula    : " + Pasir + " gr");
        System.out.println("Susu    : " + Susu + " ml");

    }
}

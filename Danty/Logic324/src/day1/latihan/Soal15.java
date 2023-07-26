package day1.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double tepung = 125;
        double gula = 100;
        double susu= 100;


        double a = tepung/15; //ingat pembagian int dan double salah satu harus ada koma
        double b = gula/15;
        double c = susu/15;


        System.out.print("n = ");
        int n = input.nextInt();

        DecimalFormat df = new DecimalFormat("##.00");

        String tepung2 = df.format(a*n);
        String gula2 = df.format(b*n);
        String susu2 = df.format(c*n);

        System.out.println("tepung = " + tepung2);
        System.out.println("gula = " + gula2);
        System.out.println("susu = " + susu2);




    }
}

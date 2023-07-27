package day1.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Soal 15
125gr terigu, 100gr gula pasir, 100mL susu adalah resep untuk membuat 15 cupcake.
 */
public class Soal15 {

    public static void main(String[] args) {
        //per 15
        double terigu = 125;
        double gula = 100;
        double susu = 100;

        //satuan
        terigu = terigu/15;
        gula = gula/15;
        susu = susu/15;

        Scanner scanner = new Scanner(System.in);

        System.out.print("n : ");
        int n = scanner.nextInt();

        //Decimal Format
        DecimalFormat df = new DecimalFormat("##.00");

        String terigu2 = df.format(terigu * n);
        String gula2 = df.format(gula * n);
        String susu2 = df.format(susu * n);

        System.out.println("Untuk membuat cupcake sebanyak " + n
        + " dibutuhkan terigu sebanyak " + terigu2 + "gr "
        + ", gula sebanyak " + gula2 + "gr "
        + ", susu sebanyak " + susu2 + "ml");


    }

}

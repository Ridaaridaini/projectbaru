package day1.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        float terigu = 125/15f;
        float gula = 100/15f;
        float susu = 100/15f;

        Scanner userInput = new Scanner(System.in);

        System.out.print("jumlah capcake = ");
        int jumlah = userInput.nextInt();


        // decimal format
        DecimalFormat df = new DecimalFormat( "##.00");

        String jumlahterigu = df.format ( terigu * jumlah);
        String jumlahgula = df.format(gula * jumlah);
        String jumlahsusu = df.format(susu * jumlah);

        System.out.println("jumlah terigu = "+ jumlahterigu);
        System.out.println("jumlah gula = " + jumlahgula );
        System.out.println("jumlah susu = " + jumlahsusu);
    }
}

package day1.latihan;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        float terigu = 125/15;
        float gula = 100/15;
        float susu = 100/15;

        Scanner userInput = new Scanner(System.in);

        System.out.print(" jumlah capcake = ");
        int jumlah = userInput.nextInt();

        userInput.close();

        float jumlahterigu = jumlah * terigu;
        float jumlahgula = jumlah * gula;
        float jumlahsusu = jumlah * susu;
        System.out.println("jumlah terigu = "+(int) jumlahterigu);
        System.out.println("jumlah gula = " + (int)jumlahgula );
        System.out.println("jumlah susu = " + (int)jumlahsusu);
    }
}

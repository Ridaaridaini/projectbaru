package day1.Latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {

        //membandingkan keliling persegi dengan keliling persegi
        Scanner input = new Scanner(System.in);
        System.out.print("sisi x: ");
        int sisiX = input.nextInt();
        System.out.print("sisi y: ");
        int sisiY = input.nextInt();
        int kelilingPersegi = 4*sisiX;
        int kelilingSegitiga = 3*sisiY;

        input.close();

        System.out.println(kelilingPersegi==kelilingSegitiga);




    }
}

package day1.latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a= ");
        Integer a= input.nextInt();
        System.out.println("b= ");
        Integer b= input.nextInt();
        System.out.println("Nilai terbesar antara a dan b: " +Math.max(a,b));
    }
}

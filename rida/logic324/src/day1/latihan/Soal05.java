package day1.latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisa;
        System.out.println("x= ");
        Integer x= input.nextInt();
        System.out.println("y= ");
        Integer y= input.nextInt();
        sisa = x % y;
        System.out.println("Hasil sisa bagi x dengan y: "+sisa);


    }
}

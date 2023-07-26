package day1.latihan;

import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        double x,y;
        x= 125/15;
        y=100/15;
        Scanner input = new Scanner(System.in);
        System.out.print("Berapakah cupcake yang ingin anda buat = ");
        Integer z= input.nextInt();
        System.out.println("Maka Terigu yang dibutuhkan= "+(x*z)+"gram");
        System.out.println("Maka Gula yang dibutuhkan= "+(y*z)+"gram");
        System.out.println("Maka Susu yang dibutuhkan= "+(x*z)+"mL");

    }
}

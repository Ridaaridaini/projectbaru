package day1.Latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        //menentukan nilai maksimum
        Scanner input = new Scanner(System.in);
        System.out.print("masukan bilangan a: ");
        int a = input.nextInt();

        System.out.print("masukan bilangan b: ");
        int b = input.nextInt();

        int hasil = Math.max(a,b);
        input.close();

        System.out.println("nilai maksimum antara nilai " +a +" dan "+ b + " adalah "+ hasil);


    }
}

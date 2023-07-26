package day1.Latihan;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        //menentukan perpangkatan antara a dan b
        Scanner input = new Scanner(System.in);
        System.out.print("masukan bilangan a: ");
        int a = input.nextInt();

        System.out.print("masukan bilangan b: ");
        int b = input.nextInt();

        int hasil =(int) Math.pow(a,b);

        input.close();

        System.out.println("hasil dari " + a + " pangkat "+ b + " adalah " + hasil);
    }
}

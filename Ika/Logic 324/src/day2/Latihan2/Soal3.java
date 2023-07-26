package day2.Latihan2;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // mengitung lebar persegipanjang dengan kondisi tertentu
        int x,y,z;
        Scanner input = new Scanner(System.in);
        System.out.print("masukan panjang: ");
        x = input.nextInt();
        System.out.print("masukan lebar: ");
        y = input.nextInt();

        input.close();
        if (x<=1 || y<=1){
            System.out.println("masukan angka lain");
        }else {
            z = x*y;
            System.out.println("luas persegipanjang dengan panjang " + x +" dan lebar " + y+ " adalah " + z);
        }



    }
}

package day2.latihan2;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // mengitung lebar persegipanjang dengan kondisi tertentu

          int x,y,z;
          Scanner input = new Scanner(System.in);
//        System.out.print("masukan panjang: ");
//        x = input.nextInt();
//        System.out.print("masukan lebar: ");
//        y = input.nextInt();
//
//        input.close();
//        if (x<=1 || y<=1){
//            System.out.println("masukan angka lain");
//        }else {
//            z = x*y;
//            System.out.println("luas persegipanjang dengan panjang " + x +" dan lebar " + y+ " adalah " + z);
//        }
//

        System.out.print("masukan panjang: ");
        x = input.nextInt();

        if(x>1){
            System.out.print("masukan lebar: ");
            y= input.nextInt();
            if(y>1){
                z=x*y;
                System.out.print("luas persegipanjang dengan panjang " + x +" dan lebar " + y+ " adalah " + z);
            }else{
                System.out.println("masukan angka lain");
            }
        }else{
            System.out.println("masukan angka lain");
        }

    }
}

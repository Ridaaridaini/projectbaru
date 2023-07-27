package day2.latihan;

import java.util.Scanner;

public class Soal04 {
    /*Diketahui x adalah bilangan bulat yang diinputkan oleh user.
Buatlah program untuk menentukan x adalah bilangan ganjil atau genap!*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        Integer x= input.nextInt();
        if (x>=1 && x%2==0){
            System.out.println(x+ " merupakan bilangan genap");
        }else
            System.out.println(x+ " merupakan bilangan ganjil" );
    }

}

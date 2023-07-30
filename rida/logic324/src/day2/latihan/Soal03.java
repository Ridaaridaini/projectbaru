package day2.latihan;

import java.util.Scanner;

public class Soal03 {
    /*Diketahui sebuah persegi panjang dengan panjang x & lebar y. x dan y berupa inputan user bertipe data integer.
    Buatlah program untuk menghitung luas persegi panjang dengan output:
    "Luas persegi panjang dengan panjang x dan lebar y adalah z" atau
    "panjang yang diinputkan tidak boleh kurang dari 1" atau
    "lebar yang diinputkan tidak boleh kurang dari 1"		*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int z;
        System.out.print("Panjang dari persegi panjang ialah: ");
        Integer x= input.nextInt();
        if (x>=1) {
            System.out.print("Lebar dari persegi panjang ialah: ");
            Integer y = input.nextInt();
            if (y>=1){
                z= x*y;
                System.out.println("luas dari persegi panjang dengan panjang "+x+" dan lebar "+y+" ialah"+z);

            }
        }
        /*if (x>=1){
            z= x*y;
            System.out.println("luas dari persegi panjang dengan panjang "+x+" dan lebar "+y+" ialah"+z);*/
        /*if (y>=1){
            z= x*y;
            System.out.println("luas dari persegi panjang dengan panjang "+x+" dan lebar "+y+" ialah"+z);

        }*/


    }
}

package latihanday2;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        int z;

        System.out.println("masukan panjang x= ");
        int x = angka.nextInt();

        System.out.println("masukan lebar y= ");
        int y = angka.nextInt();

        z= x*y;

        if (x>=1 && y>=1){
            System.out.println("Luas persegi panjang dengan panjang " +x +" dan lebar " +y + " adalah " +z);
        } else if (x<1) {
            System.out.println("x tidak boleh kurang dari 1");
        }else{
            System.out.println("y tidak boleh kurang dari 1");
        }

    }
}

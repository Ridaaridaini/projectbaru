package latihanFT1;

import java.util.Scanner;

public class Soal07Challenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Keranjang 1 = ");
        int k1 = input.nextInt();

        System.out.print("Keranjang 2 = ");
        int k2 = input.nextInt();

        System.out.print("Keranjang 3 = ");
        int k3 = input.nextInt();

        System.out.print("Keranjang yang dibawa = Keranjang ");
        int keranjang = input.nextInt();


        if(keranjang == 1){

            System.out.println("Keranjang 1 di bawa ke pasar");

            System.out.print("Jumlah Buah = " + (k2 + k3));
        }
        else if (keranjang == 2){

            System.out.println("Keranjang 2 di bawa ke pasar");

            System.out.print("Jumlah Buah = " + (k1 + k3));

        } else if (keranjang == 3) {

            System.out.println("Keranjang 3 di bawa ke pasar");

            System.out.print("Jumlah Buah = " + (k1 + k2));
        }
        else{

            System.out.println("Tidak ada keranjang yang dibawa ke pasar");

            System.out.print("Jumlah Buah = " + (k1 + k2 + k3));

        }



    }
}

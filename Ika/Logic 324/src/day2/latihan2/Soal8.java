package day2.latihan2;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        //Alfin akan berbelanja dengan harga barang-barang sebagai berikut.
        //Jas	750.000
        //Celana Panjang	250.000
        //Kemeja	100.000
        //Kaos	50.000
        //Alfin akan membeli barang dengan harga paling mahal dengan uang yang dipunyai.
        //Buatlah program untuk membantu Alfin untuk menentukan barang apa yang akan dibeli jika uang alfin berupa inputan user.

        Scanner scan = new Scanner(System.in);
        System.out.print("uang Alfin: ");
        int uang = scan.nextInt();

        scan.close();
        if(uang>= 750000){
            System.out.println("Jas");
        } else if (uang >=250000 && uang< 750000) {
            System.out.println("Celana Panjang");
        }else if(uang >=100000 && uang < 250000){
            System.out.println("Kemeja");
        }else {
            System.out.println("kaos");
        }

    }
}

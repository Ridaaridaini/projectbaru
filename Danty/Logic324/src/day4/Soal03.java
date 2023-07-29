package day4;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

        //pakai while kalau misal soal tentang kondisi, karena tidak semua butuh perulangan angka

        Scanner input = new Scanner(System.in);

        System.out.print( "Masukkan Uang = ");
        int uang = input.nextInt();

        int i = 0;
        while (uang >= 50000){
            if(uang >= 750000){
                System.out.println("Pak Topik membeli Jas");
                uang = uang - 750000;
                continue;
            } else if(uang >= 350000){
                System.out.println("Pak Topik membeli Celana Panjang");
                uang = uang - 350000;
                continue;
            }else if(uang >= 250000){
                System.out.println("Pak Topik membeli Kemeja");
                uang = uang - 250000;
                continue;
            }else if(uang >= 100000){
                System.out.println("Pak Topik membeli Kaos");
                uang = uang - 100000;
                continue;
            }else if(uang >= 50000){
                System.out.println("Pak Topik membeli Celana Pendek");
                uang = uang - 50000;
                continue;
            }


        }

    }
}

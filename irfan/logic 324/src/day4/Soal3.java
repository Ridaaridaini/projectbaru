package day4;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        long n;
        boolean keputusan = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Uang = ");
        n = input.nextLong();

        while (keputusan){
            if( n>= 750000){
             System.out.println("Pak topik membeli jas");
             n = n - 750000;


            }else if( n >= 350000){
             System.out.println("pak topik beli celana panjang");
             n = n - 350000;


            } else if ( n>= 250000) {
             System.out.println("pak topik beli kemeja");
             n = n - 250000;

            } else if ( n>=100000) {
                System.out.println("pak topik beli kaos");
                n = n - 100000;

            }else if ( n>= 50000){
                System.out.println("pak topik beli celana pendek");
                n = n-50000;

            }else{
                keputusan=false;
                System.out.println("uang ga cukup");
            }
        }

        }
        
    }

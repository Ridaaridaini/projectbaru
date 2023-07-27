package day2.latihan2;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah uang kamu: ");
        int jumUang = input.nextInt();
        if (jumUang >= 750000){
            System.out.println("Uang kamu cukup untuk membeli jas ");

        }
        else if (jumUang >= 250000){
            System.out.println("Uang kamu cukup untuk membeli Celana Panjang");

        }
        else if(jumUang >= 50000){
            System.out.println("Uang kamu cukup untuk membeli kemeja ");
        }
        else if(jumUang >= 25000){
            System.out.println("Uang kamu cukup untuk membeli kaos");
        }
        else{
            System.out.println("Maaf uang kamu belum cukup untuk membeli item yang tersedia");
        }




    }
}

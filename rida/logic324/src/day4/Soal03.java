package day4;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan jumlah uang: ");
        Integer uang= input.nextInt();//850000
        while (uang >= 50000){
            if (uang>= 750000){
                System.out.println("Pak Topik membeli jas ");//output
                uang= uang -750000;
                continue;
            } else if (uang>=350000) {
                System.out.println("Pak Topik membeli celana panjang ");
                uang= uang -350000;
                continue;
            } else if (uang>=250000) {
                System.out.println("Pak Topik membeli kemeja ");
                uang= uang -250000;
                continue;
            } else if (uang >= 100000) {
                System.out.println("Pak Topik membeli kaos ");
                uang= uang -100000;
                continue;
            } else if (uang>=50000) {
                System.out.println("Pak Topik membeli celana pendek ");
                uang= uang -50000;
                continue;
            }
        }
    }
}

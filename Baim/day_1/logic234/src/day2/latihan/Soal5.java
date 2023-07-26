package day2.latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sembarang angka: ");
        int bilangan = scanner.nextInt()%7;

        if(bilangan == 1 || bilangan == 0){
            System.out.println("Senin");
        } else if(bilangan == 2){
            System.out.println("Selasa");
        } else if(bilangan == 3){
            System.out.println("Rabu");
        } else if(bilangan == 4){
            System.out.println("Kamis");
        } else if(bilangan == 5){
            System.out.println("Jumat");
        } else if(bilangan == 6){
            System.out.println("Sabtu");
        } else if (bilangan == 7){
            System.out.println("Minggu");
        } else {
            System.out.println("Masukkan bilangan desimal saja");
        }

        scanner.close();
    }
}

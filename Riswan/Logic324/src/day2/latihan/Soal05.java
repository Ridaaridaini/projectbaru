package day2.latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Input ; ");
        int user = input.nextInt();

        if((user % 7) == 1){
            System.out.println(" Senin");
        } else if ((user % 7) == 2) {
            System.out.println(" Selasa");
        } else if ((user % 7) == 3) {
            System.out.println(" Rabu");
        } else if ((user % 7) == 4) {
            System.out.println(" Kamis");
        } else if ((user % 7) == 5) {
            System.out.println(" Jum'at");
        } else if ((user % 7) == 6) {
            System.out.println(" Sabtu");
        } else if ((user % 7) == 0) {
            System.out.println(" Minggu");
        }else{
            System.out.println(" Input yang anda masukkan salah");
        }
    }
}

package day7.latihana;

import java.util.Random;
import java.util.Scanner;

public class Soal07Challenge {

    //Jika input selain 1 2 3 maka tambahkan semua keranjang
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int keranjang1 = 0;
        int keranjang2 = 0;
        int keranjang3 = 0;

        System.out.print("n : ");
        int n = scanner.nextInt();

        System.out.print("m : ");
        int m = scanner.nextInt();

        //Masukin keranjang secara random
        int kerKosong = random.nextInt(3);
        if (kerKosong == 0){
            kerKosong = random.nextInt(2);
            if (kerKosong == 0){
                keranjang2 = m;
                keranjang3 = n;
            } else {
                keranjang2 = n;
                keranjang3 = m;
            }
        } else if (kerKosong == 1){
            kerKosong = random.nextInt(2);
            if (kerKosong == 0){
                keranjang1 = m;
                keranjang3 = n;
            } else {
                keranjang1 = n;
                keranjang3 = m;
            }
        }else {
            kerKosong = random.nextInt(2);
            if (kerKosong == 0){
                keranjang1 = m;
                keranjang2 = n;
            } else {
                keranjang1 = n;
                keranjang2 = m;
            }
        }

        System.out.print("Keranjang dibawa (1/2/3) : ");
        int keranjangDibawa = scanner.nextInt();

        if (keranjangDibawa == 1){
            int total = keranjang2 + keranjang3;
            System.out.println("Jumlah Buah -> " + keranjang2 + " + " + keranjang3 + " = " + total);
        } else if(keranjangDibawa == 2){
            int total = keranjang1 + keranjang3;
            System.out.println("Jumlah Buah -> " + keranjang1 + " + " + keranjang3 + " = " + total);
        } else if (keranjangDibawa == 3){
            int total = keranjang2 + keranjang3;
            System.out.println("Jumlah Buah -> " + keranjang2 + " + " + keranjang3 + " = " + total);
        } else {
            int total = keranjang1 + keranjang2 + keranjang3;
            System.out.println("Jumlah Buah -> " + keranjang1 + " + " + keranjang2 + " + " + keranjang3 + " = " + total);
        }

        System.out.println("keranjang 1: " + keranjang1);
        System.out.println("keranjang 2: " + keranjang2);
        System.out.println("keranjang 3: " + keranjang3);


    }

}

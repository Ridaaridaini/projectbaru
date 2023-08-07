package day6.latihan6;

import java.util.Scanner;

public class Soal3CetakAwalanKapital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama:");
        String nama = input.nextLine();
        String [] arrNama = nama.split(" ");
        char huruf = 'a';
        String kapital;

        for (int i = 0; i < arrNama.length; i++) {
            huruf = arrNama[i].charAt(0);
            kapital = (huruf+"").toUpperCase();
            System.out.print(kapital);

        }


    }
}

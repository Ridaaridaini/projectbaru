package day6.latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama? ");
        String nama = input.nextLine();
        String[] namaUser = nama.split(" ");
        for (int i = 0; i < namaUser.length; i++) {
            String kapitalNama = namaUser[i].toUpperCase();
            char tampungChar = kapitalNama.charAt(0);
            System.out.print(tampungChar);

            for (int j = 0; j < 3; j++) {
                System.out.print("*");

            }
             kapitalNama = namaUser[i].toLowerCase();

            char tampung = kapitalNama.charAt(namaUser[i].length()-1);
            System.out.print(tampung+ " ");


        }
    }
}

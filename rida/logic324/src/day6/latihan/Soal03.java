package day6.latihan;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama? ");
        String nama = input.nextLine();
        String[] namaUser= nama.split(" ");
        for (int i = 0; i < namaUser.length; i++) {
            String kapitalNama=namaUser[i].toUpperCase();
            char tampungChar= kapitalNama.charAt(0);
            System.out.print(tampungChar);

        }

    }
}
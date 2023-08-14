package day6StringManipulation.latihan6;

import java.util.Scanner;

public class Soal1CetakKalimatkeBawah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat :");
        String kalimat = input.nextLine();

        String [] arrKalimat = kalimat.split(" ");

        for (int i = 0; i < arrKalimat.length ; i++) {
            System.out.println(arrKalimat[i]);
            
        }


    }
}

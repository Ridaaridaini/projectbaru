package day6.latihan;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan kalimat? ");
        String kalimat= input.nextLine();
        String[] arrKalimat= kalimat.split(" ");
        for (int i = 0; i < arrKalimat.length; i++) {
            System.out.println(arrKalimat[i]);
        }
    }
}

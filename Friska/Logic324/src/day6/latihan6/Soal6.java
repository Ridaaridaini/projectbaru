package day6.latihan6;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata ");
        String kata = input.nextLine();
        String kata2 = "";
        String [] strKata = kata.split("");
        for (int i =strKata.length-1 ; i >= 0; i--) {
            kata2 = kata2 + strKata[i];

        }if (kata.equalsIgnoreCase(kata2)){
            System.out.println("kata palindrom");
        }else{
            System.out.println("bukan kata palindrom");
        }



    }
}

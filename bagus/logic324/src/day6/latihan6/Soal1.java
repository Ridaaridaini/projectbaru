package day6.latihan6;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan kalimat: ");
        String str = input.nextLine();

//        System.out.println(str.split(" "));

        String[] strSplit= str.split(" ");
        for (int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i]);
        }
    }
}

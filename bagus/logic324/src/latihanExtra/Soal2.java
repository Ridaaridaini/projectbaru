package latihanExtra;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan nama: ");
        String nama = input.nextLine();

        String [] namaSplit = nama.split(" ");

        for (int i = 0; i < namaSplit.length; i++) {
            System.out.println(namaSplit[i]);
        }

        for (int i = 0; i < namaSplit.length; i++) {
            String depan = namaSplit[i];
            char depanChar = depan.charAt(0);
            System.out.print(depanChar);

            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            //belakang
            String str2 = namaSplit[i].toLowerCase();
            char str2At = str2.charAt(namaSplit[i].length() - 1);
            System.out.println(str2At + " ");
        }
    }
}


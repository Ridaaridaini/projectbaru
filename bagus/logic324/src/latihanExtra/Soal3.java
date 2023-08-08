package latihanExtra;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan record: ");
        String buah = input.nextLine();
        String buahReplace = buah.replace(" ", "");

        String [] buahSplit =buahReplace.split(",");

        for (int i = 0; i < buahSplit.length; i++) {
            System.out.println(buahSplit[i]);
        }

        for (int i = 0; i < buahSplit.length; i++) {
            String str2 = buahSplit[i].toLowerCase();
            char str2At = str2.charAt(buahSplit[i].length() - 1);
            System.out.println(str2At + " ");

            String buahAT = String.valueOf(str2At);
            System.out.println(buahAT);
        }
    }
}

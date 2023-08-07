package day6.latihan6;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sembarang Teks Kalimat = ");
        String teks = scanner.nextLine();

        String kalimat = teks.replace(" ", "").toLowerCase();
        String[] arrN = kalimat.split("");
        String karakterUnik = arrN[0];

        for (int i = 0; i < (arrN.length-1); i++) {

            for (int j = i+1; j < arrN.length; j++) {

                if (!arrN[i].equals(arrN[j])){
                    if (karakterUnik.toString().contains(arrN[j])){
                        continue;
                    }
                    karakterUnik = karakterUnik + arrN[j];
                }
            }

        }
        System.out.println(karakterUnik);
        System.out.println(karakterUnik.length() + " karakter");
    }
}

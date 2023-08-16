package Latihan1;

import java.util.Scanner;

public class SMsoal08 {
    public static void main(String[] args) {
        //"Input
        //Susilo Bambang Yudhoyono
        //Output
        //S***o B***g Y***o"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kalimat = scanner.nextLine().split(" ");

        for (int i = 0; i < kalimat.length; i++) {
            String[] arrKal = kalimat[i].split("");

            for (int j = 0; j < arrKal.length; j++) {
                if (j == 0) {
                    System.out.print(arrKal[j].toUpperCase());
                } else if (j == arrKal.length - 1) {
                    System.out.print(arrKal[j]);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}

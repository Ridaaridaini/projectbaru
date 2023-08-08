package day10;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();

        String[] arrKal = kalimat.split(" ");
        for (int i = 0; i < arrKal.length; i++) {
            String[] splitKal = arrKal[i].split("");
            for (int j = 0; j < splitKal.length; j++) {
                if(j==0){
                    String b= splitKal[j].toUpperCase();
                    System.out.print(b);
                } else if (j == splitKal.length-1) {
                    System.out.print(splitKal[j]);
                }else {
                    System.out.print("*");
                }

            }

            System.out.print(" ");
        }
    }
}

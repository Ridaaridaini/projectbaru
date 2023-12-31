package latihanB;

import java.util.Scanner;

public class Soal03Challenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input n: ");
        int n = scanner.nextInt();

        if (!(n>=1 && n<=100)){
            System.out.println("nilai n harus antara 1 dan 100");
            System.exit(0);
        }

        int angka = 100, count = 0;

        while (angka>=10){

            String[] arrAngka = String.valueOf(angka).split("");
            Double[] singleAngka = new Double[arrAngka.length];

            double total = 0;
            for (int i = 0; i < arrAngka.length; i++) {
                singleAngka[i] = Double.parseDouble(arrAngka[i]);

                total = total + Math.pow(singleAngka[i], 2.0);
            }

            if (total == 1) {
                count++;
                System.out.println(angka + " adalah \"Si Angka 1\"");

                if (count==n){
                    System.exit(0);
                }
            }

            if (total == 10){
                count++;
                System.out.println(angka + " adalah \"Si Angka 10\"");

                if (count==n){
                    System.exit(0);
                }
            }

            while (total >= 10){
                int intTotal = (int)total;
                String[] arrTotal = String.valueOf(intTotal).split("");
                Double[] singleTotal = new Double[arrTotal.length];
                total = 0;

                for (int i = 0; i < arrTotal.length; i++) {
                    singleTotal[i] = Double.parseDouble(arrTotal[i]);

                    total = total + Math.pow(singleTotal[i], 2.0);
                }
                if (total == 1) {
                    count++;
                    System.out.println(angka + " adalah \"Si Angka 1\"");

                    if (count==n){
                        System.exit(0);
                    }
                }

                if (total == 10){
                    count++;
                    System.out.println(angka + " adalah \"Si Angka 10\"");

                    if (count==n){
                        System.exit(0);
                    }
                }
            }

            angka++;
        }

    }

}

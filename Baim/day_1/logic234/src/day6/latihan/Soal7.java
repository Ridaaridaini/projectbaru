package day6.latihan;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String[] inputString = scanner.nextLine().toLowerCase().replace(" ", "").split("");

        String kalimatUnik ="";

        for (int i = 0; i < inputString.length; i++) {
            if(i == 0){
                kalimatUnik += inputString[i];
            } else if (!kalimatUnik.contains(inputString[i])){
                kalimatUnik += inputString[i];
            }
        }

        System.out.println(kalimatUnik);
        System.out.println(kalimatUnik.length());
        scanner.close();
    }
}

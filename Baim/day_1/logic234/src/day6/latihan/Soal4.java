package day6.latihan;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String[] inputString = scanner.nextLine().toLowerCase().split(" ");

        String sensor = "";
        for (int i = 0; i < inputString.length; i++) {
            String[] temp = inputString[i].split("");
            for (int j = 0; j < temp.length; j++) {
                if(j == 0 || j == temp.length - 1){
                    sensor += temp[j];
                    if(j == temp.length - 1){
                        sensor += "\n";
                    }
                } else {
                    sensor += "*";
                }
            }
        }

        System.out.println(sensor);
        scanner.close();
    }
}

package latihanC;

import java.util.Arrays;
import java.util.Scanner;

public class Nomor10 {

    public static void main(String[] args) {

        String vokal = "aiueo";
        String hasilVokal = "";
        String hasilKonsonan = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("input: ");
        String[] input = scanner.nextLine().toLowerCase().replace(" ", "").split("");

        Arrays.sort(input);

        for (int i = 0; i < input.length; i++) {

            if (vokal.contains(input[i])){
                hasilVokal += input[i];
            }else {
                hasilKonsonan += input[i];
            }

        }

        System.out.println("Vokal: " + hasilVokal);
        System.out.println("Konsonan: " + hasilKonsonan);




    }

}

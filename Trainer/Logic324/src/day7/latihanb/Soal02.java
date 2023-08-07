package day7.latihanb;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        String n = scanner.nextLine();
        n = n.toLowerCase().replace(" ", "");

        String hurufVokal = "";
        String hurufKonsonen = "";

        String[] arrN = n.split("");
        Arrays.sort(arrN);

        for (int i = 0; i < arrN.length; i++) {
            String huruf = arrN[i];
            if (huruf.equalsIgnoreCase("a") ||
                    huruf.equalsIgnoreCase("i") ||
                    huruf.equalsIgnoreCase("u") ||
                    huruf.equalsIgnoreCase("e") ||
                    huruf.equalsIgnoreCase("o")
            ){
                hurufVokal = hurufVokal + huruf;
            } else {
                hurufKonsonen = hurufKonsonen + huruf;
            }
        }

        System.out.println("Huruf Vokal : " + hurufVokal);
        System.out.println("Huruf Konsonan : " + hurufKonsonen);

    }
}

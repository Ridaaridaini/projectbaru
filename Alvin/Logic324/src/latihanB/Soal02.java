package latihanB;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input n: ");
        String n = scanner.nextLine();

        String[] arrN = n.toLowerCase().replace(" ", "").split("");

        Arrays.sort(arrN);
        String vokalList = "aiueo";
        String vokal = "";
        String konsonan = "";

        for (int i = 0; i < arrN.length; i++) {
            if (vokalList.contains(arrN[i])){
                vokal += arrN[i];
            }else {
                konsonan += arrN[i];
            }
        }
        System.out.println("Vokal: " + vokal); //setiap huruf vokal ganti dipisah oleh strip
        System.out.println("Konsonan: " + konsonan);

    }

}

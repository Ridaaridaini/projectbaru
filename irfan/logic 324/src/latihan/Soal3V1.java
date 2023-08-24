package latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3V1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inputan N = ");
        String n = scanner.nextLine().toLowerCase();       //Sample Case

        String[] arrN = n.replace(" ","").split(""); // {"s","a","m","p",l","e","c","a","s","e"}
        Arrays.sort(arrN);              // a a c e e l m p s s

        String hurufVokal = "aiueo";
        String vokal = "";
        String konsonan = "";

                                                // arrN = panjang 10
        for (int i = 0; i < arrN.length; i++) { // i = 0 1 2 3 4 5 6 7 8 9 10
                if (hurufVokal.contains(arrN[i])) { // false
                    vokal = vokal + arrN[i]; // a a e e
                } else {
                    konsonan = konsonan + arrN[i]; //c l m p s s
                }

        }
        System.out.println("Huruf vokal: " + konsonan ); // aaee
        System.out.println("Huruf konsonan: " + konsonan.length()  ); // clmpss
    }
}




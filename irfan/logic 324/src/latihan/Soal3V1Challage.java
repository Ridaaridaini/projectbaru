package latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3V1Challage {
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
                    if(!vokal.contains(arrN[i])) {
                        if (vokal.length() > 0) {
                            vokal += "-";
                        }
                    }
                    vokal += arrN[i];
                }else{
                    if(!konsonan.contains(arrN[i])){
                        if(konsonan.length()>0) {
                            konsonan += "-";
                        }
                    }
                    konsonan += arrN[i];
                }

        }
        System.out.println("Huruf vokal: " + vokal); // aaee
        System.out.println("Huruf konsonan: " + konsonan); // clmpss
    }
}




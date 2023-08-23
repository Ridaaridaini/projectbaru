package day15;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Modus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String angkaStr = scanner.nextLine();
        String[] arrAngkaStr = angkaStr.split(" ");
        Integer[] arrAngkaInt = new Integer[arrAngkaStr.length];

        //Convert ke integer
        for (int i = 0; i < arrAngkaStr.length; i++) {
            arrAngkaInt[i] = Integer.parseInt(arrAngkaStr[i]);
        }

        //sorting asc
        Arrays.sort(arrAngkaInt);

        //1 1 1 2 2 3 3 3 3
        int calonModus = -1;
        int jmlModus = 0;

        int sainganModus = -1;
        int jmlSainganModus = 0;
        //Cari modus
        for (int i = 0; i < arrAngkaInt.length; i++) {
            int angkaSekarang = arrAngkaInt[i];
            if (calonModus == -1 || calonModus == angkaSekarang){
                calonModus = angkaSekarang;
                jmlModus++;
            } else {
                if (sainganModus == angkaSekarang){
                    jmlSainganModus++;
                } else {
                    jmlSainganModus = 0;
                }
                sainganModus = angkaSekarang;

                if (jmlSainganModus > jmlModus){
                    calonModus = angkaSekarang;
                    jmlModus = jmlSainganModus;
                }
            }
        }
        System.out.println(calonModus);
    }
}

package latihanC;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("sembarang teks kalimat: ");
        String[] kalimat = scanner.nextLine().toLowerCase().replace(" ","").split("");

        Arrays.sort(kalimat);
        String specialChar = "[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-1234567890]";
        String susunUlang = "";

        for (int i = 0; i < kalimat.length; i++) {

            if (specialChar.contains(kalimat[i])){
                continue;
            }

            susunUlang += kalimat[i];

        }

        System.out.println(susunUlang);

    }

}

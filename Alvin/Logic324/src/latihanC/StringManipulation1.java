package latihanC;

import java.util.Scanner;

public class StringManipulation1 {

    public static void main(String[] args) {

        String uniqueChar = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("kalimat: ");
        String[] kalimat = scanner.nextLine().toLowerCase().replace(" ","").split("");
        String specialChar = "[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-1234567890]";

        for (int i = 0; i < kalimat.length; i++) {

            if (uniqueChar.contains(kalimat[i]) || specialChar.contains(kalimat[i])){
                continue;
            }

            uniqueChar += kalimat[i];

        }

        System.out.println(uniqueChar);
        System.out.println(uniqueChar.length() + " karakter");

    }

}

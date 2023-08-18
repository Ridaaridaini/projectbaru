package latihanC;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation1 {

    public static void main(String[] args) {

        String uniqueChar = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("kalimat: ");
        String[] kalimat = scanner.nextLine().toLowerCase().replace(" ","").split("");
        String specialChar = "[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-1234567890]";

        // perulangan yang dugunakan untuk cek apakah karakter index[i] contains dengan karakter index[j]
        // dalam sebuah kalimat
        for (int i = 0; i < kalimat.length; i++) {
            // cek apakah karakter sudah di contains atau karakter merupakan spesial karakter
            // jika karakter memenuhi salah satu kondisi maka skip
            if (uniqueChar.contains(kalimat[i]) || specialChar.contains(kalimat[i])){
                continue;
            }
            // mengecek apakah karakter index ke [i] contains dengan karakter index ke [j]
            // jika contains (mengandung) maka cetak karakter ke [j]
            for (int j = 0; j < kalimat.length; j++) {
                if (kalimat[i].contains(kalimat[j])){
                    uniqueChar += kalimat[j];
                }
            }
        }

        // short karkater pada kalimat berdasarkan alfabet
        String[] arrUniqueCharSort = uniqueChar.split("");
        Arrays.sort(arrUniqueCharSort);

        for (int i = 0; i < arrUniqueCharSort.length; i++) {
            System.out.print(arrUniqueCharSort[i]);
        }

        System.out.println();

        System.out.println(uniqueChar);
        System.out.println(uniqueChar.length() + " karakter");

    }

}

package day6.latihan;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("sembarang kalimat: ");
        String kalimat = scanner.nextLine();

        String replaceSpaceKalimat = kalimat.replace(" ", "").toLowerCase();
        String[] arrKalimat = replaceSpaceKalimat.split("");
        String specialKarakter = arrKalimat[0];

        for (int i = 0; i < (arrKalimat.length-1); i++) { // halo
                                                          // halo

            for (int j = i+1; j < arrKalimat.length; j++) {

                    if (!arrKalimat[i].equals(arrKalimat[j])){
                        if (specialKarakter.toString().contains(arrKalimat[j])){
                            continue;
                        }
                        specialKarakter += arrKalimat[j];
                    }
            }

        }
        System.out.println(specialKarakter);
        System.out.println(specialKarakter.length() + " karakter");
    }

}

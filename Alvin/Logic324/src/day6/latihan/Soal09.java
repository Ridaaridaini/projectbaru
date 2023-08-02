package day6.latihan;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {
        boolean substring = false;

        Scanner scanner = new Scanner(System.in);

        String wordSatu = scanner.nextLine();
        String wordDua = scanner.nextLine();

        String[] arrWordSatu = wordSatu.split("");
        String[] arrWordDua = wordDua.split("");

        for (int i = 0; i < arrWordSatu.length; i++) {
            for (int j = 0; j < arrWordDua.length; j++) {

                if (arrWordSatu[i].contains(arrWordDua[j])) {
                    substring = true;
                }

            }
        }

        if (substring){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}

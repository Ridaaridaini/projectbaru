package day10;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation2Urutanhuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kalimat = scanner.nextLine().toLowerCase().replace(" ","").split("");
        String kal = "";
        String spesialChar = "[]$&+,:;=\\\\\\\\\\\\\\\\?@#|/'<>.^*()%!-1234567890";



        for (int i = 0; i < kalimat.length; i++) {
            if(kal.contains(kalimat[i]) || spesialChar.contains(kalimat[i])){
                continue;
            }

            for (int j = 0; j < kalimat.length; j++) {
                if(kalimat[i].contains(kalimat[j])){
                    kal= kal + kalimat[j];
                }
            }
        }

        String[] arrkalSort = kal.split("");
        Arrays.sort(arrkalSort);

        for (int i = 0; i < arrkalSort.length; i++) {
            System.out.print(arrkalSort[i]);
        }
        System.out.println();
        System.out.println(kal);



    }
}

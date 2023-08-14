package simulasiFT1;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan panjang deret: ");
        int deret = input.nextInt();

        int [] arrDeret1 = new int [deret];
        int [] arrDeret2 = new int[deret];

        int bil1 = 3;
        for (int i = 0; i < arrDeret1.length; i++) {
            arrDeret1[i] = bil1;
            System.out.print(arrDeret1[i]+ " ");
            bil1 = bil1 + 3 - 1;
        }
        System.out.println();

        int bil2 = 4 / 2;
        for (int i = 0; i < arrDeret2.length; i++) {
            arrDeret2[i] = bil2;
            System.out.print(arrDeret2[i]+ " ");
            bil2 = bil2 + 4 / 2;

        }

        System.out.println();

        int [] tambah = new int[deret];
        for (int i = 0; i < deret; i++) {
            if(i % 2 == 0){
               tambah[i]= arrDeret1[i] + arrDeret2[i];
               if (i == arrDeret1.length - 1){
                   System.out.print(arrDeret1[i] + "+" + arrDeret2[i]);
               }else {
                   System.out.print(arrDeret1[i] + "+" + arrDeret2[i] +" ; ");
               }

            }else {
                tambah[i] = arrDeret1[i] + arrDeret2[i];
                if (i == arrDeret1.length - 1){
                    System.out.print(arrDeret1[i] + "+" + arrDeret2[i]);
                } else {
                    System.out.print(arrDeret1[i] + "+" + arrDeret2[i] + " ; ");
                }

            }
        }

        System.out.println();

        for (int i = 0; i < tambah.length; i++) {
            System.out.print(tambah[i]+ " ");
        }
    }
}

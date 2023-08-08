package day10;

import java.util.Scanner;

public class Soal01Deret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan panjang deret: ");
        int deret = scanner.nextInt();

        int[] arrDeret = new int[deret];
        int[] kelipatanTiga = new int[deret];
        int[] kelipatanDua = new int[deret];

        int a=3;
        int b=0;
        int[] sum=new  int[deret];

        //kelipatan tiga min 1
        System.out.print("kelipatan tiga kurang 1 : ");
        for (int i = 0; i < kelipatanTiga.length; i++) {
            kelipatanTiga[i] = a;
            a = (a+3)-1;
            System.out.print(kelipatanTiga[i] + " ");
        }


        System.out.println();
        //kelipatan -2
        System.out.print("kelipatan (-2x1) : ");
        for (int i = 0; i < kelipatanDua.length; i++) {
            b=b-2;
            kelipatanDua[i] = b;
            System.out.print(kelipatanDua[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arrDeret.length; i++) {
            if(i%2==0){
                if(i == arrDeret.length-1){
                    System.out.print(kelipatanTiga[i] + " + " + "("+ kelipatanDua[i]+ ") " + "  ");
                }else {
                    System.out.print(kelipatanTiga[i] + " + " + "("+ kelipatanDua[i]+ ") " +   " ; ");
                }
            } else if (i % 2 != 0) {
                if(i == arrDeret.length-1){
                    System.out.print(kelipatanTiga[i] + " + " + " ("+ kelipatanDua[i]+ ") " + "  ");
                }else {
                    System.out.print(kelipatanTiga[i] + " + " + " ("+ kelipatanDua[i]+ ") " +  " ; ");
                }

            }

        }

        System.out.println();
        for (int i = 0; i < arrDeret.length; i++) {
            sum[i] = kelipatanTiga[i] + kelipatanDua[i];
            System.out.print(sum[i] + " ");

        }

    }
}

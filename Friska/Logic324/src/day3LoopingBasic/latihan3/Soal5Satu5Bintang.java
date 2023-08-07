package day3LoopingBasic.latihan3;

import java.util.Scanner;

public class Soal5Satu5Bintang {
    public static void main(String[] args) {
        //Tips untuk ngitung bintang"
        //Tentuin dimana atau i ke berapa bintang selalu muncul
        Scanner input = new Scanner(System.in);
        System.out.println("n :");
        int n = input.nextInt();
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 2){
                System.out.print("* ");
            }else{
                System.out.print(a +" ");

            }
            a = a+4;

        }

    }

}



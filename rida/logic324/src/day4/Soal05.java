package day4;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("masukkan bilangan X: ");
        Integer x= input.nextInt();
        for (int i = 0; i < x; i++) {
            if (i%3==0 && i!=0)
                if (i%2==0) {
                    System.out.print(i + " ");
                }
            continue;
        }
    }



}

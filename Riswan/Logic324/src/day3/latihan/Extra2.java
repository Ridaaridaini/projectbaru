package day3.latihan;

import java.util.Scanner;

public class Extra2 {
    public static void main(String[] args) {
        int n=7;
        int awal = 2;

        for (int i = 0; i < n; i++) {
            if(i%2==1){
                System.out.print(" * ");
            }else {
                System.out.print(awal+" ");
                awal = awal +2;
            }

        }
    }
}

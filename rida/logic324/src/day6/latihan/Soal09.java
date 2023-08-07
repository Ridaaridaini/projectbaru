package day6.latihan;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int d=0;
        System.out.println("Masukkan kata ke-1");
        String a=input.nextLine().toLowerCase();
        System.out.println("Masukkan kata ke-2");
        String[] b=input.nextLine().toLowerCase().split("");
        for (int i = 0; i < b.length; i++) {
            String c=b[i];
            if (a.contains(c)){
               d=d+1;
            }
        }
        System.out.println();
        if (d!=0){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
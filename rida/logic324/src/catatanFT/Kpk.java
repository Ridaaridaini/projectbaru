package catatanFT;

import java.util.Scanner;

public class Kpk {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan nilai a: ");
        int a= input.nextInt();
        System.out.println("masukkan nilai b: ");
        int b=input.nextInt();
        int c=0;
        for (int i = 0; i < 100; i++) {
            c=c+a;
            if(c%b==0){
                System.out.println("Bilangan prima: "+c);
                break;
            }
        }
    }
}

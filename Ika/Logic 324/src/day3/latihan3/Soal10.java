package day3.latihan3;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        //"n = 7
        //3        9        27        XXX        243        729        2187
        //"
        //"n = 8
        //3        9        27        XXX        XXX          729        2187        6561
        //"

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scan.nextInt();
        scan.close();

        int a=3;
        for (int i = 0; i < n; i++) {
            if (n%2 == 0){
                if(i == n/2 || i==(n/2)+1){
                    System.out.print (" XXX ");
                }else{
                    System.out.print(a + " ");
                }
                a= a*3;
            }else{
                if(i==n/2){
                    System.out.print(" XXX ");
                }else {
                    System.out.print(a + " ");
                }
                a= a*3;
            }

        }
    }
}

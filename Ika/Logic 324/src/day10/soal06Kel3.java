package day10;

import java.util.Scanner;

public class soal06Kel3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret kelipatan 3: ");
        int deret = scanner.nextInt();

        int[] arrDeret = new int[deret];
        int a= 3;
        for (int i = 0; i < arrDeret.length; ) {
            a=a+3;
//            System.out.print(a + " ");
            if(a%2==0){
                System.out.print(a + " ");
                i++;
            }
        }
    }
}

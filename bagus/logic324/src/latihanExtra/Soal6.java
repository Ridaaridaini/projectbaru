package latihanExtra;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan panjang deret: ");
        int n = input.nextInt();

        int bil = 3;
        for (int i = 0; i < n; i++) {
            if(bil%2==0){
                System.out.println(bil);
            }
            bil = bil + 3;
        }
    }
}

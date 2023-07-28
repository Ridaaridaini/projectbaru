package day3.latihan;

import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("deret n: ");
        int n = scanner.nextInt();

        //variable x hanya untuk dicetak
        int x = 1;
        for (int i = 0; i < n; i++) {

            if (i % 3 == 2){
                System.out.print("* ");

            }else{
                System.out.print(x + " ");

                x = x + 4;
            }

        }

    }

}

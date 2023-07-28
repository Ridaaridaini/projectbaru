package day3.latihan;

import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("deret n: ");
        int n = scanner.nextInt();

        int x = 3;
        for (int i = 0; i < n; i++) {

                if (n % 2 == 1){
                    if(i == n / 2){
                        System.out.print("XXX ");
                    }else {
                        System.out.print(x + " ");
                    }
                    x = x * 3;
                }else{
                    if(i == n/2 || i == (n/2)-1){
                        System.out.print("XXX ");
                    }else {
                        System.out.print(x + " ");
                    }
                    x = x * 3;
                }

            }


        }

    } // 0 1 2 XXX 4 5 6
    //


package simulasiFT1;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        int kpk = a;

        while(kpk%a != 0 || kpk%b != 0){

            kpk = kpk + a;

            }

        System.out.println(kpk + " ");


        System.out.print("Panjang Deret : ");
        int n = input.nextInt();

        int deret = kpk;

        for (int i = 0; i < n; i++) {

            System.out.print(deret + " ");
            deret = deret + kpk;
        }

        }



    }


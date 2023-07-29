package day4;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("P = ");
        int p = input.nextInt();

        System.out.print("S = ");
        int s = input.nextInt();

        //String p1 = p + " ? " + s;

        //String s1 = s + " ? " + p;

        System.out.print("P" + " ? " + p);

        System.out.println();

        System.out.print("S" + " ? " + s);

        System.out.println();

        int a = 1;

        for(int i = 0; i < p; i++){
            System.out.print(a + " ");
            a = a+1;

        }
        System.out.println();

        int b = s;
        for (int j = 0; j < p ; j++) {

            System.out.print(b + " ");
            b=b+1;



            }


            }

        }



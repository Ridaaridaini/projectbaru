package simulasiFT1;

import java.util.Scanner;

public class Soal9GanjilGenapHasil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang deret :");
        int n= input.nextInt();
        int a = 2;
        int b = 2;
        int[] deret = new int[n];
        int[] deret1 = new int[n];
        int jum = 0;


        for (int i = 0; i < deret.length; i++) {
            deret[i]=a;
            //System.out.print(deret[i]+" ");
            a=a+3;
        }//System.out.println();
        for (int i = 0; i < deret.length; i++) {
            deret1[i]=b;
            //System.out.print(deret1[i]+" ");
            b=b+2;

        }
        //System.out.println();
        for (int i = 0; i < deret.length; i++) {
            jum = deret[i]+deret1[i];
            System.out.print(jum+ " ");

        }




    }
}


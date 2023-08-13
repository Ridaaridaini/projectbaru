package simulasiFT1;

import java.util.Scanner;

public class Soal9GanjilGenapHasil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang deret :");
        int deret = input.nextInt();
        int a = 0;
        int b = 1;
        int[] arrGanjil = new int[deret];
        int[] arrGenap = new int[deret];
        int jumGanjilGenap = 0;

        System.out.print("Deret Genap : ");
        for (int i = 0; i < deret; i++) {
            System.out.print(a + " ");
            arrGenap[i] = a;
            a = a + 2;

        }System.out.println();

        System.out.print("Deret Ganjil: ");
        for (int i = 0; i < deret; i++) {
            System.out.print(b +" ");
            arrGanjil[i] = b;
            b = b + 2;

        }
        System.out.println();
        for (int i = 0; i < arrGanjil.length; i++) {
            jumGanjilGenap = arrGanjil[i]+arrGenap[i];
            System.out.print(jumGanjilGenap+ " ");

        }




    }
}


package day5.latihan;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Input panjang array: ");
        Integer p= input.nextInt();
        int[] arrA= new int[p];
        int jumlah=0;
        int j=0;
        System.out.print("Deret Genap: ");
        for (int i = 0; i < arrA.length; i++) {
            arrA[i]=j;
            System.out.print(arrA[i]+ " ");
            j=j+2;
        }
        int[] arrB= new int[p];
        int q=1;
        System.out.println();
        System.out.print("Deret Ganjil: ");
        for (int i = 0; i < arrB.length; i++) {
            arrB[i]=q;
            System.out.print(arrB[i]+ " ");
            q=q+2;
        }
        System.out.println();
        for (int i = 0; i < p; i++){
            if (i==p-1){
                System.out.print(arrA[i]+" + "+arrB[i]);
            }else
                System.out.print(arrA[i]+" + "+arrB[i]+"; ");
        }
        System.out.println();
        for (int i = 0; i < p; i++) {
            jumlah= arrA[i]+arrB[i];
            System.out.print(jumlah+ ", ");


        }

    }
}

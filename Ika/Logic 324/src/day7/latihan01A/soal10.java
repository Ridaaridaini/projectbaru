package day7.latihan01A;

import java.util.Scanner;

public class soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n= scanner.nextInt();

        int[] arrA= new int[n];
        int[] genap=new int[n];
        int[] ganjil= new int[n];

        int genapA = 0;
        int ganjilA=1;
        int output=0;

        for (int i = 0; i < genap.length; i++) {
            genap[i]=genapA;
            System.out.print(genap[i] + " ");
            genapA=genapA+2;
        }

        System.out.println();
        for (int i = 0; i < ganjil.length; i++) {
            ganjil[i]=ganjilA;
            System.out.print(ganjil[i] + " ");
            ganjilA=ganjilA+2;
        }

        System.out.println();
        for (int i = 0; i < arrA.length; i++) {
            if(i== arrA.length-1){
                System.out.print(genap[i] + " + " + ganjil[i] + " ");
            }else{
                System.out.print(genap[i] + " + " + ganjil[i] + "; ");
            }
        }

        System.out.println();
        for (int i = 0; i < arrA.length; i++) {
            output=genap[i] + ganjil[i];
            if(i< arrA.length-1){
                System.out.print(output + ",");
            }else {
                System.out.print(output + " ");
            }
        }

    }
}

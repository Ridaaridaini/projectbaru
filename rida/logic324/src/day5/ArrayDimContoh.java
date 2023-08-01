package day5;

import java.util.Scanner;

public class ArrayDimContoh {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Deklarasi Array
        int[] arrA= new int[3];

        //Kombinasi input menggunakan perulangan
        for (int i = 0; i < arrA.length; i++) { //0, 1, 2
            System.out.println("Input index ke-" + i + ":");
            arrA[i] = scanner.nextInt();

        }
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");

        }
        System.out.println();
        //Cetak menggunakan koma
        for (int i = 0; i < arrA.length; i++) {
            if (i== arrA.length -1){
                System.out.print(arrA[i]);
            }else{
                System.out.print(arrA[i]+ ", ");
            }

        }
    }
}

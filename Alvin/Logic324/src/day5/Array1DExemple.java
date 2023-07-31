package day5;

import java.util.Scanner;

public class Array1DExemple {

    public static void main(String[] args) {

        //deklarais array
        int[] arrA = new  int[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrA.length; i++) {
            System.out.print("arrA ke-" + i + ": ");
            arrA[i] = scanner.nextInt();
        }

        System.out.println("Hai");

        // output menggunakan perulangan array

        for (int i = 0; i < arrA.length; i++) {

            if (i == arrA.length-1){
                System.out.println(arrA[i]);
            }else {
                System.out.print(arrA[i] + ",");
            }

        }

    }

}

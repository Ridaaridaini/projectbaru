package day5.latihan;

import java.util.Scanner;

public class soal04 {
    public static void main(String[] args) {

        //"Di inputkan P sebagai panjang array.
        //Isi array dengan element bilangan ganjil,
        //Kemudian cetak semua element array tersebut
        //Output : 1 3 5 7 9 11 13
        //"

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan panjang array: ");
        int b= scanner.nextInt();
        int[] arrA= new int[b];

        int a=1;
        for (int i = 0; i <arrA.length; i++) {
            arrA[i]=a;
            a= a+2;
        }
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");

        }



    }
}

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
            arrA[i]=a;//memasukan nilai a kedalam array
            a= a+2; //mengganti a yang ada tambah dengan 2, diulang-ulang lagi
            System.out.print(arrA[i] + " ");//memanggil array yang sudah dimasukan
        }

        //memanggil array yang sudah dimasukan
//        for (int i = 0; i < arrA.length; i++) {
//            System.out.print(arrA[i] + " ");
//
//        }



    }
}

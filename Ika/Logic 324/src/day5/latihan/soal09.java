package day5.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class soal09 {
    public static void main(String[] args) {
        //"Diketahui terdapat sebuah array integer dengan panjang array 5.
        //Lalu diinputkan nilai untuk setiap elemen dalam array.
        //Berapakah Nilai minimum & maksimal dari penjumlahan 4 dari 5 element dalam array?
        //Contoh:
        //Input : 1, 4, 2, 5, 3
        //Output : 10 dan 14
        //Penjelasan
        //4 element terkecil adalah 1 + 2 + 3 + 4 = 10
        //4 element terbesar adalah 2 + 3 + 4 + 5 = 14
        //Note : Boleh menggunakan fungsi Arrays.sort
        //"
        Scanner scanner = new Scanner(System.in);
        int[] arrA = new int[5];
        int jumlahTerkecil = 0;
        int jumlahTerbesar =0 ;

        for (int i = 0; i < arrA.length; i++) {
            System.out.print("input: ");
            arrA[i] = scanner.nextInt();
        }

        System.out.println();
        Arrays.sort(arrA);// untuk mengurutkan 4 indeks terkecil dan 4 indeks terakhir
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < arrA.length-1; i++) {
            jumlahTerkecil =jumlahTerkecil + arrA[i];
        }
        System.out.println("jumlah terkecil 4 indeks terkecil "+jumlahTerkecil);

        for (int i = 0; i < arrA.length; i++) {
            if(i==0){
                continue;
            }else {
                jumlahTerbesar = jumlahTerbesar + arrA[i];
            }
        }
        System.out.println("jumlah terbesar 4 indek terbesar "+jumlahTerbesar);




    }
}

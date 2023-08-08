package day5Array.latihan5;

import java.util.Arrays;
import java.util.Scanner;

public class Soal9Sort {
    public static void main(String[] args) {
        // untuk menjumlahkan bilangan
        int jumMax = 0;
        int jumMin = 0;

        //1. inputkan nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");

        //2. panjang array 5
        int [] arrInput = new int[5];

        //3. inputkan nilai array
        for (int i = 0; i < 5; i++) {
            arrInput[i] = input.nextInt();
        }
        Arrays.sort(arrInput);

        for (int i = 0; i < 4; i++) {
            jumMin += arrInput[i];
            jumMax += arrInput[arrInput.length -1 - i];

            
        }
        System.out.println();
        System.out.println("4 elemen terkecil adalah: "+jumMin);
        System.out.println("4 elemen terbesar adalah: "+jumMax);



    }
}

package day5.latihanday5;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {


        int[] arrA = {2,4,6,8,10,12,14};

        int a = arrA.length-1;
        //ingat karena indeks dimulai dari 0, maka indeks terakhir data terakhir adalah panjang data - 1.

        for (int i =0;  i < arrA.length; i++) {
            System.out.print(arrA[a]  + " ");
            a = a-1;

        }



        }
    }


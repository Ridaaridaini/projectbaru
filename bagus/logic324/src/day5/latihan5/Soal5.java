package day5.latihan5;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 8};


        Scanner input = new Scanner(System.in);
        System.out.print("masukan nilai yang di cari: ");
        int number = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("angka ditemukan pada index ke- " + i);
                break;
//            }else {
//                System.out.println("nilai "+ number + " yang di cari tidak ada dalam deret");
//            }

            }

        }
        int j = 0;
        if (j == number){
            System.out.print("nilai "+number +" tidak terdapat di dalam deret");
        }
//
    }
}

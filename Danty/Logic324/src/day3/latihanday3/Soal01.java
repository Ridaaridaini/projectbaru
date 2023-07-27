package day3.latihanday3;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        int a = 1; //variabel pembantu agar fungsi for tidak banyak diubah

        for(int i = 0; i < n; i++){ //tugas variabel i untuk mencetak 7 angka deret

            System.out.print(a + " ");
            a = a+2;
        }

    }
}

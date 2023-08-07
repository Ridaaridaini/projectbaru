package day9.presentasi;

import java.util.Scanner;

public class Soal1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan n: ");
        int n = input.nextInt();//5

        for (int i = 1; i <= n; i = i+2) {//1 3 5 7
            System.out.print(i+ " ");
        }//baris pertama adalah bil ganjil <= n

        System.out.println();

        for (int i = 2; i <= n; i = i+2) { //2 4 6
            System.out.print(i+ " ");
        }
//output ganjil 1 3 5

// output genap   2 4
    }
}

package latihanC;

import java.util.Scanner;

public class Nomor5v2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // inputkan string
        System.out.print("kata/kalimat: ");
        char[] arrWord = scanner.nextLine().toLowerCase().replace(" ", "").toCharArray();
        char[] arrChar = "abcdefghijklmnopqrstuvwxyz".toCharArray();


        // inputkan panjang array n
        System.out.print("n: ");
        int n = scanner.nextInt();

        if (!(n >= 0 && n <= 100)){
            System.out.print("n merupakan array dengan panjang antara 0 - 100");
            System.exit(0);
        }

        int[] arrN = new int[n];

        // menginisiasi array n yang akan dicocokan dengan string
        for (int i = 0; i < n; i++) {
            System.out.print("n ke-" + (i+1) + ": ");
            arrN[i] = scanner.nextInt();
        }

        // deklarasi array denga tipe data bolean untuk menampung hasil komparasi value
        boolean[] arrCompare = new boolean[arrWord.length];

        //mencocokan value
        for (int i = 0; i < arrWord.length; i++) {

        }


    }

}

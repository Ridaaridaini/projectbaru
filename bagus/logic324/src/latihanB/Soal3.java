package latihanB;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan n: ");
        int n = input.nextInt();
        int angka1 = 0;



        for (int i = 0; i < n; i++) {
            angka1 = 101 + i;
//            System.out.println(angka1);
        }

        String strAngka = String.valueOf(angka1);
        String[] strAngkaSplit = strAngka.split("");

        for (int i = 0; i < strAngkaSplit.length; i++) {

            double strDouble = Double.parseDouble(strAngkaSplit[i]);
            System.out.println(Math.pow(strDouble,2));
        }


    }
}

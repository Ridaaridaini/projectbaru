package latihanMandiri;

import java.util.Scanner;

public class perulanganMenjumlahkan {
    public static void main(String[] args) {

        // sistem yang menjumlahkan angka yang looping
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyak baris n: ");
        int n= input.nextInt();
        int a= 1;
        int temp =0;


        for (int i = 0; i < n; i++) {
            a= a*2;
            System.out.print(a + " ");
            temp=a+a -2;
        }
        System.out.println("jumlah a: " + temp);


    }
}

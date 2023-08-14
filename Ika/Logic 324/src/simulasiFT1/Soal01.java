package simulasiFT1;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        //Sebuah deret terbentuk dari nilai yang sama dari kelipatan bilangan a dan b.
        // tampilkan deret tersebut jika panjang deretnya adalah n.

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scanner.nextInt();

        System.out.print("masukan angka kelipatan a: ");
        int a = scanner.nextInt();

        System.out.print("masukan angka kelipan b: ");
        int b= scanner.nextInt();

        int c= a+b;
        for (int i = 0; i < n; i++) {
            System.out.print(c + " ");
            c= c+(a+b);
        }

    }

}

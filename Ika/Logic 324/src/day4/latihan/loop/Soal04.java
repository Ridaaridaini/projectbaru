package day4.latihan.loop;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        //"Problem     : angka ganjil genap
        //input           : n
        //Constraint  : n adalah bilangan bulat positif
        //Output        : 2 baris angka, di mana baris pertama adalah deret bilangan ganjil yang lebih kecil sama dengan n
        //                      dan baris kedua adalah deret bilangan genap yang lebih kecil sama dengan n
        //Example      : Input n : 10
        // output 1 3 5 7 9
        //2 4 6 8 10
        //
        //Input n : 5
        //output : 1 3 5
        //   2 4

        Scanner input = new Scanner(System.in);
        System.out.print("maukan panjang deret n: ");
        int n = input.nextInt();
        input.close();

        for (int i = 0; i <= n; i++) {
            if (i%2 != 0){
                System.out.print(i+ " ");
            }else {
                continue;
            }
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            if (i%2==0){
                System.out.print(" "+i + " ");
            }else{
                continue;
            }

        }
    }
}

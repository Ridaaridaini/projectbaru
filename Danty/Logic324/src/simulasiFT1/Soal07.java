package simulasiFT1;

import java.util.Scanner;

public class Soal07 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Panjang Sisi Persegi = ");
        int n = input.nextInt();

        System.out.print("Panjang Rusuk Kubus = " );
        int m = input.nextInt();


        int luasPersegi = n*n;
        int luasPermukaanKubus = 6*m*m;
        int banyakPersegi = luasPermukaanKubus/luasPersegi;

        System.out.print("Banyak Persegi untuk membuat sebuah kubus = " + banyakPersegi);




    }
}

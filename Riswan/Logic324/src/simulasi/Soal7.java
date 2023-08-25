package simulasi;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sisi n persegi :");
        int sisiPersegiN = input.nextInt();
        System.out.print("sisi m kubus :");
        int sisiKubusM = input.nextInt();

        int luasPermukaanKubus = sisiKubusM * sisiKubusM *6;
        int luasPersegi = sisiPersegiN *sisiPersegiN;

        int banyakPersegi = 0;
        int tampung = luasPersegi;
        while (tampung<=luasPermukaanKubus){
            luasPermukaanKubus = luasPermukaanKubus-luasPersegi;
            banyakPersegi = banyakPersegi+1;
        }
        if(luasPermukaanKubus !=0){
            banyakPersegi = banyakPersegi+1;
        }
        System.out.println("banyak persegi : " + banyakPersegi);
//        System.out.println(luasPermukaanKubus);
    }
}

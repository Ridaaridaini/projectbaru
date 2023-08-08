package day6.latihanday6;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat 1 : ");
        String k1 = input.nextLine();

        System.out.print("Kalimat 2 : ");
        String k2 = input.nextLine();


        //Salah satu inputan di split
        String[] arrK2 = k2.split("");

        //Membuat variabel bantu untuk menampung hasil split
        String bantu = "";
        int a = 0;

        //Masukkan nilai array arrK2 ke dalam variabel bantu
        for (int i = 0; i < arrK2.length; i++) {

            bantu = arrK2[i]; //ini mengganti nilai di dalam string bantu dengan nilai array satu2, bukan mengisi full langsung semua kata

            if(k1.contains(bantu)){

                a = 1;
                break;

            }
        }

        if (a == 1) {

            System.out.print("YES");

        } else if (a == 0) {

            System.out.print("NO");
        }
    }
}









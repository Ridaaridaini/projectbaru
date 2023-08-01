package day4;

import java.util.Random;
import java.util.Scanner;

public class KartuGambar {
    public static void main(String[] args) {

        //Buat object scanner & random
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        //Logic Nyawa
        System.out.print("Masukkan nyawa : ");
        int n =  scanner.nextInt();
        int nyawaPlayer = n;
        int nyawaKomputer = n;

        for (;nyawaPlayer > 0 && nyawaKomputer > 0;) {

            System.out.print("Masukkan Tawaran : ");
            int jmlTawaran = scanner.nextInt();

            int A = randomGenerator.nextInt(10);
            int B = randomGenerator.nextInt(10);

            System.out.print("Pilih 1. A atau 2. B (1 atau 2) : ");
            int pilihan = scanner.nextInt();

            System.out.println("Kotak A : "+A+ ",Kotak B :"+B);
            if (pilihan == 1){
                if ( A > B ){
                    //Menang
                    nyawaPlayer =  nyawaPlayer + jmlTawaran;
                    nyawaKomputer = nyawaKomputer - jmlTawaran;


                } else if ( A < B) {
                    // Kalah
                    nyawaPlayer =  nyawaPlayer - jmlTawaran;
                    nyawaKomputer = nyawaKomputer + jmlTawaran;
                    System.out.println("Anda kalah");
                }else{
                    //Draw
                    System.out.println("Draw");
                }
            } else if (pilihan == 2) {
                if ( B > A ){
                    nyawaPlayer =  nyawaPlayer + jmlTawaran;
                    nyawaKomputer = nyawaKomputer - jmlTawaran;

                    System.out.println("Kotak A : "+A+ ",Kotak B :"+B);
                } else if ( B < A) {
                    // Kalah
                    nyawaPlayer =  nyawaPlayer - jmlTawaran;
                    nyawaKomputer = nyawaKomputer + jmlTawaran;
                    System.out.println("Anda kalah");
                }else{
                    //Draw
                    System.out.println("Draw");
                }
                System.out.println("Nyawa Player :"+ nyawaPlayer);
                System.out.println("Nyawa Komputer :"+ nyawaKomputer);

                System.out.println();

                //Logic opsi menyerah
                System.out.println("Lanjut main? (YA/TIDAK");
                scanner.nextLine();
                String jawaban = scanner.nextLine();
                if(jawaban.equalsIgnoreCase("tidak")){
                    break;
                }
            }
            System.out.println("Permainan Selesai");
        }

    }
}

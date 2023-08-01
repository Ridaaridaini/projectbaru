package day4.latihan4;

import java.util.Random;
import java.util.Scanner;

public class PembahasanNomor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();

        //Logic nyawa
        System.out.println("Masukkan Nyawa :");
        int n = input.nextInt();
        int nyawaPlayer = n;
        int nyawaKomputer = n;

        for (;nyawaPlayer > 0 && nyawaKomputer > 0;){
            System.out.println("Masukkan jumlah tawaran : ");
            int jumTawaran = input.nextInt();

            int A = randomGenerator.nextInt(10);
            int B = randomGenerator.nextInt(10);

            System.out.println("Pilih 1. A atau 2.B (1 atau 2): ");
            int pilihan = input.nextInt();

            System.out.println("Kotak A : "+ A + ",Kotak B: " + B);
            if(pilihan == 1){
                if (A > B){
                    nyawaPlayer = nyawaPlayer + jumTawaran;
                    nyawaKomputer = nyawaKomputer - jumTawaran;
                    System.out.println("Anda menang!");
                }else if (A < B){
                    nyawaPlayer = nyawaPlayer - jumTawaran;
                    nyawaKomputer = nyawaKomputer + jumTawaran;

                }else{
                    System.out.println("Draw");

                }
            } else if (pilihan == 2) {
                if(B > A){
                    nyawaPlayer = nyawaPlayer + jumTawaran;
                    nyawaKomputer = nyawaKomputer - jumTawaran;
                    System.out.println("Anda menang!");

                } else if (B < A) {
                    nyawaPlayer = nyawaPlayer - jumTawaran;
                    nyawaKomputer = nyawaKomputer + jumTawaran;
                    System.out.println();

                    // logic opsi menyerah
                    System.out.println("Lanjut main? (YA/TIDAK)");
                    String jawaban = input.nextLine();
                    if (jawaban.equalsIgnoreCase("tidak")){
                        break;
                    }


                }else {
                    System.out.println("Draw");

                }

            }else{
                System.out.println("Anda salah pilih ulangi lagi");
            }
            System.out.println("Nyawa Player:"+nyawaPlayer);
            System.out.println("Nyawa Komputer:"+nyawaKomputer);
        }
        System.out.println("Permainan Selesai");

    }
}

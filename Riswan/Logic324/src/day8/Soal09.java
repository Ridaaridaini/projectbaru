package day8;

import java.util.Random;
import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int komputer,user,kartu,taruhan,pilihKotak;
        boolean hasil = true;
        System.out.println("Masukkan jumlah Kartu : ");
        kartu = input.nextInt();

        komputer = kartu;
        user = kartu;

        while (hasil){
            System.out.print("Jumlah Taruhan : ");
            taruhan = input.nextInt();
            Random random = new Random();

            int kotakA = random.nextInt(10);
            int kotakB = random.nextInt(10);

            System.out.println("Kotak A Pilih : 1 " );
            System.out.println("Kotak B Pilih : 2 " );
            pilihKotak = input.nextInt();

            if(pilihKotak == 1){
                if(kotakA > kotakB){
                    user = user + taruhan;
                    komputer = komputer - taruhan;
                    System.out.println("Selamat anda menang");
                }else if(kotakA < kotakB) {
                    user = user - taruhan;
                    komputer = komputer + taruhan;
                    System.out.println("Coba lagi ya");
                }else {
                    System.out.println(" anda imbang");
                }
            } else if (pilihKotak == 2 ) {
                if(kotakA < kotakB){
                    user = user + taruhan;
                    komputer = komputer - taruhan;
                    System.out.println("selamat anda menang");
                }else if (kotakA > kotakB){
                    user = user - taruhan;
                    komputer = komputer + taruhan;
                    System.out.println("Coba lagi ya");
                }else {
                    System.out.println(" anda imbang");
                }
            }else {
                System.out.println("Masukkan  pilihan dengan benar");
            }
            System.out.println(" Sisa Kartu Anda        : " + user);
            System.out.println(" Sisa Kartu Komputer    : " + komputer);
            System.out.println();

            if(user <1){
                System.out.println("Anda kalah Coba lagi ya");
                break;
            }else if(komputer < 1){
                System.out.println(" Anda menang ");
                break;
            }
            System.out.println("Lanjut? (ya/tidak)");
            input.nextLine();
            String jawaban = input.nextLine();
            if(jawaban.equalsIgnoreCase("tidak")){
                hasil = false;
            }
        }
    }
}

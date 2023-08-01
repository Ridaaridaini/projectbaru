package day4;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Class Scanner
        Random rG = new Random(); //Class Random

        System.out.print("n = "); //jumlah nyawa
        int n = input.nextInt();

        int nyawaKomputer = n;
        int nyawaPlayer = n;



        for(;nyawaPlayer > 0 && nyawaKomputer >0;){ //program masih dijalankan kalau mereka berdua masih punya nyawa

            System.out.print("m = ");
            int m = input.nextInt(); //jumlah tawaran

            int kotakA = rG.nextInt(10); //ini batasnya 0-9 yaaa, tapi memang ditulis 10
            int kotakB = rG.nextInt(10);

            System.out.print("Pilih Kotak (Kotak 1 : A dan Kotak 2 : B) : ");
            int pilihKotak = input.nextInt();

            System.out.print("Kotak A = " + kotakA + ", Kotak B = " + kotakB);

            if(pilihKotak == 1){
                if(kotakA>kotakB){
                    //Menang
                    nyawaPlayer = nyawaPlayer + m;
                    nyawaKomputer = nyawaKomputer - m;
                    System.out.println();
                    System.out.print("Anda Menang");

                } else if (kotakA < kotakB){
                    //Kalah
                    nyawaPlayer = nyawaPlayer - m;
                    nyawaKomputer = nyawaKomputer + m;
                    System.out.println();
                    System.out.print("Anda Kalah");
                } else {
                    //Draw (Seri)
                    System.out.println();
                    System.out.print("Draw"); //karena nyawanya gak kurang gak nambah
                }

            } else if(pilihKotak == 2){
                if(kotakB > kotakA){
                    //Menang
                    nyawaPlayer = nyawaPlayer + m;
                    nyawaKomputer = nyawaKomputer - m;
                    System.out.print("Anda Menang");

                } else if (kotakB < kotakA){
                    //Kalah
                    nyawaPlayer = nyawaPlayer - m;
                    nyawaKomputer = nyawaKomputer + m;
                    System.out.print("Anda Kalah");
                } else {
                    //Draw (Seri)
                    System.out.print("Draw"); //karena nyawanya gak kurang gak nambah

            }

        }else {
                System.out.print("Anda salah pilih, ulangi lagi");

            }
            System.out.println();

            System.out.print("Nyawa Player = " + nyawaPlayer);

            System.out.println();

            System.out.print("Nyawa Komputer = " + nyawaKomputer);

            //logic opsi menyerah

            System.out.println();
            System.out.print("Lanjut main? (YA/TIDAK) : ");
            input.nextLine();
            String jawaban = input.nextLine();
            if(jawaban.equalsIgnoreCase("Tidak")){

            } break;

        }
        System.out.println();
        System.out.print("Permainan Selesai");
        }


        }













//        while (namaKotak.equals("A")) {
//            System.out.print("Kotak A = " + kotakA);
//            System.out.print("Kotak B = " + kotakB);
//            if (kotakA > kotakB) {
//                nyawaPlayer = nyawaPlayer + nyawaKomputer;
//                continue;
//            } else if (kotakA < kotakB) {
//                nyawaPlayer = nyawaPlayer - nyawaKomputer;
//                continue;
//            }
//        }
//    }
//}
//            if (namaKotak.equals("B")) {
//                System.out.print("Kotak A = " + kotakA);
//                System.out.print("Kotak B = " + kotakB);
//                if (kotakB > kotakA) {
//                    nyawaPlayer = nyawaPlayer + nyawaKomputer;
//                    continue;
//                } else if (kotakB < kotakA) {
//                    nyawaPlayer = nyawaPlayer - nyawaKomputer;
//                    continue;
//                }
//                }
//            break;






//            if (nyawaKomputer == 0) {
//                System.out.print("YOU WIN");
//                }
//            if (nyawaPlayer == 0) {
//                System.out.print("YOU LOSE");










//           else if(kotakA < kotakB){
//                int nyawaPlayer = nyawaKomputer - nyawaPlayer;
//                System.out.print(nyawaPlayer);

//            int player = n+m;
//            System.out.print(player);
//
//        }else if(kotakA < m){
//            int computer = m-n;
//            System.out.print(computer);


        //        System.out.println();
//
////        int kotakB = rG.nextInt(9);
////        System.out.print("Kotak B : " + kotakB);

            //System.out.print("Kotak A : " + kotakA);












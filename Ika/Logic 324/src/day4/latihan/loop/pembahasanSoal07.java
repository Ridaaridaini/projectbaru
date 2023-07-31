package day4.latihan.loop;

import java.util.Random;
import java.util.Scanner;

public class pembahasanSoal07 {
    public static void main(String[] args) {
        //
        Scanner scanner= new Scanner(System.in);
        Random RandomGenerator = new Random();

        System.out.print("masukan nyawa: ");
        int n = scanner.nextInt();

        int nyawaPlayer = n;
        int nyawaKomputer =n;

        for(; nyawaPlayer>0 && nyawaKomputer>0;){
            System.out.print("masukan tawaran: ");
            int jumlahTawaran = scanner.nextInt();

            int A = RandomGenerator.nextInt(10);
            int B = RandomGenerator.nextInt(10);

            System.out.print(" pilih 1. A atau 2. b (1 atau 2) : ");
            int pilihan = scanner.nextInt();

            System.out.println("kotak A: " + A + " kotak B: "+ B);

            if(pilihan==1){
                if(A>B){
                    //menang
                    nyawaPlayer= nyawaPlayer+jumlahTawaran;
                    nyawaKomputer = nyawaKomputer -jumlahTawaran;
                    System.out.println("anda menang!");
                } else if (A<B) {
                    //KALAH
                    nyawaPlayer= nyawaPlayer-jumlahTawaran;
                    nyawaKomputer = nyawaKomputer +jumlahTawaran;
                    System.out.println("anda kalah!");
                }else{
                    //draw
                    System.out.println("draw");
                }

            } else if (pilihan==2) {
                if(B>A){
                    //menang
                    nyawaPlayer= nyawaPlayer+jumlahTawaran;
                    nyawaKomputer = nyawaKomputer -jumlahTawaran;
                    System.out.println("anda menang!");
                } else if (B<A) {
                    //KALAH
                    nyawaPlayer= nyawaPlayer-jumlahTawaran;
                    nyawaKomputer = nyawaKomputer +jumlahTawaran;
                    System.out.println("anda kalah!");
                }else {
                    //draw
                    System.out.println("draw");
                }

            }else{
                System.out.println("Anda salah pilih! ulangi lagi");
            }

            System.out.println("nyawa player: " + nyawaPlayer);
            System.out.println("nyawa Komputer: " + nyawaKomputer);

            System.out.println("lanjut main? (YA/TIDAK) ");
            scanner.nextLine();
            String jawaban = scanner.nextLine();

            if(jawaban.equalsIgnoreCase("TIDAK")){
                break;
            }

        }

        System.out.println("Permainan selesai");
    }
}

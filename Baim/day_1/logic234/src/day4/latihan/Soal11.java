package day4.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        int player, komputer, a, b;
        boolean bermain = true;

        System.out.print("Masukkan jumlah kartu: ");
        int jumlahKartu = scanner.nextInt();
        player = jumlahKartu;
        komputer = jumlahKartu;

        while (bermain) {
            if (player <= 0) {
                System.out.println("You lose");
                bermain = false;
            } else if (komputer <= 0) {
                System.out.println("You win");
                bermain = false;
            }
            System.out.print("Masukkan tawaran: ");
            int tawaran = scanner.nextInt();

            scanner.nextLine();
        
            System.out.print("Pilih kotak a / b: ");
            String pilihan = scanner.nextLine();

            a = randomGenerator.nextInt(10);
            b = randomGenerator.nextInt(10);

            switch (pilihan) {
                case "a":
                    if (a > b) {
                        player += tawaran;
                        komputer -= tawaran;
                        System.out.println("Tebakan anda benar, kartu anda bertambah sebesar: ");
                        System.out.println("Player: " + player);
                        System.out.println("Komputer: " + komputer);
                    } else if (a < b){
                        player -= tawaran;
                        komputer += tawaran;
                        System.out.println("Tebakan anda salah, sisa kartu: ");
                        System.out.println("Player: " + player);
                        System.out.println("Komputer: " + komputer);
                    } else {
                        System.out.println("Draw");
                    }
                    break;
                case "b":
                    if (b > a) {
                        player += tawaran;
                        komputer -= tawaran;
                        System.out.println("Tebakan anda benar, kartu anda bertambah sebesar: ");
                        System.out.println("Player: " + player);
                        System.out.println("Komputer: " + komputer);
                    } else if(b > a){
                        player -= tawaran;
                        komputer += tawaran;
                        System.out.println("Tebakan anda salah, sisa kartu: ");
                        System.out.println("Player: " + player);
                        System.out.println("Komputer: " + komputer);
                    } else {
                        System.out.println("Draw");
                    }
                    break;
                default:
                    System.out.println("Masukan sesuai format");
                    break;
            }

            System.out.print("Lanjut bermain? (y/n): ");
            String menyerah = scanner.nextLine();
            if(menyerah.equalsIgnoreCase("y")){
                bermain = false;
            }
        }

        scanner.close();
    }
}

package latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal9Challenge {
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
                break;
            } else if (komputer <= 0) {
                System.out.println("You win");
                break;
            }

            System.out.print("Masukkan tawaran: ");
            int tawaran = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Pilih kotak a / b: ");
            String pilihan = scanner.nextLine();

            a = randomGenerator.nextInt(10);
            b = randomGenerator.nextInt(10);

            if (pilihan.equals("a")) {
                if (a > b) {
                    player += tawaran;
                    komputer -= tawaran;
                    System.out.println("Tebakan anda benar, kartu anda bertambah sebesar: ");
                } else if (a < b) {
                    player -= tawaran;
                    komputer += tawaran;
                    System.out.println("Tebakan anda salah, sisa kartu: ");
                } else {
                    System.out.println("Draw");
                    player -= tawaran;
                    komputer -= tawaran;
                }
            } else if (pilihan.equals("b")) {
                if (b > a) {
                    player += tawaran;
                    komputer -= tawaran;
                    System.out.println("Tebakan anda benar, kartu anda bertambah sebesar: ");
                } else if (b < a) {
                    player -= tawaran;
                    komputer += tawaran;
                    System.out.println("Tebakan anda salah, sisa kartu: ");
                } else {
                    System.out.println("Draw");
                    player -= tawaran;
                    komputer -= tawaran;
                }
            } else {
                System.out.println("Masukan sesuai format");
            }

            System.out.println("Player: " + player);
            System.out.println("Komputer: " + komputer);

            System.out.print("menyerah? (y/n): ");
            String menyerah = scanner.nextLine();
            if (menyerah.equalsIgnoreCase("y")) {
                bermain = false;
            }
        }

        scanner.close();
    }
}

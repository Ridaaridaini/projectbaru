package latihanC;

import java.util.Scanner;

public class KasirMinimarketSoal02 {

    public static void main(String[] args) {

        int hargaMieInstant = 2_500, hargaSaos = 11_000, hargaKecapManis = 8_000, hargaTelur = 23_000, hargaSoftDrink = 5_500,
                hargaRotiKemasan = 13_500, hargaShampo = 19_000, hargaPastaGigi = 7_500, hargaTotal = 0, jumBarang, potongan = 0;

        Scanner scanner = new Scanner(System.in);
        char x = 'y';

        while (x == 'y'){

            System.out.println("Daftar barang");
            System.out.println("1. Mie Instant");
            System.out.println("2. Saos");
            System.out.println("3. Kecap Manis");
            System.out.println("4. Telur Ayam");
            System.out.println("5. Soft Drink");
            System.out.println("6. Roti Kemasan");
            System.out.println("7. Shampo");
            System.out.println("8. Pasta Gigi");
            System.out.print("pilih barang (1 - 8): ");
            int barang = scanner.nextInt();

            System.out.print("jumlah barang: ");

            switch (barang){
                case 1 :
                    jumBarang = scanner.nextInt();

                    hargaTotal += jumBarang*hargaMieInstant;
                    break;
                case 2 :
                    jumBarang = scanner.nextInt();

                    hargaTotal += jumBarang*hargaSaos;
                    break;
                case 3:
                    jumBarang = scanner.nextInt();

                    hargaTotal += jumBarang*hargaKecapManis;
                    break;
                case 4:
                    jumBarang = scanner.nextInt();

                    hargaTotal += jumBarang*hargaTelur;
                    break;
                case 5:
                    jumBarang = scanner.nextInt();

                    if (jumBarang >= 2){
                        hargaTotal += (jumBarang*hargaSoftDrink) - (jumBarang*hargaSoftDrink*0.05);
                        break;
                    }

                    hargaTotal += jumBarang*hargaSoftDrink;

                    break;
                case 6:
                    jumBarang = scanner.nextInt();

                    hargaTotal += jumBarang*hargaRotiKemasan;
                    break;
                case 7:
                    jumBarang = scanner.nextInt();

                    hargaTotal += jumBarang*hargaShampo;
                    break;
                case 8:
                    jumBarang = scanner.nextInt();

                    hargaTotal += jumBarang*hargaPastaGigi;
                    break;
            }

            System.out.print("ada lagi (y/n)? ");
            x = scanner.next().charAt(0);

            if (x == 'n'){

                if (hargaTotal > 50_000){
                    int kelipatan = hargaTotal/50_000;
                    potongan = 2_500*kelipatan;
                }

                long hargaAkhir = hargaTotal - potongan;
                System.out.println("harga total: " + hargaTotal);
                System.out.println("potongan: " + potongan);
                System.out.println("harga akhir: " + hargaAkhir);

                break;
            }
        }

    }

}

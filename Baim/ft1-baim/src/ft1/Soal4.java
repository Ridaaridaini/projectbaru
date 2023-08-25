package ft1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah halaman buku: ");
        int halaman = scanner.nextInt();

        System.out.println("halaman berapa?");
        int halamanKe = scanner.nextInt();
        if(halamanKe > halaman){
            System.out.println("Halaman tidak boleh melebihi jumlah halaman");
            System.exit(0);
        }

        boolean bukaLembar = true;
        int bantu = 0;
        int jumlahLembar = 0;

        if (halamanKe % 2 == 1) {
            jumlahLembar++;
        }

        while (bukaLembar) {
            if (bantu != 0) {
                if (bantu % 2 == 0) {
                    jumlahLembar++;
                }
            }
            if (bantu == halamanKe) {
                bukaLembar = false;
            }
            bantu++;
        }

        System.out.println("Lembar ke-" + jumlahLembar);

    }
}

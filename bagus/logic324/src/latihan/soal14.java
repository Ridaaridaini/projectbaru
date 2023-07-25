package latihan;
import java.util.Scanner;
public class soal14 {

        public static void main(String[] args) {
            Scanner uang = new Scanner(System.in);

            System.out.print("Masukkan jumlah uang pecahan sepuluh ribu: ");
            int pecahanSepuluhRibuan = uang.nextInt();

            System.out.print("Masukkan jumlah uang pecahan lima ribu: ");
            int pecahanLimaRibuan = uang.nextInt();

            System.out.print("Masukkan jumlah uang pecahan dua puluh ribu: ");
            int pecahanDuaPuluhRibuan = uang.nextInt();


            int totalUang = (pecahanSepuluhRibuan * 10000) + (pecahanLimaRibuan * 5000) + (pecahanDuaPuluhRibuan * 20000);
            System.out.println("Total uang yang dimiliki Mbah Jambrong: " + totalUang);

            uang.close();
        }
}


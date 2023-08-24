import java.util.Random;
import java.util.Scanner;

public class Soal5FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("n(jumlah penduduk): ");
        int n = input.nextInt();

        System.out.println("m(anggota legislatif): ");
        int m = input.nextInt();


        int tampung = 0;
        int golput = 0;
        int c = 0;
        int random = 1;
        int pilih = 0;
        int penduduk = n;
        while (random<=m){
            Random suara = new Random();
            c = suara.nextInt(n);

            golput = n - pilih;
            tampung = tampung + (penduduk - c);
            System.out.println("Calon no. urut "+random +" = " +c);
            random++;
        }


        System.out.println("golput = " + tampung);


    }
}

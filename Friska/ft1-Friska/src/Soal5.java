import java.util.Random;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah penduduk: ");
        int penduduk = input.nextInt();
        System.out.println("Masukkan jumlah anggota: ");
        long anggota = input.nextLong();
        int penduduk1 = 0;
        int penduduk2 = 0;
        int penduduk3 = 0;


        Random randomGenerator= new Random();

        for (int i = 0; i < anggota ; i++) {
            int suara = randomGenerator.nextInt(penduduk); // semisal 780
            if(anggota < penduduk){
                penduduk1 = penduduk-suara; // 1000 = 1000- 780
                int suara2 = randomGenerator.nextInt(penduduk1);
                penduduk2 = penduduk1 - suara2;
                int suara3 = randomGenerator.nextInt(penduduk2);
                penduduk3 = penduduk2 - suara3;
                System.out.println(penduduk3);




            }

        }



    }
}

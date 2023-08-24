package simulasiFT1;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Banyak Pekerja = ");
        int y2 = input.nextInt();

        int y1 = 5; //Banyak Pekerja di soal
        int hari1 = 3;// lama hari bekerja untuk 5 orang

        //INGAT PERBANDINGAN BERBALIK NILAI
        double hari2 = (y1*hari1)/y2;

        long hasil = Math.round(hari2);


        System.out.print("Waktu yang dibutuhkan untuk menyelesaikan pekerjaan = " + hasil + " hari");

    }
}

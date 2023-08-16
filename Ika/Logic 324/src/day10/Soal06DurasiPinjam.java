package day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal06DurasiPinjam {
    public static void main(String[] args) throws ParseException {
        int detik =1000;
        int menit = 60*detik;
        int jam = 60*menit;
        int hari = 24*jam;
        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("id", "ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        System.out.print("tanggal pinjam: ");
        String pinj = scanner.nextLine();

        System.out.print("tanggal kembali: ");
        String kem = scanner.nextLine();

        //konversi String ke tanggal
        Date pinjam = sdf.parse(pinj);
        Date kembali = sdf.parse(kem);

        //konversi tanggal kemilis
        long tangPinjam = pinjam.getTime();
        long tangKembali = kembali.getTime();
        long lama = tangKembali -tangPinjam;
        long lamaPinjam = lama/hari;
        System.out.println(lamaPinjam);
        int denda =100;
        long totalDenda;

        long bukuA, bukuB, bukuC, bukuD;
        if(lamaPinjam > 14){
            bukuA = (lamaPinjam-14) * denda;
            bukuB = (lamaPinjam-3) * denda;
            bukuC = (lamaPinjam-7) *denda;
            bukuD= (lamaPinjam-7)*denda;
            totalDenda=bukuA+bukuB+bukuC+bukuD;
            System.out.print("total denda Rp" + totalDenda);
        }else if(lamaPinjam<14){
            bukuB = (lamaPinjam-3) * denda;
            bukuC = (lamaPinjam-7) *denda;
            totalDenda=+bukuB+(bukuC*2);
            System.out.print("total denda Rp" + totalDenda);
        }


    }
}

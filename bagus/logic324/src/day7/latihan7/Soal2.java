package day7.latihan7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) throws ParseException {

        int detik = 1000;
        int menit = 60*detik;
        int jam = 60*menit;
        int hari = 24*jam;
        long c=0;

        Locale locale = new Locale("id", "ID");

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        Scanner input = new Scanner(System.in);
        System.out.println("Ujan Libur tiap  : ");
        long x = input.nextInt();
        System.out.println("Haris Libur tiap : ");
        long y = input.nextInt();

        input.nextLine();
        System.out.println("Terakhir libur bareng: ");
        String z = input.nextLine();

        Date date = sdf.parse(z);

        for (int i = 0; i < y+1; i++) {
            c = (c+x+1);
            if (c%y+1==0){
//                System.out.println(c);
                break;
            }
        }
        System.out.println(c);

        long milis = date.getTime();
//        System.out.println(milis);

        milis=milis+(c*hari);
        date.setTime(milis);

        String tglBukBer = sdf.format(date);
        System.out.print("Libur bareng lagi tanggal: ");
        System.out.println(tglBukBer);

    }
}


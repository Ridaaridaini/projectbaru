package rumus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        int detik = 1000;
        int menit = 60 * detik;
        int jam = 60 * menit;
        int hari = 24 * jam;
        Locale locale = new Locale("id","ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        System.out.print("Ucup : ");
        int ucup = input.nextInt();
        System.out.print("Harris : ");
        int harris = input.nextInt();
        input.nextLine();
        System.out.print("Hari libur selanjutnya : ");
        String terakhirBuka = input.nextLine();

        int kpk = ucup;
        while (kpk %harris !=0){
            kpk = kpk +ucup;
        }

        System.out.println("nilai KPK: " + kpk);

        Date date = sdf.parse(terakhirBuka);
        long millis = date.getTime();
        millis = millis + ((long) kpk * hari);
        System.out.println(millis);
        date.setTime(millis);

        String tanggalSesudah = sdf.format(date);
        System.out.println("libur bersama Selanjutnya : " + tanggalSesudah);
    }
}

package simulasi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) throws ParseException {

        int detik = 1000;
        int menit = 60*detik;
        int jam = 60*menit;
        int hari = 24*jam;

        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        scanner.nextLine();
        System.out.print("z: ");
        String z = scanner.nextLine();
        
        x = x+1;
        y = y+1;

        int kpk = x;

        for (int i = 0; i < y; i++) {

            if (kpk%y != 0){
                kpk = kpk+x;
            }

        }

        System.out.println(kpk);

        Locale locale = new Locale("id", "ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        Date date = sdf.parse(z);

        long mils = date.getTime();

        mils = mils + ((long) kpk * hari);

        date.setTime(mils);

        String libur = sdf.format(date);

        System.out.print("libur bareng: " + libur);

    }

}

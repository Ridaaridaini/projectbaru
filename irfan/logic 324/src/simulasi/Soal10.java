package simulasi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) throws ParseException {
        int x,y;
        int detik = 1000;
        int menit = 60 * detik ;
        int jam = 60 * menit;
        int hari = 24 * jam;

        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        x = scanner.nextInt() + 1;

        System.out.print("Y = ");
        y = scanner.nextInt() + 1;

        scanner.nextLine();
        System.out.print("Z = ");
        String z = scanner.nextLine();

        System.out.println(x);
        System.out.println(y);

        int nilaiKpk = x;

        while (nilaiKpk % y !=0){
            nilaiKpk = nilaiKpk + x;
        }
        System.out.println(nilaiKpk);

        Locale locale = new Locale("id","ID");

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        Date date = sdf.parse(z);

        long millis = date.getTime();

        millis = millis + ((long) nilaiKpk * hari);

        date.setTime(millis);

        String tangglLibur = sdf.format(date);

        System.out.println(tangglLibur);

    }
}

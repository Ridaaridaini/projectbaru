package Extra;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) throws ParseException {
        int x,y;
        String z;
        int detik = 1000;
        int menit = 60 * detik ;
        int jam = 60 * menit;
        int hari = 24 * jam;

        Scanner scanner = new Scanner(System.in);
        System.out.print("X = ");
        x = scanner.nextInt();

        System.out.print("Y = ");
        y = scanner.nextInt();

        scanner.nextLine();         //harus di catat => stelah inputan int ke nextline !!!
        System.out.print("Z = ");
        z = scanner.nextLine();


        int nilaiKpk = x;

        for (int i = 0; i < y; i++) {

            if (nilaiKpk % y !=0){
                nilaiKpk = nilaiKpk + x;
            }

        }


        Locale locale = new Locale("id", "ID");

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy",locale);

        Date date = sdf.parse(z);

        long millis = date.getTime();

        millis = millis + (nilaiKpk * hari);

        date.setTime(millis);

        String tanggalBuka = sdf.format(date);

        System.out.println(tanggalBuka);

    }
}

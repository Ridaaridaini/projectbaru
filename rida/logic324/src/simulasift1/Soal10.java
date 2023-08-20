package simulasift1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args)throws ParseException {
        Scanner input=new Scanner(System.in);
        int detik=1000;
        int menit= 60* detik;
        int jam=60* menit;
        int hari=24* jam;
        System.out.println("si X libur setiap? ");
        int x=input.nextInt();
        System.out.println("si Y libur setiap? ");
        int y= input.nextInt();
        input.nextLine();
        System.out.println("(dd MMMM yyyy) ");
        String tanggal=input.nextLine();
        int kpk=0;
        for (int i = 0; i < y; i++) {
            kpk=kpk+x;
            if (x%y==0){
                break;
            }
        }
        Locale locale=new Locale("id","ID");
        SimpleDateFormat sdf= new SimpleDateFormat("dd MMMM yyyy", locale);
        String tanggalSebelum= tanggal;
        Date date=sdf.parse(tanggalSebelum);
        long millis= date.getTime();
        millis=millis+(kpk*hari);
        date.setTime(millis);
        String tanggalSelanjutnya = sdf.format(date);
        System.out.println(tanggalSelanjutnya);
    }
}

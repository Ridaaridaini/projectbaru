package day7.latihan7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Soal1 {
    public static void main(String[] args) throws ParseException {

        int detik = 1000;
        int menit = 60*detik;
        int jam = 60*menit;
        int hari = 24*jam;
        int c=0;//2;4;6

        Locale locale = new Locale("id", "ID");

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        Scanner input = new Scanner(System.in);
        System.out.println("Toko A buka : ");
        int x = input.nextInt();
        System.out.println("Toko B buka : ");
        int y = input.nextInt();

        input.nextLine();
        System.out.println("tanggal terakhir buka bersama: ");
        String z = input.nextLine();

        Date date = sdf.parse(z);

        for (int i = 0; i < y; i++) {//i=0;i=1;i=2
            c = (c+x);//c = 0 + 2; c = 2 + 2; c = 4 + 2
            if (c%y==0){
//                System.out.println(c);
                break;
            }
        }
        System.out.println(c);

        long milis = date.getTime();
//        System.out.println(milis);

        milis=milis+((long) c * hari);
        date.setTime(milis);

        String tglBukBer = sdf.format(date);
        System.out.print("Tanggal buka bareng: ");
        System.out.println(tglBukBer);
        
    }
}

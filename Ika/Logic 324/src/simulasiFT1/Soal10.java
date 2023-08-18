package simulasiFT1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) throws ParseException {
        //Ucup mendapatkan libur setiap x hari, sedangkan Harris mendapatkan libur setiap y hari.
        //Jika mereka terakhir mendapatkan libur di hari yang sama pada tanggal z, kapan tanggal terdekat mereka akan libur bersama kembali?
        //Input: int x, y, date/varchar z
        //Output: tanggal libur bersama selanjutnya
        //Contoh: x=3, y=2, z=25 Februari 2020
        // Output: 8 Maret 2020

        //milis
        int detik = 1000;
        int menit = 60*detik;
        int jam = 60*menit;
        int hari = 24*jam;

        Scanner scanner = new Scanner(System.in);
        Locale locale = new Locale("id", "ID");
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        System.out.print("masukan jatah libur ucup : ");
        long x = scanner.nextInt() +1;

        System.out.print("masukan jatah libur haris: ");
        long y = scanner.nextInt()+1;

        scanner.nextLine();
        System.out.print("tanggal libur bersama pertama: ");
        String z= scanner.nextLine();

        long kpk=0;
        long nilaiKpk=0;
        for (int i = 1; i <=x && i<=y ; i++) {
            if(x%i==0 && y%i==0){
                kpk=i;
            }
        }
        nilaiKpk= nilaiKpk + (x*y)/kpk;
        System.out.println(nilaiKpk);

        Date date = sdf.parse(z);
        long milis =date.getTime();
//        System.out.println(milis);
        milis= milis + (nilaiKpk * hari);
        date.setTime(milis);

        String liburBersamaLagi = sdf.format(date);
        System.out.println("libur bersama kembali pada : "+liburBersamaLagi);



    }
}

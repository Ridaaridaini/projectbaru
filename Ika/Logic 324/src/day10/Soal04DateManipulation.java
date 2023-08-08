package day10;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal04DateManipulation {
    public static void main(String[] args) throws ParseException {
        //mengubah 24 jam menjadi 12 jam

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan konversi jam: ");
        String jam = scanner.nextLine();


        Locale local = new Locale("id","ID");
        SimpleDateFormat sdf24Hour = new SimpleDateFormat("HH:mm", local);
        SimpleDateFormat sdf12jam = new SimpleDateFormat("hh:mm a", local);

        Date _24Jam = sdf24Hour.parse(jam);
        System.out.println(sdf12jam.format(_24Jam));




    }
}

package day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Soal05dMan12jamto24jam {
    public static void main(String[] args) throws ParseException {
        //mengubah 12 jam menjadi 24 jam
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan jam (AM/PM) : ");
        String jam = scanner.nextLine();

        Locale locale = new Locale("id", "ID");
        SimpleDateFormat sdf_24 = new SimpleDateFormat("HH:mm:ss ", locale);
        SimpleDateFormat sdf_12 = new SimpleDateFormat("hh:mm:ss aa", locale);

        //mengkonversi jam 12 jam
        Date _12jam = sdf_12.parse(jam);

        //mengubah format 12 jam menjadi 24 jam
        System.out.println(sdf_24.format(_12jam));


    }
}

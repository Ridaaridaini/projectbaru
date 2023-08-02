package day7;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TentangDate {
    public static void main(String[] args) {
        Locale locale = new Locale("id", "ID");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", locale);

        Date date = new Date();

        long milis = date.getTime();

        System.out.println(milis);
    }
}

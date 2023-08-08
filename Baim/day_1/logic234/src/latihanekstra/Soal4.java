package latihanekstra;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
        DateFormat dateFormatAM = new SimpleDateFormat("hh:mm aa");

        System.out.println("Masukkan Jam: ");
        String[] jam = scanner.nextLine().split(" ");

        if (jam.length == 2) {
            String jamLama = jam[0] + " " + jam[1];
            Date time = dateFormatAM.parse(jamLama);
            String output = dateFormat.format(time);
            System.out.println(output);
        } else {
            Date time = dateFormat.parse(jam[0]);
            String output = dateFormatAM.format(time);
            System.out.println(output);
        }
    }

}

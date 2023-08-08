package day10;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Soal04DateManipulation {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan konversi jam: ");
        String jam = scanner.nextLine();


        SimpleDateFormat sdf24Hour = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdf12jam = new SimpleDateFormat("hh:mm:ssa");

//        Data date = sdf24Hour.parse(jam);


    }
}

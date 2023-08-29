package ft1;

import java.util.Locale;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

        String username = "A-z";
        String alfanumerik = ("_");
        String banyakUsername;
//        String abjad = ["A-z"];
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan username : ");
        String n = scanner.nextLine();


        if (n != username) {
            if (n != alfanumerik) {
//            if (n.length() != 5) {
            System.out.print("invalid");
//                return;
            } else {
                System.out.print("valid");
            }
        }
    }
}
//}

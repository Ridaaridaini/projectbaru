import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        for (int i = 1; i < n ; i++) {

            if(i%3 == 0 && i%2 == 0) {
                System.out.print(i + " ");

            }
        }
    }
}



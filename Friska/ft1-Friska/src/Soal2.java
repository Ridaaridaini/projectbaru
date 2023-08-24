import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan username: ");
        String username = input.nextLine();

        if (username.length() >= 5 && username.length() <= 10) {
            if (username.contains("_")) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid");
        }

    }
}

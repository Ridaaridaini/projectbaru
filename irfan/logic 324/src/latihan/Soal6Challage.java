package latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal6Challage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("main tidak ya = lanjut / nyerah: ");
        String input = scanner.nextLine();

        while (input.equalsIgnoreCase("lanjut")){
            System.out.print("1. Player main dahulu 2. Computer main dahulu : ");
            int pilih = scanner.nextInt();

            if (pilih == 1){
                System.out.print("Input player: ");
                int player = scanner.nextInt();

                Random random = new Random();
                int computer = random.nextInt(10);

                System.out.println("computer: "+computer);

                if (player>computer){
                    System.out.println("You Win");
                } else if (player<computer) {
                    System.out.println("You Lose");
                } else {
                    System.out.println("Seri");
                }
            } else if (pilih == 2) {

                Random random = new Random();
                int computer = random.nextInt(10);

                System.out.print("Input player: ");
                int player = scanner.nextInt();


                System.out.println("computer: Rahasia bro");

                if (player>computer){
                    System.out.println("You Win");
                } else if (player<computer) {
                    System.out.println("You Lose");
                } else {
                    System.out.println("Seri");
                }
            }
            System.out.print("main tidak ya = lanjut / nyerah: ");
            input = scanner.next();
        }

    }
}

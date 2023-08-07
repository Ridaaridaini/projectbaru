package latihanA;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String main = "y";

        while (main.equalsIgnoreCase("y")){
            System.out.print("1. Player main dahulu 2. Computer main dahulu : ");
            int pilih = scanner.nextInt();

            if (pilih == 1){
                System.out.print("Input angka anda/player: ");
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
                System.out.println("computer: *");
                int computer = random.nextInt(10);

                System.out.print("Input angka anda/player: ");
                int player = scanner.nextInt();

                System.out.println("Computer: " + computer);


                if (player>computer){
                    System.out.println("You Win");
                } else if (player<computer) {
                    System.out.println("You Lose");
                } else {
                    System.out.println("Seri");
                }
            }else{
                System.out.println("hanya ada 2 pilihan, anda di luar nalar!");
            }


            System.out.print("anda mau bermain? (y/n): ");
            main = scanner.next();
        }


    }

}

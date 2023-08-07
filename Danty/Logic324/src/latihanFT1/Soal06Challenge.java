package latihanFT1;

import java.util.Random;
import java.util.Scanner;

public class Soal06Challenge {

    public static void main(String[] args) {


        Random random = new Random();
        int komputer = random.nextInt(10);


        Scanner input = new Scanner(System.in);

        for (; true; ) {

            System.out.print("Input pilihan :  (1) Player main dahulu ; (2) Computer main dahulu : ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {

                System.out.print("Input angka anda/player : ");
                int player = input.nextInt();

                komputer = random.nextInt(10);
                System.out.print("Angka Komputer : " + komputer);

                System.out.println();

                if (player > komputer) {

                    System.out.println("You win");
                    break;

                } else if (player < komputer) {

                    System.out.println("You lose");

                }

            }  else if(pilihan == 2) {

                komputer = random.nextInt(10);

                System.out.print("Input angka anda/player : ");
                int player = input.nextInt();

                System.out.println("Angka Komputer : " + komputer);

                if (player > komputer) {

                    System.out.print("You win");

                    System.out.println();


                } else if (player < komputer) {

                    System.out.print("You lose");

                    System.out.println();

                }
            }

            input.nextLine();

            System.out.print("CONTINUE ? (YES/NO) : ");
            String lanjut = input.nextLine();

            if (lanjut.equalsIgnoreCase("yes")) {
                continue;
            }
            else {
                break;

            }

            }
        } }

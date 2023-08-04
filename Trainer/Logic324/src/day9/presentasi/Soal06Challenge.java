package day9.presentasi;

import java.util.Random;
import java.util.Scanner;

public class Soal06Challenge {
    public static void main(String[] args) {


        Random random = new Random();
        int komputer = random.nextInt(10);


        Scanner input = new Scanner(System.in);

        for(;true;){

        System.out.print("Input pilihan :  (1) Player main dahulu ; (2) Computer main dahulu : ");
        int pilihan = input.nextInt(); //2

        if(pilihan == 1){

            System.out.print("Input angka anda/player : ");
            int player = input.nextInt();//7

            komputer = random.nextInt(10);//9
            System.out.print("Angka Komputer : " + komputer);

            System.out.println();

            if(player > komputer){//true

                System.out.print("You win");//you win
            }

            else if (player < komputer){

                System.out.print("You lose");
            }

        }
        else if(pilihan == 2) {

            komputer = random.nextInt(10);

            System.out.print("Input angka anda/player : ");
            int player = input.nextInt();//8

            System.out.print("Angka Komputer : " + komputer);

            if (player > komputer) {

                System.out.print("You win");

                System.out.println();

            } else if (player < komputer) {

                System.out.print("You lose");

                System.out.println();

            }
            //Pilihan main atau tidak
            input.nextLine();

            System.out.print("Lanjut atau tidak : ");
            String lanjut = input.nextLine();

            if(lanjut.equalsIgnoreCase("lanjut")){
                continue;
            }
            else {
                break;
            }
        }


        }
}
}

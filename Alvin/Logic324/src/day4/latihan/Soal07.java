package day4.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        int m,n, tebak, player, computer;

        Scanner scanner = new Scanner(System.in);

        System.out.print("banyak kartu: ");
        n = scanner.nextInt();

        player = n;
        computer = n;

        for (int i = 0; ; i++) {

            System.out.print("jumlah taruhan: ");
            m = scanner.nextInt();

            Random random = new Random();

            int randomA = random.nextInt(10);
            int randomB = random.nextInt(10);

            System.out.print("pilih kotak (1.Kotak A || 2.Kotak B): ");
            tebak = scanner.nextInt();// 2

            System.out.println("A: " + randomA + " B: " + randomB); // 3|| 4

            if (tebak == 1){

                if (randomA > randomB){
                    //player menang
                    player = player + m;
                    computer = computer - m;
                    System.out.println("Selamat!");
                }else if (randomA < randomB){
                    //computer menang
                    player = player - m;
                    computer = computer + m;
                    System.out.println("Anda Rungkad");
                }else{
                    System.out.println("SERI!");
                }


            } else if (tebak == 2) {

                if (randomA < randomB){//true 3 | 4
                    //player menang
                    player = player + m;
                    computer = computer - m;
                    System.out.println("Selamat!");
                }else if (randomA > randomB){
                    //computer menang
                    player = player - m;
                    computer = computer + m;
                    System.out.println("Anda Rungkad!");
                }else{
                    System.out.println("SERI!");
                }

            }else {
                System.out.println("anda di luar nalar");
            }

            System.out.println("Sisa kartu kamu: "+player);
            System.out.println("Sisa kartu computer: "+computer);


            System.out.println();

            if (player < 1){
                //player kalah
                break;
            }

            if (computer < 1){
                //computer kalah
                break;
            }
        }

    }

}

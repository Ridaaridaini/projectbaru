package day4.latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        int m,n, tebak, player, computer;

        Scanner scanner = new Scanner(System.in);

        System.out.print("banyak kartu: ");// 5 == nyawa
        n = scanner.nextInt();

        player = n; // nyawa 5
        computer = n; // nyawa 5

        for (; ;) {

            System.out.print("jumlah taruhan: ");
            m = scanner.nextInt(); // 3

            Random random = new Random();

            int randomA = random.nextInt(10);
            int randomB = random.nextInt(10);

            System.out.print("pilih kotak (1.Kotak A || 2.Kotak B): ");
            tebak = scanner.nextInt();// 1

            System.out.println("A: " + randomA + " B: " + randomB); // 3 || 9 == kalah tebakan salah

            if (tebak == 1){

                if (randomA > randomB){//false
                    //player menang
                    player = player + m;
                    computer = computer - m;
                    System.out.println("Selamat!");
                }else if (randomA < randomB){ //true
                    //computer menang
                    player = player - m; // 5 - 3
                    computer = computer + m; // 5 + 3
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

            System.out.println("Sisa kartu kamu: "+player); // 2
            System.out.println("Sisa kartu computer: "+computer); // 8


            System.out.println();

            // 0 kartu habis
            if (player < 1){
                //player kalah
                break;
            }

            if (computer < 1){
                //computer kalah
                break;
            }

            scanner.nextLine();
            System.out.print("Apakah anda menyerah? (Ya | Tidak): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("ya")){
                System.out.println("Anda bukan penjudi ulung!");
                break;
            }
        }

    }

}

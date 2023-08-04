package latihanA;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("jumlah kartu/gambaran: ");
        int kartu = scanner.nextInt();

        int player = kartu, computer = kartu;

        int lanjut = 1;

        while (lanjut == 1){

            Random random = new Random();

            int kotakA = random.nextInt(10);
            int kotakB = random.nextInt(10);

            System.out.print("jumlah tawaran: ");
            int tawaran = scanner.nextInt();

            System.out.print("pilih (1.Kotak A) atau (2.Kotak B) : ");
            int pilihan = scanner.nextInt();


            if (pilihan < 1 || pilihan > 2){
                System.out.println("anda diluar nalar");
                System.exit(500);
            }

            if (pilihan == 1){
                // pilih kotak A
                if (kotakA > kotakB){
                    //player menang
                    player = player + tawaran;
                    computer = computer - tawaran;
                    System.out.println("A["+kotakA+"] B["+kotakB+"] You Win");
                } else if (kotakA < kotakB) {
                    //computer menang
                    player = player - tawaran;
                    computer = computer + tawaran;
                    System.out.println("A["+kotakA+"] B["+kotakB+"] You Lose");
                }else{
                    System.out.println("A["+kotakA+"] B["+kotakB+"] seri");
                }
            }else if (pilihan == 2){
                // pilih kotak B
                if (kotakB>kotakA){
                    //player menang
                    player = player + tawaran;
                    computer = computer - tawaran;
                    System.out.println("A["+kotakA+"] B["+kotakB+"] You Win");
                } else if (kotakB<kotakA) {
                    //computer menang
                    player = player - tawaran;
                    computer = computer +tawaran;
                    System.out.println("A["+kotakA+"] B["+kotakB+"] You Lose");
                }else {
                    System.out.println("A["+kotakA+"] B["+kotakB+"] seri");
                }
            }


            System.out.println("Jumlah kartu player: " + player);
            System.out.println("Jumlah kartu computer: " + computer);

            if (player == 0 || computer == 0){
                System.out.println("Game Over");
                System.exit(0);
            }

            System.out.print("1. lanjut     2. menyerah : ");
            lanjut = scanner.nextInt();
        }

    }

}

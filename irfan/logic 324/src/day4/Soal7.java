package day4;

import java.util.Random;
import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {

        int n, m,rand;
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        rand = random.nextInt(10);

        System.out.print("Jumlah kartu = ");
        n = input.nextInt();

        System.out.print("Jumlah tawaran = ");
        m = input.nextInt();

        System.out.print("pilih kotak, A dan B = ");
        String kotak = input.nextLine();

        for (int i = 0; i < n; i++) {
            if (m == rand ) {
                System.out.println("you Win");
            }

        }

        }
    }

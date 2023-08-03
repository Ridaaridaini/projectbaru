package day7.latihan01A;

import java.util.Random;
import java.util.Scanner;

public class soal06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("pilih yang di dahulukan (A atau B) \nA.player \nB.komputer \npilihan : ");
        String main = scanner.nextLine();

        int player;
        int komputer=0;
        if(main.equalsIgnoreCase("A")){
            System.out.print("masukan angka: ");
            player = scanner.nextInt();
            komputer = random.nextInt(10);
            if(player>komputer){
                System.out.println("YOU WIN");
            }else {
                System.out.println("YOU LOSE");
            }
        } else if (main.equalsIgnoreCase("B")) {
            System.out.print("masukan angka: ");
            player = scanner.nextInt();
            komputer = random.nextInt(10);
            if(player>komputer){
                System.out.println("YOU WIN");
            }else {
                System.out.println("YOU LOSE");
            }
        }

        System.out.println("angka komputer "+ komputer);

    }
}

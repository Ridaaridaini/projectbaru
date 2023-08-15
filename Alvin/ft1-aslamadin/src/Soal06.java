import java.util.Random;
import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {
// masih kurang
        int playerA = 0, playerB = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("pilihan player: ");
        String pilihan = scanner.nextLine(); // A

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int playerHokiA = random.nextInt(9-1);
            int playerHokiB = random.nextInt(9-1);

            if (playerHokiA > playerHokiB){
                playerA++;
            } else if(playerHokiA < playerHokiB){
                playerB++;
            }

            System.out.println("Round " + (i+1) + " => A=" + playerHokiA + ", B=" + playerHokiB);
            System.out.println("Nilai A: " + playerA + " Nilai B: " + playerB);
            System.out.println();

        }

        // kurang yang menang sama yang kalah
// nilai a: 7 dan b:1
        if (pilihan.equalsIgnoreCase("a")){
            if (playerA > playerB){
                System.out.print("Anda menang, B kalah");
            } else if (playerA < playerB) {
                System.out.print("Anda kalah, B menang");
            }else {
                System.out.println("seri");
            }
        } else if (pilihan.equalsIgnoreCase("b")) {
            if (playerA < playerB){
                System.out.print("Anda menang, A kalah");
            } else if (playerA > playerB) {
                System.out.print("Anda kalah, A menang");
            }else {
                System.out.println("seri");
            }
        }else {
            System.out.println("tidak ada pilihan lain");
        }

    }

}

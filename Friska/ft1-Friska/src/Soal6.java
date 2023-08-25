import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input pilihan : 1. Player A; 2.Player B");
        int pilihan = input.nextInt();
        int putaran = 3;
        int round = 0;
        int poinA = 0;
        int poinB = 0;
        int akumulasiSkorA = 0;
        int akumulasiSkorB = 0;
        Random randomGenerator = new Random();

        while (putaran >= 1 && putaran <= 3) {
            putaran = putaran - 1;
            round = round + 1;

            if (pilihan == 1) {
                int angkaRandom1 = randomGenerator.nextInt(9);
                int angkaRandom2 = randomGenerator.nextInt(9);

                akumulasiSkorA = angkaRandom1+akumulasiSkorA;
                akumulasiSkorB = angkaRandom2+akumulasiSkorB;

                if(akumulasiSkorA > akumulasiSkorB){
                    System.out.println("Round " + round + " Nilai A " + angkaRandom1 + " Nilai B " + angkaRandom2);


                }

//            } else  {
//                System.out.println("Round " + round + " Nilai A " + playerA + " Nilai B " + playerB);
//                poinB = poinB + 1;
            }

//            } else if (pilihan == 2) {
//                int playerA = randomGenerator.nextInt(10);
//                int playerB = randomGenerator.nextInt(10);
//                if (playerB > playerA) {
//                    System.out.println("Round " + round + " Nilai A " + playerA + " Nilai B " + playerB);
//                    poinB = poinB + 1;
//
//                } else {
//                    System.out.println("Round " + round + " Nilai A  " + playerA + " Nilai B " + playerB);
//                    poinB = poinA + 1;
//                }
//
//            }
//
//        }
//        if (poinA > poinB) {
//            System.out.println("Anda Menang, B Kalah");
//        } else {
//            System.out.println("Anda Kalah, B Menang");
//        }
//
//    }
        }
        System.out.println("Anda Menang, B Kalah");
    }
}


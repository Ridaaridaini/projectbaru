package latihanFT1;

import java.util.Random;
import java.util.Scanner;

public class Soal09Challenge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nyawa = ");
        int n = input.nextInt();


        Random random = new Random();


        int nyawaKomp = n;
        int nyawaPlayer = n;



        for(;nyawaPlayer != 0 && nyawaPlayer != 0;){


            System.out.print("Tawaran = ");
            int m = input.nextInt();


            int kotakA = random.nextInt(10);
            int kotakB = random.nextInt(10);

            System.out.print("Pilihan Kotak : (1) Kotak A (2) Kotak B : ");
            int pilihan = input.nextInt();

            System.out.print("Kotak A = " + kotakA + ", Kotak B = " + kotakB);

            System.out.println();


            if(pilihan == 1){

                if(kotakA > kotakB){

                    System.out.println("You Win");

                    nyawaPlayer = nyawaPlayer + m;
                    nyawaKomp = nyawaKomp - m;

                } else if(kotakA < kotakB){

                    System.out.println("You lose");
                    nyawaPlayer = nyawaPlayer - m;
                    nyawaKomp = nyawaKomp + m;

                } else{

                    System.out.print("Draw");

                    nyawaPlayer = nyawaPlayer - m;
                    nyawaKomp = nyawaKomp - m;

                }
            } else if (pilihan == 2){

                if(kotakB > kotakA){

                    System.out.println("You Win");

                    nyawaPlayer = nyawaPlayer + m;
                    nyawaKomp = nyawaKomp - m;


                } else if(kotakB < kotakA){

                    System.out.println("You lose");

                    nyawaPlayer = nyawaPlayer - m;
                    nyawaKomp = nyawaKomp + m;


                } else {

                    System.out.print("Draw");

                    nyawaPlayer = nyawaPlayer - m;
                    nyawaKomp = nyawaKomp - m;

                }

            }

            System.out.println();

            System.out.println("Nyawa Player = " + nyawaPlayer);

            System.out.println("Nyawa Komputer = " + nyawaKomp);

            if(nyawaPlayer == 0 || nyawaKomp == 0){

                if(nyawaKomp == 0){

                    System.out.print("Game Over, You Win");
                    break;
                }
                else if(nyawaPlayer == 0){

                    System.out.print("Game Over, You Lose");
                    break;
                }

            }
            //Ini untuk pilihan menyerah;

            input.nextLine();

            System.out.print("CONTINUE ? (YES/NO) : ");
            String lanjut = input.nextLine();

            if(lanjut.equalsIgnoreCase("yes")){
                continue;
            }
            else{

                break;
            }

        }

        System.out.println();

        System.out.print("Game Over");
    }

}


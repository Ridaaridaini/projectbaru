package day3.latihanday3;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {


        //PENJELASAN SOAL
        //buat program untuk deret yang selisihnya 4 dulu
        //dalam soal perulangan yang diminta 7 kali. maka yang dicetak 0 1 2 3  4  5  6
        //karena selisih 4 tadi maka angka yang akan dicetak adalah    1 5 9 13 17 21 25
                                   //output yg diminta                 1 5 * 9  13  * 17
              //lihat posisi bintang ada di angka 2 dan
              // kesamaan angka 2 dan 5 adalah apabila di bagi 3 bersisa 2
        //itulah mengapa pada program if(i%2 == 3)

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();

        int a = 1;
        for (int i = 0; i < n ; i++) {

            if(i%3 == 2) {
                System.out.print("* ");
                continue;

            } else {
                System.out.print(a + " ");
                a = a + 4;
            }



            }
        }

    }

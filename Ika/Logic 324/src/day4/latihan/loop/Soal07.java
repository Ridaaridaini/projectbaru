package day4.latihan.loop;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        //permainan kartu gag
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("masukan banyak gambar n: ");
        int n = input.nextInt();

        int angkaRandomA = random.nextInt(10);
        int angkaRandomB = random.nextInt(10);

        for (int i = 0; i < n; i++){
            System.out.print("masukan jumlah kartu taruhan m: ");
            int m = input.nextInt();

            input.nextLine();
            System.out.print("pilih kotak A atau B : ");
            String kotak = input.nextLine();


            int nUser = 0;
            int nRandom = 0;
            if (kotak.equalsIgnoreCase("A")){
                if (angkaRandomA>angkaRandomB){
                    nUser+= m;
                    System.out.println("sisa kartu user " +nUser);
                }else {
                    nRandom +=m;
                    System.out.println("sisa kartu komputer " + nRandom);
                }

            }

        }

        }
}

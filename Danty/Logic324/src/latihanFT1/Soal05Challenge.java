package latihanFT1;

import java.util.Scanner;

public class Soal05Challenge {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Deklarasi variabel yang diketahui
        int dewasaLaki = 2;
        int dewasaPerempuan = 1;
        int remaja = 1; //Ini sebenarnya diketahu 2 remaja makan 2 mie, maka 1 remaja makan 1 mie
        double anak = 0.5;
        int balita = 1;


        System.out.print("Laki - laki Dewasa = ");
        int l = input.nextInt();


        System.out.print("Perempuan Dewasa = ");
        int p = input.nextInt();

        System.out.print("Balita = ");
        int b = input.nextInt();

        System.out.print("Remaja = ");
        int r = input.nextInt();

        System.out.print("Anak - anak = ");
        int a = input.nextInt();


        int totalOrang = l + p + b + r + a;
        double porsi = (l * dewasaLaki) + (p * dewasaPerempuan) + (r * remaja) + (a * anak) + (b * balita);


        if (totalOrang > 5 && totalOrang % 2 != 0) {

            porsi = porsi + (p * 1);

            int porsi1 = (int) porsi;

            System.out.println(porsi1 + " porsi");


            if (l > p) {

                double porsi2 = porsi + (l - p) * l;

                int porsiC = (int) porsi2;

                System.out.print(porsiC + " porsi");

            }
            }
        else {

            int porsi1 = (int) porsi;

            System.out.print(porsi1 + " porsi");
        }
    }
}


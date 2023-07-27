package day2.latihan;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Keranjang 1 = ");
        int k1 = input.nextInt();

        System.out.print("Keranjang 2 = ");
        int k2 = input.nextInt();

        System.out.print("Keranjang 3 = ");
        int k3 = input.nextInt();

        System.out.print("Keranjang yang dibawa ke pasar = keranjang ");
        int pasar = input.nextInt();

        if(pasar == 1){
            int sisaDiRumah1 = k2 + k3;
            System.out.println(sisaDiRumah1);
        }
        else if(pasar == 2){
            int sisaDiRumah2 = k1 + k3;
            System.out.println(sisaDiRumah2);
        }
        else if (pasar == 3){
            int sisaDiRumah3 = k1 + k2;
            System.out.println(sisaDiRumah3);
        }
    }

}

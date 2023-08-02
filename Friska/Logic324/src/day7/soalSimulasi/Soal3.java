package day7.soalSimulasi;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        double cangkir = 2.5;
        double gelas = 1 * cangkir;
        double botol = 2.0 * gelas;
        double teko = 10 * cangkir;
        double cangkirGelas = 1 / cangkir ;
        double botolCangkir = 1/2 * cangkirGelas;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan benda yang akan di konversi:");
        String benda = input.nextLine();

        if (benda.equalsIgnoreCase("botol")){
            System.out.println("1 botol = "+ 2*cangkir +" cangkir");
        }else if(benda.equalsIgnoreCase("cangkir"){
            System.out.println("1 botol = "+ );

        }
        if (benda.equalsIgnoreCase("teko")){
            System.out.println("1 teko = "+ teko +" gelas");
        }
        if (benda.equalsIgnoreCase("teko")){
            System.out.println("1 teko = "+ teko +" gelas");
        }






    }
}

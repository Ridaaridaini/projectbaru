package day7.latihan01A;

import java.util.Scanner;

public class soal05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("laki-laki dewasa: ");
        int lakiDewasa = scanner.nextInt();
        System.out.print("perempuan dewasa: ");
        int perempuanDewasa = scanner.nextInt();
        System.out.print("remaja: ");
        int remaja = scanner.nextInt();
        System.out.print("anak-anak: ");
        int anakAnak = scanner.nextInt();
        System.out.print("balita: ");
        int balita = scanner.nextInt();

        int porsiLaki, porsiPerempuan, porsiRemaja;
        porsiLaki=2;
        porsiPerempuan=1;
        porsiRemaja=1;
        double porsiAnak = 0.5;
        int porsiBalita = 1;
        
        int totalorang = lakiDewasa+perempuanDewasa+remaja+anakAnak+balita;
        if(totalorang %2 ==0){
            double total1= ((lakiDewasa*porsiLaki)+(perempuanDewasa*porsiPerempuan)+(remaja*porsiRemaja)+(anakAnak*porsiAnak)+(balita*porsiBalita));
            System.out.println(total1 + " porsi");
        } else if (totalorang>=5 && totalorang %2 != 0) {
            double total1= ((lakiDewasa*porsiLaki)+(perempuanDewasa*porsiPerempuan)+(remaja*porsiRemaja)+(anakAnak*porsiAnak)+(balita*porsiBalita)+1);
            System.out.println(total1 + " porsi" );
        }else{
            double total1= ((lakiDewasa*porsiLaki)+(perempuanDewasa*porsiPerempuan)+(remaja*porsiRemaja)+(anakAnak*porsiAnak)+(balita*porsiBalita));
            System.out.println(total1 + " porsi");
        }

    }
}

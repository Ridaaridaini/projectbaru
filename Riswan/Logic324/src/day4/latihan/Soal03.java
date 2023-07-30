package day4.latihan;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan uang : ");
        long uang = input.nextInt();
        boolean keputusan = true;
        int jas = 0,celanaPanjang=0,kemeja=0,kaos=0,celanaPendek=0;

        while (keputusan){
            if(uang >= 750_000){
                uang = uang - 750_000;
                jas = jas+1;
                //System.out.println(" Pak topik membeli Jas");
            }else if(uang >= 350_000){
                uang = uang - 350_000;
                celanaPanjang = celanaPanjang + 1;
                //System.out.println(" Pak topik membeli Celana Panjang");
            }else if(uang >= 250_000){
                uang = uang - 250_000;
                kemeja = kemeja + 1;
                //System.out.println(" Pak topik membeli Kemeja");
            }else if(uang >= 100_000){
                uang = uang - 100_000;
                kaos = kaos + 1;
                //System.out.println(" Pak topik membeli Kaos");
            }else if(uang >= 50_000){
                uang = uang - 50_000;
                celanaPendek = celanaPendek + 1;
                //System.out.println(" Pak topik membeli Celana Pendek");
            }else {
                keputusan = false;
                System.out.println("pak Topik membeli  ");
                System.out.println("Jas             : " + jas);
                System.out.println("Celana Panjang  : " + celanaPanjang);
                System.out.println("Kemeja          : " + kemeja);
                System.out.println("Celana Pendek   : " + celanaPendek);
                System.out.println("Sisa uang : " + uang);
            }
        }
    }
}

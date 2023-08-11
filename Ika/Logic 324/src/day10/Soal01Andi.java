package day10;

import java.util.Scanner;

public class Soal01Andi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan uang andi: ");
        int uang = scanner.nextInt();

        scanner.nextLine();
        System.out.print("masukan harga kacamata: ");
        String kacamata = scanner.nextLine();
        System.out.print("masukan harga baju: ");
        String baju = scanner.nextLine();

        String[] arrKac = kacamata.replace(" ", "").split(",");
        String[] arrBaju = baju.replace(" ", "").split(",");

        int m= 3;


        int i = 0;
        while(i<m){
            while (uang > Integer.parseInt(arrKac[i])) {


                int hargaBayar = 0;
                if (uang > Integer.parseInt(arrKac[i])) {
                    hargaBayar = (hargaBayar + uang) -Integer.parseInt(arrKac[i]);
                    System.out.print("kacamata ");
                    i++;
                    break;
                }uang=hargaBayar;

                if(uang>Integer.parseInt(arrBaju[i])){
                    hargaBayar= (uang) - Integer.parseInt(arrBaju[i]);
                    System.out.println("baju");
                    i++;
                    break;
                }uang=hargaBayar;

                if(uang<Integer.parseInt(arrBaju[i]) || uang<Integer.parseInt(arrKac[i])){
                    System.out.println("dana tidak mencukupi");
                    i++;
                }
            }
        }

    }
}


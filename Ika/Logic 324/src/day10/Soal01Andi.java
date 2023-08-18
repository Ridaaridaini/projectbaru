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
        int sisaUang=0;
//        while(i<m){
            while (uang > Integer.parseInt(arrKac[i]) || uang > Integer.parseInt(arrBaju[i])) {
                if (uang > Integer.parseInt(arrKac[i])) {
                    uang = uang -Integer.parseInt(arrKac[i]);
                    System.out.print("kacamata ");
                    System.out.println(uang);
                }else if(uang>Integer.parseInt(arrBaju[i])){
                    uang= uang - Integer.parseInt(arrBaju[i]);
                    System.out.println(uang);
                    System.out.println("baju");
                }

            }
//        }

    }
}



//while(i<m) {
//        while (uang > Integer.parseInt(arrKac[i]) || uang > Integer.parseInt(arrBaju[i])) {
//        if((uang > Integer.parseInt(arrKac[i]) && uang > Integer.parseInt(arrBaju[i])) ){
//        uang = uang - (Integer.parseInt(arrKac[i]) + Integer.parseInt(arrBaju[i]));
//        sisaUang = sisaUang +uang;
//        System.out.print(" kacamata  dan baju");
//        System.out.println(sisaUang);
//        }else if (uang > Integer.parseInt(arrKac[i])) {
//        uang = uang - Integer.parseInt(arrKac[i]);
//        System.out.print("kacamata ");
//        break;
//        } else if (uang > Integer.parseInt(arrBaju[i])) {
//        uang = uang - Integer.parseInt(arrBaju[i]);
//        System.out.println("baju");
//        i++;
//        break;
//        }
//        i++;
//        }
//        }


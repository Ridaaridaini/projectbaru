package day2.latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bilangan x: ");
        x = scanner.nextInt();

        scanner.close();

            x = x % 7;
            switch (x){
                case 1 :
                    System.out.println("Senin");
                    break;
                case 2 :
                    System.out.println("Selasa");
                    break;
                case 3 :
                    System.out.println("Rabu");
                    break;
                case 4 :
                    System.out.println("Kamis");
                    break;
                case 5 :
                    System.out.println("Jum'at");
                    break;
                case 6 :
                    System.out.println("Sabtu");
                    break;
                default :
                    System.out.println("Mnggu");
                    break;
            }



    }
}

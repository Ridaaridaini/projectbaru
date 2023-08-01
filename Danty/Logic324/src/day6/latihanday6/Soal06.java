package day6.latihanday6;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("kata : ");
        String x = input.nextLine();

        String balik = "";
        int a = x.length() - 1;

        for (int i = 0; i < x.length(); i++) {
            balik = balik + x.charAt(a);
            a = a-1;
        }
        if(x.equalsIgnoreCase(balik)) {
            System.out.print("merupakan kata palindrom");
        }
        else{
            System.out.print("Bukan kata palindrom");
        }




//                System.out.print("merupakan kata palindrom");
//            } else{
//                System.out.print("bukan merupakan kata palindrom");
//            }



    }
}

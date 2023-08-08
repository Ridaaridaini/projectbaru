package day6.latihan6;

import java.util.Scanner;

public class Soal9DuaKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata 1: ");
        String kata1 = input.nextLine();

        System.out.println("Masukkan kata 2: ");
        String kata2 = input.nextLine();
        boolean bantu= false;
        //bantu == true ada huruf yang sama
        //bantu == false tidak huruf yang sama

        String[] tampungKata1 = kata1.split("");

        for (int i = 0; i < tampungKata1.length; i++) {
            if(kata2.contains(tampungKata1[i])){
                System.out.println("YES");
                bantu = true;
                break;
            }

        }if(bantu==false){
            System.out.println("NO");

        }


    }
}

package day2.latihanday2;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("nilai hari = ");
        int x = input.nextInt();

        if(x%7 == 1){
            System.out.println("Senin");
        }
        else if(x%7 == 2){
            System.out.println("Selasa");
        }
        else if(x%7 == 3){
            System.out.println("Rabu");
        }
        else if(x%7 == 4){
            System.out.println("Kamis");
        }
        else if(x%7 == 5){
            System.out.println("Jumat");
        }
        else if(x%7 == 6){
            System.out.println("Sabtu");
        }
        else{
            System.out.println("Minggu");
        }


    }
}

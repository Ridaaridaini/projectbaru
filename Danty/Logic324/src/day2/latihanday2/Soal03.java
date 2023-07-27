package day2.latihanday2;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("nilai x = ");
        int x = input.nextInt();

        System.out.print("nilai y = ");
        int y = input.nextInt();


        if(x<1){
            System.out.println("panjang yang diinputkan tidak boleh kurang dari 1");
        }
        else if(y < 1){
            System.out.println("lebar yang diinputkan tidak boleh kurang dari 1");
        }
        else {
            int z = x * y;
            System.out.println("Luas persegi panjang dengan panjang " + x + " dengan lebar " + y + " adalah " + z);
        }


    }
}

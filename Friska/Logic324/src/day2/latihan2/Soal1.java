package day2.latihan2;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai x: ");
        int x = input.nextInt();
            if (x >=1 && x <= 9){
                System.out.println("X merupakan satuan");
            }
            else if(x >= 10 ){
                System.out.println("X merupakan puluhan");

            }
            else if (x >=99){
                System.out.println("X merupakan ratusan");

            }
            else{
                System.out.println("Inputan tidak valid");
            }
            }
}

package day2.latihan2;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {

        int a ;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Tebakan = ");
        a = input.nextInt();

        if(a<=5){
            System.out.println("Anda Menang");
        }else if(a>=6){
            System.out.println("Anda Kalah");
        }else{
            System.out.println("tebakan salah");
        }
        System.out.println("Angka Random = " + a);
    }
}

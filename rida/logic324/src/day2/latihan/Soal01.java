package day2.latihan;

import java.util.Scanner;

public class Soal01 {
    /*Soal 01
Diketahui x sebuah angka inputan user dengan range 1 <= x <= 999.
Buatlah program untuk mendeteksi apakah angka yang diinputkan user
 berupa satuan, puluhan, ratusan atau input tidak valid.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        Integer x= input.nextInt();
        if(1<=x && x<= 999){
            if(1<=x && x<=9){
                System.out.println( x+" Bilangan satuan");
            }else if(x>=10 && x<=99){
                System.out.println(x+ " Bilangan puluhan ");
            }else if(x>=100 && x<=999){
                System.out.println(x+ " Bilangan ratusan ");
            }
        }else{
            System.out.println("Input tidak valid");
        }

    }
}

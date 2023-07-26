package latihanday2;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);



        System.out.println("masukan angka= ");
        int a = angka.nextInt();

        if (a%2==0){
            System.out.println(+a +" adalah bilangan genap");
        }else{
            System.out.println(+a + " adalah bilangan ganjil");
        }
    }

}

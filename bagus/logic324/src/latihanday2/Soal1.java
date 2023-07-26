package latihanday2;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        Scanner angka = new Scanner(System.in);

        System.out.print("masukan angka= ");
        int x = angka.nextInt();

        if(x<=9){
            System.out.println( +x + " adalah angka satuan");
        }else if(x>=10 && x<=99) {
            System.out.println(+x +" adalah angka puluhan");
        }else if (x>=100 && x<=999) {
            System.out.println(+x +" adalah bilangan ratusan");
        }else{
            System.out.println("input tidak valid");
        }


    }
}

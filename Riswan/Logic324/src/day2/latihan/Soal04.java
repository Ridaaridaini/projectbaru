package day2.latihan;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan X : ");
        int x = input.nextInt();

        if((x % 2)== 0){
            System.out.println("Merupakan bilangan genap dengan nilai : "+x);
        }else {
            System.out.println("Merupakan bilangan ganjil dengan nilai : "+x);
        }
    }
}

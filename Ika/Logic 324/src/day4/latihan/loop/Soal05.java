package day4.latihan.loop;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        //Tampilkan angka-angka kelipatan 3 yang merupakan bilangan genap dibawah inputan x

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan angka x: ");
        int x = scan.nextInt();

        scan.close();

        for (int i = 1; i < x; i++) {
            if(i%3==0){
                if(i%2==0){
                    System.out.print(i + " ");
                    continue;
                }
            }else{
                continue;
            }
        }
    }
}

package day2.Latihan2;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        //Diketahui x adalah bilangan bulat yang diinputkan oleh user.
        //Buatlah program untuk menentukan x adalah bilangan ganjil atau genap!
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan bilangan bulat x: ");
        int x= scan.nextInt();

        scan.close();

        if(x %2 ==0){
            System.out.println(x + " adalah bilangan genap");
        }else{
            System.out.println(x+ " adalah bilangan ganjil");
        }
    }
}

package day6.latihan;

import java.util.Scanner;

public class soal06 {
    public static void main(String[] args) {
        //"Terdapat sebuah inputan kata x.
        //Tentukan apakah kata tersebut palindrom atau bukan.
        //contoh :
        //input : makan
        //output : bukan kata palindrom
        //contoh :
        //input : katak
        //output : kata palindrom"


        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String x = scanner.nextLine();
        x = x.toLowerCase();
        String reverse = "";
        String[] output = x.replace(" ","").split("");
        String original= x.replace(" ","");


        for (int i = output.length-1; i >=0 ; i--) {
//            System.out.print(output[i]);
            reverse= reverse + output[i];
        }
//        System.out.println();
        if(reverse.equals(original)){
            System.out.println("pelindrome");
        }else{
            System.out.println("bukan palindrome");
        }

    }
}

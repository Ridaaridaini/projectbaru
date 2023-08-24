package Catatan;

import java.util.Scanner;

public class Palindrom {
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
        String[] kalimat = scanner.nextLine().toLowerCase().replace(" ","").split("");
        String palindrom = "";
        String kal="";

        for (int i = kalimat.length-1; i >= 0 ; i--) {
            palindrom = palindrom+ kalimat[i];
        }
        System.out.print(palindrom);

        System.out.println();
        for (int i = 0; i < kalimat.length; i++) {
            kal = kal + kalimat[i];
        }
        System.out.println(kal);

        if(kal.equalsIgnoreCase(palindrom)){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }


    }
}

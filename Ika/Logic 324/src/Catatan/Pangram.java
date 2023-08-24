package Catatan;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();

        kalimat = kalimat.toLowerCase().replace(" ","");
        String[] arrKal= kalimat.split("");
        String b="";

        Arrays.sort(arrKal);
        for (int i = 0; i < arrKal.length; i++) {
            if(!b.contains(arrKal[i])){
                b= b + arrKal[i];
            }
        }
        System.out.println(b);
        if(b.length()==26){
            System.out.println("Pangram");
        }else {
            System.out.println("Bukan Pangram");
        }


    }
}

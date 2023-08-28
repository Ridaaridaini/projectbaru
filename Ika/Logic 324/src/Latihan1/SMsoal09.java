package Latihan1;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class SMsoal09 {
    public static void main(String[] args) {
        //"Diberikan 2 buah kata, Buatlah sebuah program untuk menentukan apakah dua string tersebut mengandung substring yang sama.
        //Substring minimal satu karakter.
        //
        //Cth 1 :
        //Input
        //hello
        //world
        //
        //output
        //YES
        //
        //Cth 2:
        //Input
        //hi
        //world
        //
        //output
        //NO"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat1 : ");
        String[] kal1 = scanner.nextLine().replace(" ","").toLowerCase().split("");

        System.out.print("masukan kalimat 2 : ");
        String[] kal2 = scanner.nextLine().toLowerCase().replace(" ","").split("");
        String tampungan ="";

        for (int i = 0; i < kal1.length; i++) {
            for (int j = 0; j < kal2.length; j++) {
                if(kal1[i].contains(kal2[j])){
                    tampungan= tampungan+kal2[j];
                }
            }
        }
        if (tampungan.length()>=1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

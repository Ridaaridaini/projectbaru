package day6.latihan6;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("kalimat = ");
        String kalimat = scanner.nextLine(); // ["Irfan Afandi"] => 12

        //String tampungstr = "Dwane Irfan";

        //Upercase
        //tampungstr = "Dwane Irfan".toUpperCase(); //

        // split
        String[] arrA = kalimat.split(" "); // ["Irfan"]["Afandi"] = PANJANG 2 KOTAK
                                                // INDEX  0          1

        //CharArt
       // char a = arrA[0].charAt(0);
        //System.out.println(a);

       // char b = arrA[1].charAt(0);
        //System.out.println(b);


        for (int i = 0; i < arrA.length; i++) { // i = 0,1,2  kalimat.length => 12
            char a = (arrA[i].charAt(0)); // A
            System.out.print(a); // A
        } //output = IA
    }
}


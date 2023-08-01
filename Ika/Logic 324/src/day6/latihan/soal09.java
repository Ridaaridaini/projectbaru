package day6.latihan;

import java.util.Scanner;

public class soal09 {
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
        System.out.print("Masukan kalimat1: ");
        String input1 = scanner.nextLine();

        System.out.print("masukan kalimat2: ");
        String input2 = scanner.nextLine();
        String b="";

        String[] output = input2.split("");
        for (int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
            b= output[i];
        }
        if(input1.contains(b)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

    }

}

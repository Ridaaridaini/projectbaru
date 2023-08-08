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
        boolean b=false;

        String[] output = input2.replace(" ","").split("");
        String[] output2 = input1.replace(" ","").split("");
        for (int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
            for (int j = 0; j < output2.length; j++) {
                if (output[i].contains(output2[j])){
                    b=true;
                }
            }
        }
        if(b){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

    }

}

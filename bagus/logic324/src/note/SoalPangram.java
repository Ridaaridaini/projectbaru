package note;

import java.util.Scanner;

public class SoalPangram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();

        kalimat = kalimat.toLowerCase().replace(" ","");
        String[] arrKal= kalimat.split("");
        String tampungan = "";
        String b="";

        for(char i= 'a'; i<='z'; i++ ){
            if(kalimat.indexOf(i) != -1){
                tampungan = tampungan +i;
            }
        }
        if(tampungan.length()==26){
            System.out.println("pangram");
        }else {
            System.out.println("not pangram");
        }

        System.out.println("=========cara 2==============");
        for (int i = 0; i < arrKal.length; i++) {
            if (!b.contains(arrKal[i])) {
                b= b + arrKal[i];//untuk menampung abjad yang berbeda
            }

        }
        if(b.length()==26){//jika mengandung semua abjad maka panagram
            System.out.println("panagram");
        }else {
            System.out.println("not pangram");
        }

    }
}

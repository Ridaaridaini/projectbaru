package day6.latihan;

import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {

        boolean satus = false;
        String kalimat = "The quick brown fox jumps over a lazy dog";
        String replaceSpace = kalimat.replace(" ", "");
        String[] arrkalimat = replaceSpace.split("");

        Scanner scanner = new Scanner(System.in);

        System.out.print("char: ");
        String karakter = scanner.nextLine();

        for (int i = 0; i < arrkalimat.length; i++) {

            if (arrkalimat[i].equalsIgnoreCase(karakter)){
                satus = true;
                System.out.println("karakter " + karakter + " ada dalam kalimat");
                break;
            }

        }

        if (satus == false){
            System.out.println("karakter " + karakter + " tidak ada dalam kalimat");
        }




    }

}

package day10;

import java.util.Scanner;

public class StringManipulation1KarakterUnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kal = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "").replace(" ","");
        String[] arrKal = kal.split("");
        String kalimat = "";


        for (int i = 0; i < arrKal.length; i++) {
            if(!kalimat.contains(arrKal[i])){
                kalimat=kalimat+arrKal[i];
            }
        }
        System.out.println(kalimat+ " ");
        System.out.println("karakter unik : " + kalimat.length());


    }
}

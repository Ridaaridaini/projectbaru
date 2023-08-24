package Catatan;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat 1: ");
        String[] kal1 = scanner.nextLine().toLowerCase().replace(" ","").split("");

        System.out.print("masukan kalimat 2 : ");
        String[] kal2 = scanner.nextLine().toLowerCase().replace(" ","").split("");

        Arrays.sort(kal1);
        Arrays.sort(kal2);
        String sortKal1="";
        String  sortKal2= "";
        for (int i = 0; i < kal1.length; i++) {
            sortKal1= sortKal1+ kal1[i];
        }
        System.out.println(sortKal1);

        for (int i = 0; i < kal2.length; i++) {
            sortKal2 = sortKal2 + kal2[i];
        }
        System.out.println(sortKal2);

        if(sortKal1.equalsIgnoreCase(sortKal2) && sortKal1.length()==sortKal2.length()){
            System.out.println("anagram");
        }else {
            System.out.println("bukan anagram");
        }


    }
}

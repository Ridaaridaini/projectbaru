package latihanulang;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String[] kalimat=input.nextLine().toLowerCase().replace(" ","").split("");
        Arrays.sort(kalimat);
        String konsonan="", vokal="";
        for (int i = 0; i < kalimat.length; i++) {
            char kata=kalimat[i].charAt(0);
            if (kata=='a'||kata=='i'||kata=='u'||kata=='e'||kata=='o'){
                vokal=vokal+String.valueOf(kata);
            }else{
                konsonan=konsonan+String.valueOf(kata);
            }
        }
        System.out.println("Huruf Vokal: "+vokal);
        System.out.println("Huruf Konsonan: "+konsonan);
    }
}

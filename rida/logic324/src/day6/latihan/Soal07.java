package day6.latihan;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String kataX= input.nextLine();
        String[] kata= kataX.replace(" ","").split("");
        String str="";
        int jumlah=0;
        for (int i = 0; i < kata.length; i++) {
            //str=str+kata[i];
            if(str.contains(kata[i])){
                jumlah=jumlah+1;
                //System.out.print(str);
            }else {
                str = str + kata[i];
            }

        }
        System.out.print(str);
        System.out.println();
        System.out.println(str.length()+" karakter");
    }
}

package Latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Modus {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("input angka : ");
        String  angka = scanner.nextLine();

        String[] arrAngka = angka.replace(" ","").split("");
        //mencari modus
        int maks=0, modus=0 , chek=0;
        Arrays.sort(arrAngka);
        for (int i = 0; i < arrAngka.length; i++) {
            chek=1;
            for (int j = i+1; j < arrAngka.length; j++) {
                if(Integer.parseInt(arrAngka[i])==Integer.parseInt(arrAngka[j])){
                    chek=chek+1;
                }
            }if(chek>maks){
                maks=chek;
                modus=Integer.parseInt(arrAngka[i]);
            }

        }
        System.out.println("modus "+modus);
    }
}

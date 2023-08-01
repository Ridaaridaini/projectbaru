package day6.latihan6;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan kata: ");
        String kalimat = input.nextLine();//makan

        String[] kalSplit = kalimat.split("");//{m,a,k,a,n}
        String kalSplitBalik = ""; //nakam

        for (int i = kalSplit.length - 1; i >= 0; i--) {//i=4:true; i=3;true; i=2;true; i=1;true; i=0;true;i=-1;false

//            System.out.print(kalSplit[i] + " ");
            kalSplitBalik =  kalSplitBalik + kalSplit[i];


        }
//        System.out.println(kalSplitBalik);

        if (kalimat.equalsIgnoreCase(kalSplitBalik)){
            System.out.println("palindrom");
        }else {
            System.out.println("bukan");
        }
    }
}

//n a k a m;

//nakam
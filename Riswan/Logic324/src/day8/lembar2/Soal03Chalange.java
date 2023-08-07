package day8.lembar2;

import java.util.Scanner;

public class Soal03Chalange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan N : ");
        int jumlahN = 0;
        int jumlahInput =input.nextInt();
        int paten = 100;
        int tampungLebih9 = 0;
        String berubahString = "";

        for (int u = 1; true; u++) {
            String angkaStr = Integer.toString(paten);
            String[] angkaAry = angkaStr.split("");
            double hasilAngkaAry = 0;

            for (int i = 0; i < angkaAry.length; i++) {
//                System.out.print(angkaAry[i]);
                hasilAngkaAry = hasilAngkaAry + Integer.parseInt(angkaAry[i])*Integer.parseInt(angkaAry[i]);
                while (hasilAngkaAry>=11){
                    berubahString = Integer.toString((int) hasilAngkaAry);
                    hasilAngkaAry = 0;

                    String[] lebih10 = berubahString.split("");
                    for (int j = 0; j < lebih10.length; j++) {
                        hasilAngkaAry = hasilAngkaAry + Integer.parseInt(lebih10[j])*Integer.parseInt(lebih10[j]);
                    }
                    if(hasilAngkaAry<12){
                        break;
                    }
                }
            }
            //System.out.println("angka ke "+ paten +" "+hasilAngkaAry);
            if (1 == (int) hasilAngkaAry){
                System.out.println(paten+" merupakan si Angka 1");
                jumlahN = jumlahN +1;
                if (jumlahN==jumlahInput){
                    break;
                }
            } if (10 ==(int) hasilAngkaAry) {
                System.out.println(paten+" merupakan si Angka 10");
                jumlahN = jumlahN +1;
                if (jumlahN==jumlahInput){
                    break;
                }
            }
            paten = paten+1;
        }
    }
}

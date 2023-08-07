package day7.latihan01B;

import java.util.Scanner;

public class Soal03Challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilai = 100;
        int start = 100;
        System.out.print("masukan n: ");
        int n = scanner.nextInt();
        int m = 0;

        while (m < n) {//m=0
            while (nilai > 10) {
                String nString = String.valueOf(nilai);
                String[] nArrString = nString.split("");
                double hasilTambah = 0;
                for (int i = 0; i < nArrString.length; i++) {
                    int nArrParse = Integer.parseInt(nArrString[i]);
                    hasilTambah = hasilTambah + Math.pow(nArrParse, 2);
//                    System.out.println(hasilTambah);
                }

                if (hasilTambah <= 9) {
                    if (hasilTambah == 1) {
                        System.out.println(start + " adalah \"Si Angsa 1\"");
                        start = start + 1;
                        nilai = start;
                        m++;
                        break;
                    } else {
                        start = start + 1;
                        nilai = start;
                        break;
                    }

                }
                nilai=(int )hasilTambah;

                if(hasilTambah==10){
                    System.out.println(start+ " adalah \"Si Angsa 10\" ");
                    start = start+1;
                    nilai = start;
                    m++;
                    break;
                }
            }

        }
    }
}

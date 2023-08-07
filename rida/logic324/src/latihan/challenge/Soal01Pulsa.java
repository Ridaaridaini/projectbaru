package latihan.challenge;

import java.util.Scanner;

public class Soal01Pulsa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Beli pulsa Rp: ");
        Integer pulsa = input.nextInt();
        int point1 = 0,point2=0,point3=0;
        int sisaPulsa = 0;
        int pointTambah=0;
        if(pulsa%50000==0 || pulsa>50000){
            pointTambah=(pulsa/50000)*100;
        }
        if (pulsa <= 10000 && pulsa > 0) {
            point1=0;
        }
        if (pulsa > 10000) {
            if (pulsa > 10000 && pulsa <= 30000) {
                sisaPulsa = pulsa - 10000;
                point2 = point2 + (sisaPulsa / 1000);
            } else {
                sisaPulsa = pulsa - 30000;
                point2 = point2 + (20000 / 1000);
            }
        }
        if (pulsa>30000){
            sisaPulsa=pulsa-30000;
            point3=point3+((sisaPulsa / 1000)*2);
        }
        int jumlah=point1+point2+point3;
        System.out.println(point1+ " + "+point2+" + "+point3+" = "+jumlah+" point");
        System.out.println("point tambahan: "+pointTambah);
        jumlah=jumlah+pointTambah;
        System.out.println("Total Point: "+jumlah);
    }
}

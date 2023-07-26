package day1;

import java.text.DecimalFormat;

public class MathFunction {
    public static void main(String[] args) {
        //perpangkatan
        System.out.println((int) Math.pow(2,8));// (2,8) 2 angka yang mau dipangkatkan sedangkan 8 adalah perpangkatnnya 2^8

        // absolute
        System.out.println(Math.abs(-15)); //biasanya digunakan untuk menghitung selisih

        // pembulatan
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.4));

        //pembulatan keatas
        System.out.println(Math.ceil(2.3));

        //pembulatan kebawah
        System.out.println(Math.floor(2.7));

        //desimal formaat
        double a = 100.0;
        int b = 3;
        DecimalFormat df = new DecimalFormat("##.00");
        String pembagian = df.format(a/b);
        System.out.println(pembagian);




    }
}

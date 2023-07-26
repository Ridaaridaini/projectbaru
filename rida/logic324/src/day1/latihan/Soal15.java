package day1.latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Soal15 {
    public static void main(String[] args) {
        //Catatan untuk decimal format
        //DecimalFormat df= new DecimalFormat("##.00");
        //DecimalFormat ini berfungsi untuk membatasi berapa angka dibelakang "," yang akan di outputkan.
        //contoh cara menggunakan format
        //df.format menggunakan String karena String non primitif(var primitif digunakan sebagai memeber)
        //String x=df.format(x*z);
        //contoh lainnya
        //String terigu2 = df.format(terigu*n);
        //String gula2 = df.format(gula*n);
        //String susu2 = df.format(susu*n);
        double x,y;
        x= 125/15;
        y=100/15;
        Scanner input = new Scanner(System.in);
        System.out.print("Berapakah cupcake yang ingin anda buat = ");
        Integer z= input.nextInt();
        System.out.println("Maka Terigu yang dibutuhkan= "+(x*z)+"gram");
        System.out.println("Maka Gula yang dibutuhkan= "+(y*z)+"gram");
        System.out.println("Maka Susu yang dibutuhkan= "+(x*z)+"mL");

    }
}

package day7.latihan01A;

import java.util.Scanner;

public class soal02 {
    public static void main(String[] args) {

        //toko ke tempat 1 = 2km
        //tempat 1 ke tempat 2 = 500m
        //tempat 2 ke tempat 3 = 1.5 km
        //tempat 3 ke tempat 4= 2.5 km

        double tempat1 ,tempat2, tempat3, tempat4, bensin;
        tempat1=2.0;
        tempat2=0.5;
        tempat3=1.5;
        tempat4=2.5;

        String a="tempat 1";
        String b="tempat 2";
        String c="tempat 3";
        String d="tempat 4";



        Scanner scanner = new Scanner(System.in);
        System.out.println("perjalanan dimulai dari toko kemudian kembali ke toko");
        System.out.print("masukan tujuan 1 :");
        String tujuan1 =scanner.nextLine();
        System.out.print("masukan tujuan 2 :");
        String tujuan2 =scanner.nextLine();
        System.out.print("masukan tujuan 3 :");
        String tujuan3 =scanner.nextLine();
        System.out.print("masukan tujuan 4 :");
        String tujuan4 =scanner.nextLine();

        double rute1,rute2,rute3,rute4;
        double output;

        //rute toko-tempat1-tempat2-tempat3-tempat4-toko
        rute1= tempat1+tempat2+tempat3+tempat4+6.5;//6.5 untuk kembali ke toko dari tempat 4
        //rute toko-tempat1+tempat2+tempat3
        rute2= tempat1+tempat2+tempat3+4;
        //rute untuk toko-tempat1-tempat2;
        rute3=tempat1+tempat2+2.5;


        if(tujuan1.equalsIgnoreCase(a) && tujuan2.equalsIgnoreCase(b) && tujuan3.equalsIgnoreCase(c) && tujuan4.equalsIgnoreCase(d)){
            output = rute1/2.5;
            System.out.println(output + " liter");
        } else if (tujuan1.equalsIgnoreCase(a) && tujuan2.equalsIgnoreCase(b) && tujuan3.equalsIgnoreCase(c)) {
            output = rute2/2.5;
            System.out.println(output + " liter");
        } else if (tujuan1.equalsIgnoreCase(a) && tujuan2.equalsIgnoreCase(b)) {
            output = rute3/2.5;
            System.out.println(output + " liter");
        } else if (tujuan1.equalsIgnoreCase(a)) {
            output = (tempat1*2)/2.5;
            System.out.println(output + " liter");
        }


        if(tujuan1.equalsIgnoreCase(b) && tujuan2.equalsIgnoreCase(c) && tujuan3.equalsIgnoreCase(d) && tujuan4.equalsIgnoreCase(a)){
            output = rute1/2.5;
            System.out.println(output + " liter");
        } else if (tujuan1.equalsIgnoreCase(b) && tujuan2.equalsIgnoreCase(c) && tujuan3.equalsIgnoreCase(d)) {
            output = rute1/2.5;
            System.out.println(output + " liter");
        } else if (tujuan1.equalsIgnoreCase(b) && tujuan2.equalsIgnoreCase(c)) {
            output = ((tempat1+tempat2+tempat3)*2)/2.5;
            System.out.println(output + " liter");
        } else if (tujuan1.equalsIgnoreCase(b)) {
            output = ((tempat1+tempat2)*2)/2.5;
            System.out.println(output + " liter");
        }

        if(tujuan1.equalsIgnoreCase(c) && tujuan2.equalsIgnoreCase(d) && tujuan3.equalsIgnoreCase(a) && tujuan4.equalsIgnoreCase(b)){
            output = rute1/2.5;
            System.out.println(output + " liter");
        } else if (tujuan1.equalsIgnoreCase(c) && tujuan3.equalsIgnoreCase(d)) {
            output = rute1/2.5;
            System.out.println(output + " liter");
        } else if (tujuan1.equalsIgnoreCase(c)) {
            output = ((tempat1 + tempat2 + tempat3) * 2) / 2.5;
            System.out.println(output + " liter");
        }

        if(tujuan1.equalsIgnoreCase(d)){
            output = rute1/2.5;
            System.out.println(output + " liter");
        }

    }

}

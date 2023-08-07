package day7.latihan01A;

import java.util.Scanner;

public class soal03Challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pilihan konversi \n1.botol \n2.teko \n3.gelas \n4.cangkir");
        System.out.println();

        System.out.print("konversi : ");
        String konversi = scanner.nextLine();
        System.out.print("berapa yang mau di konversi: ");
        double b = scanner.nextInt();
        scanner.nextLine();



        System.out.print("ke : ");
        String ke =scanner.nextLine();
        double hasil;

        //mengkonversi dari cangkir
        if(konversi.equalsIgnoreCase("Cangkir") && ke.equalsIgnoreCase("botol")){
            hasil = b * 1/5.0;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        } else if (konversi.equalsIgnoreCase("cangkir") && ke.equalsIgnoreCase("teko")) {
            hasil= b * 1/25.0;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        } else if (konversi.equalsIgnoreCase("cangkir") && ke.equalsIgnoreCase("gelas")) {
            hasil= b *  1/2.5;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        }


        //mengkonversi dari gelas
        if(konversi.equalsIgnoreCase("gelas") && ke.equalsIgnoreCase("botol")){
            hasil = b * 1/2.0;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        } else if (konversi.equalsIgnoreCase("gelas") && ke.equalsIgnoreCase("teko")) {
            hasil= b * 1/10.0;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        } else if (konversi.equalsIgnoreCase("gelas") && ke.equalsIgnoreCase("cangkir")) {
            hasil=b * 2.5;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        }

        //mengkonversi dari teko
        if(konversi.equalsIgnoreCase("teko") && ke.equalsIgnoreCase("botol")){
            hasil = b * 10.0/2.0;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        } else if (konversi.equalsIgnoreCase("teko") && ke.equalsIgnoreCase("cangkir")) {
            hasil= b * 25.0;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        } else if (konversi.equalsIgnoreCase("teko") && ke.equalsIgnoreCase("gelas")) {
            hasil= b * 25.0/2.5;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        }

        //mengkonversi dari botol
        if(konversi.equalsIgnoreCase("botol") && ke.equalsIgnoreCase("cangkir")){
            hasil = b * 2.5 * 2;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        } else if (konversi.equalsIgnoreCase("botol") && ke.equalsIgnoreCase("teko")) {
            hasil= b * 1/5.0;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        } else if (konversi.equalsIgnoreCase("botol") && ke.equalsIgnoreCase("gelas")) {
            hasil=b * 2;
            System.out.println("hasil konversi dari " + konversi + " ke " + ke + " adalah " + hasil);
        }


    }
}

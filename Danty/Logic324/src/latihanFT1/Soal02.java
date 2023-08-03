package latihanFT1;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double tempat1 = 2.0; //dalam satuan km
        double tempat2 = 0.5;
        double tempat3 = 1.5;
        double tempat4 = 2.5;

        double bensin = 2.5; //per 1 km

        System.out.print("Tujuan 1 : ");
        String tujuan1 = input.nextLine();

        System.out.print("Tujuan 2 : ");
        String tujuan2 = input.nextLine();

        System.out.print("Tujuan 3 : ");
        String tujuan3 = input.nextLine();

        System.out.print("Tujuan 4 : ");
        String tujuan4 = input.nextLine();

        //Anggap toko adalah titik 0

        //Kondisi disini akan dihitung dari tujuan sampai kembali ke toko, sehingga jarak nanti akan di kali 2

        //Titik Awal = Toko

        if (tujuan1.equalsIgnoreCase("Tempat 1") && tujuan2.equalsIgnoreCase("Tempat 2")
                && tujuan3.equalsIgnoreCase("Tempat 3") && tujuan4.equalsIgnoreCase("Tempat 4")) {

            double jarak = (tempat1 + tempat2 + tempat3 + tempat4) * 2;
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Toko - Tempat 1 - Tempat 2 - Tempat 3 - Tempat 4 - Toko");
            System.out.print(bensinJalan + " liter");

        } else if (tujuan1.equalsIgnoreCase("Tempat 1") && tujuan2.equalsIgnoreCase("Tempat 2")
                && tujuan3.equalsIgnoreCase("Tempat 3")) {

            double jarak = (tempat1 + tempat2 + tempat3) * 2;
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Toko - Tempat 1 - Tempat 2 - Tempat 3 - Toko");
            System.out.print(bensinJalan + " liter");
        } else if (tujuan1.equalsIgnoreCase("Tempat 1") && tujuan2.equalsIgnoreCase("Tempat 2")) {

            double jarak = (tempat1 + tempat2) * 2;
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Toko - Tempat 1 - Tempat 2 - Toko");
            System.out.print(bensinJalan + " liter");

        } else if (tujuan1.equalsIgnoreCase("Tempat 1")) {

            double jarak = (tempat1) * 2;
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Toko - Tempat 1 - Toko");
            System.out.print(bensinJalan + " liter");
        }

        // Titik Awal Tempat 1 sampai kembali ke toko

        if (tujuan1.equalsIgnoreCase("Tempat 2") && tujuan2.equalsIgnoreCase("Tempat 3")
                && tujuan3.equalsIgnoreCase("Tempat 4")) {

            double jarak = ((tempat2 + tempat3 + tempat4) * 2) + tempat1; //kenapa begini, karena pada saat kembali ke toko akan melewati tempat 1
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Tempat 1 - Tempat 2 - Tempat 3 - Tempat 4 - Toko");
            System.out.print(bensinJalan + " liter");

        } else if (tujuan1.equalsIgnoreCase("Tempat 2") && tujuan2.equalsIgnoreCase("Tempat 3")) {

            double jarak = ((tempat2 + tempat3) * 2) + tempat1;
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Tempat 1 - Tempat 2 - Tempat 3 - Toko");
            System.out.print(bensinJalan + " liter");
        } else if (tujuan1.equalsIgnoreCase("Tempat 2")) {

            double jarak = (tempat2 * 2) + tempat1;
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Tempat 1 - Tempat 2 - Toko");
            System.out.print(bensinJalan + " liter");
        }

        // Titik Awal Tempat 2 sampai kembali ke toko

        if (tujuan1.equalsIgnoreCase("Tempat 3") && tujuan2.equalsIgnoreCase("Tempat 4")) {

            double jarak = ((tempat3 + tempat4) * 2) + tempat2 + tempat1; //kenapa begini, karena pada saat kembali ke toko akan melewati tempat 1
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Tempat 2 - Tempat 3 - Tempat 4 - Toko");
            System.out.print(bensinJalan + " liter");

        } else if (tujuan1.equalsIgnoreCase("Tempat 3") && tujuan1.equalsIgnoreCase("Tempat 2")
                && tujuan1.equalsIgnoreCase("Tempat 1")) {

            double jarak = (tempat3 * 2) + tempat2 + tempat1;
            double bensinJalan = jarak / bensin;

            System.out.println("Rute :  Tempat 2 - Tempat 3 - Toko");
            System.out.print(bensinJalan + " liter");
        }

        //Titik Awal tempat 3

        if (tujuan1.equalsIgnoreCase("Tempat 4") && tujuan1.equalsIgnoreCase("Tempat 3")
                && tujuan1.equalsIgnoreCase("Tempat 2") && tujuan1.equalsIgnoreCase("Tempat 1")) {

            double jarak = (tempat4 * 2) + tempat3 + tempat2 + tempat1; //kenapa begini, karena pada saat kembali ke toko akan melewati tempat 1
            double bensinJalan = jarak / bensin;

            System.out.println("Rute : Tempat 3 - Tempat 4 - Toko");
            System.out.print(bensinJalan + " liter");


        }




    }
}

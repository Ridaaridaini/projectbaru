package day1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("masukan nama: ");
//        String nama = input.nextLine();
//
//        System.out.println("masukan umur: ");
//        Integer umur = input.nextInt();
//
//        System.out.println("Nama :" +nama);
//        System.out.println("Umur: " +umur);

//        int panjang;
//        int lebar;
//        int tinggi;
          int hasil;

        System.out.println("masukan panjang: ");
        Integer panjangBalok = input.nextInt();

        System.out.println("masukan lebar: ");
        Integer lebarBalok = input.nextInt();

        System.out.println("masukan tinggi: ");
        Integer tinggiBalok = input.nextInt();

        hasil = panjangBalok*lebarBalok*tinggiBalok;

        System.out.println("hasil keliling balok: " +hasil);


        input.close();
    }

}

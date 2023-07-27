package day2.latihan2;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        //Diketahui bahwa untuk tiap nilai memiliki arti hari seperti berikut
        //1 = Senin
        //2 = Selasa
        //3 = Rabu
        //4 = Kamis
        //5 = Jumat
        //6 = Sabtu
        //7 = Minggu
        //8 = Senin
        //9 = Selasa
        //dst...
        //Buatlah program untuk menentukan hari jika user melakukan input dengan bilangan x

        Scanner scan = new Scanner(System.in);
        System.out.print("masukan tanggal: ");
        int x = scan.nextInt();
        scan.close();

        // pengerjaan dengan menggunakan if
        if(x % 7 ==1){
            System.out.println("Senin");
        } else if (x%7 ==2) {
            System.out.println("Selasa");
        } else if (x%7==3) {
            System.out.println("Rabu");
        } else if (x%7==4) {
            System.out.println("Kamis");
        } else if (x%7==5) {
            System.out.println("Jumat");
        } else if (x%7==6) {
            System.out.println("Sabtu");
        }else{
            System.out.println("Minggu");
        }


        //pengerjaan dengan swiitch

        switch (x%7){
            case 1:
            System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            default:
                System.out.println("Minggu");
                break;
        }
    }
}

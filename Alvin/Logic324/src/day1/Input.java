package day1;

import java.util.Date;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //instansiasi
        Scanner input = new Scanner(System.in);

        System.out.print("inputkan nama: ");
        String myName =  input.nextLine();
        System.out.print("umur: ");
        int myUmur = input.nextInt();
        input.close();

        Date tahun = new Date();
        int date = tahun.getYear();

        int tahunLahir = (date+1900)-myUmur;

        System.out.println("nama saya "+myName);
        System.out.println("umur saya "+myUmur);
        System.out.println("tahun lahir "+tahunLahir);
    }
}

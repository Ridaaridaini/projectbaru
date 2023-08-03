package day8;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lakiDewasa = 0;
        double perempuanDewasa = 0;
        double balita = 0;
        double remaja = 0;
        double anak = 0;
        double porsi = 0;

        boolean keputusan = true;
        while (keputusan){
            System.out.print("Laki Laki Dewasa  : ");
            lakiDewasa = input.nextDouble();
            System.out.print("Perempuan Dewasa  : ");
            perempuanDewasa = input.nextDouble();
            System.out.print("Balita            : ");
            balita = input.nextDouble();
            System.out.print("Remaja            : ");
            remaja = input.nextDouble();
            System.out.print("Anak-Anak         : ");
            anak = input.nextDouble();

            input.nextLine();

            System.out.println("Laki-laki Dewasa    : "+lakiDewasa);
            System.out.println("Perempuan Dewasa    : "+perempuanDewasa);
            System.out.println("Balita              : "+balita);
            System.out.println("Remaja              : "+remaja);
            System.out.println("Anak-anak           : "+anak);
            System.out.println("apakah Sudah benar : (ya/tidak)");
            String hasil = input.nextLine();
            if (hasil.equalsIgnoreCase("ya")){
                keputusan=false;
            }
        }

        double jumlahOrang = lakiDewasa+perempuanDewasa+balita+remaja+anak;
        System.out.println(jumlahOrang);
        int jmlOrg = (int) jumlahOrang;
        if(jmlOrg>5 && jmlOrg % 2==1){
            porsi = (lakiDewasa*2) + (perempuanDewasa*2)+balita+remaja+(anak/2);
            System.out.println(porsi +" porsi");
        }else {
            porsi = (lakiDewasa*2) + perempuanDewasa+balita+remaja+(anak/2);
            System.out.println(porsi +" porsi");
        }
    }
}

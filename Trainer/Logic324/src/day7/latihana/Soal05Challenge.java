package day7.latihana;

import java.util.Scanner;

//Jika laki-laki dewasa lebih banyak daripada perempuan dewasa, tambah porsi sebanyak laki-laki dewasa
public class Soal05Challenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input misalnya : ");
        System.out.println("Laki-laki dewasa = 3 orang; Perempuan dewasa = 1 orang; Balita = 1 orang; Laki-laki dewasa = 1 orang;");
        String input = scanner.nextLine();

        int jmlLakiDewasa = 0;
        int jmlPerempuanDewasa = 0;
        int jmlRemaja = 0;
        int jmlAnak = 0;
        int jmlBalita = 0;

        //"laki-lakidewasa=3;perempuandewasa=1;balita=1;laki-lakidewasa=1orang;"
        input = input.toLowerCase().replace(" ", "").replace("orang","");

        String[] arrInput = input.split(";");
        for (int i = 0; i < arrInput.length; i++) {
            String orang = arrInput[i]; //laki-lakidewasa=3
            String[] arrOrang = orang.split("=");
            int jumlah = Integer.parseInt(arrOrang[1]);//3

            if (orang.contains("laki")){
                jmlLakiDewasa = jumlah + jmlLakiDewasa;
            } else if (orang.contains("perempuan")){
                jmlPerempuanDewasa = jumlah + jmlPerempuanDewasa;
            } else if (orang.contains("remaja")){
                jmlRemaja = jumlah + jmlRemaja;
            } else if (orang.contains("balita")){
                jmlBalita = jumlah + jmlBalita;
            } else if (orang.contains("anak")){
                jmlAnak = jumlah + jmlAnak;
            }
        }

        //perhitungan porsi
        int totalOrang = jmlLakiDewasa + jmlPerempuanDewasa + jmlBalita + jmlRemaja + jmlAnak;
        double porsi = (jmlLakiDewasa * 2) + (jmlPerempuanDewasa * 1) + (jmlBalita * 1) + (jmlAnak * 0.5) + (jmlRemaja * 1);

        if (totalOrang > 5 && totalOrang % 2 == 1){
            porsi = porsi + jmlPerempuanDewasa;
        }

        if (jmlLakiDewasa > jmlPerempuanDewasa){
            porsi = porsi + jmlLakiDewasa;
        }

        System.out.println("Porsi : " + porsi);
    }

}

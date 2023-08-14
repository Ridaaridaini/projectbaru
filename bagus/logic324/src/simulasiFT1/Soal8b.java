package simulasiFT1;

import java.util.Scanner;

public class Soal8b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nama: ");
        String nama = input.nextLine();
        String [] namaSplit = nama.split(" ");

        System.out.println("Masukan Nilai: ");
        String nilai = input.nextLine();
        String [] nilaiSplit = nilai.split(" ");

        for (int i = 0; i < namaSplit.length; i++) {
            if(namaSplit[i].equalsIgnoreCase("andi")){
                if(nilaiSplit[i].equalsIgnoreCase("85")){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            }
            if(namaSplit[i].equalsIgnoreCase("budi")){
                if(nilaiSplit[i].equalsIgnoreCase("70")){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            }
            if(namaSplit[i].equalsIgnoreCase("cindy")){
                if(nilaiSplit[i].equalsIgnoreCase("90")){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            }
            if(namaSplit[i].equalsIgnoreCase("dedi")){
                if(nilaiSplit[i].equalsIgnoreCase("75")){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            }
            if(namaSplit[i].equalsIgnoreCase("eki")){
                if(nilaiSplit[i].equalsIgnoreCase("100")){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            }
        }
    }
}

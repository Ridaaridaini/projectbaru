package simulasiFT1;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nama: ");
        String nama = input.nextLine();
        String [] namaSplit = nama.split(" ");

        System.out.println("Masukan Nilai: ");
        String nilai = input.nextLine();
        String [] nilaiSplit = nilai.split(" ");

        for (int i = 0; i < namaSplit.length; i++) {
            for (int j = 0; j < nilaiSplit.length; j++) {
                if (namaSplit[i].equalsIgnoreCase("Andi") && nilaiSplit[j].equalsIgnoreCase("85")){
                    System.out.println("True");
                }else if (namaSplit[i].equalsIgnoreCase("Budi") && nilaiSplit[j].equalsIgnoreCase("70")){
                    System.out.println("True");
                }else if (namaSplit[i].equalsIgnoreCase("Cindy") && nilaiSplit[j].equalsIgnoreCase("90")){
                    System.out.println("True");
                }else if (namaSplit[i].equalsIgnoreCase("Dedi") && nilaiSplit[j].equalsIgnoreCase("75")){
                    System.out.println("True");
                }else if (namaSplit[i].equalsIgnoreCase("Eki") && nilaiSplit[j].equalsIgnoreCase("100")){
                    System.out.println("True");
                }
            }
        }
    }
}

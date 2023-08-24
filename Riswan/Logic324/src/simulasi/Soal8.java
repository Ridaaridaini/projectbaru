package simulasi;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nama : ");
        String[] nama = input.nextLine().split(" ");
        System.out.println("Nilai : ");
        String[] nilai = input.nextLine().split(" ");

        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase("andi")){
                if (nilai[i].equalsIgnoreCase("85")){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            } else if (nama[i].equalsIgnoreCase("budi")) {
                if (nilai[i].equalsIgnoreCase("70")){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            } else if (nama[i].equalsIgnoreCase("Cindy")) {
                if (nilai[i].equalsIgnoreCase("90")){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            } else if (nama[i].equalsIgnoreCase("dedi")) {
                if (nilai[i].equalsIgnoreCase("75")){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            } else if (nama[i].equalsIgnoreCase("eki")) {
                if (nilai[i].equalsIgnoreCase("100")){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
        }
    }
}

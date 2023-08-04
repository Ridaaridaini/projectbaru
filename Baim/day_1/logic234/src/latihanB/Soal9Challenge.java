package latihanB;

import java.util.Scanner;

public class Soal9Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String[] inputString = scanner.nextLine().toLowerCase().replace(" ", "").split("");

        int tinggi = 1;
        int gunung = 0;
        int lembah = 0;

        for (int i = 0; i < inputString.length; i++) {
            if (inputString[i].equalsIgnoreCase("n")) {
                tinggi++;
            } else {
                tinggi--;
            }

            if (tinggi == 0) {
                if (inputString[i].equalsIgnoreCase("t")) {
                    gunung++;
                } else if (inputString[i].equalsIgnoreCase("n")) {
                    lembah++;
                }
            }
        }

        System.out.println("Gunung: " + (gunung -1));
        if((lembah -1) < 0){
            System.out.println("Lembah: " + 0);
        } else {
            
            System.out.println("Lembah: " + lembah);
        }
        scanner.close();
    }
}

package latihanB;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String[] inputString = scanner.nextLine().toLowerCase().replace(" ", "").split("");

        int tinggi = 0;
        int gunung = 0;
        int lembah = 0;

        for (int i = 0; i < inputString.length; i++) {
            if(inputString[i].equalsIgnoreCase("n")){
                tinggi += 1;
                if(inputString[i].equalsIgnoreCase("t") && tinggi == 0){
                    gunung += 1;
                } else if(inputString[i].equalsIgnoreCase("n") && tinggi == 0){
                    lembah += 1;
                }
            } else {
                tinggi -= 1;
                if(inputString[i].equalsIgnoreCase("n") && tinggi == 0){
                    lembah += 1;
                } else if(inputString[i].equalsIgnoreCase("t") && tinggi == 0){
                    gunung += 1;
                }
            }
        }

        System.out.println("Gunung: " + gunung);
        System.out.println("Lembah: " + lembah);
        scanner.close();
    }
}

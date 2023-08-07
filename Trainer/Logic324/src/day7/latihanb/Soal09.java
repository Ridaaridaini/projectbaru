package day7.latihanb;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("rute : ");
        String rute = scanner.nextLine();
        String[] arrRute = rute.split(" ");

        int mdpl = 0;
        int gunung = 0;
        int lembah = 0;

        for (int i = 0; i < arrRute.length; i++) {
            String aksi = arrRute[i];
            if (aksi.equalsIgnoreCase("n")){
                mdpl++;
                if (mdpl == 0){
                    lembah++;
                }
            } else if (aksi.equalsIgnoreCase("t")){
                mdpl--;
                if (mdpl == 0){
                    gunung++;
                }
            }
        }

        System.out.println("Gunung : " + gunung);
        System.out.println("Lembah : " + lembah);

    }
}

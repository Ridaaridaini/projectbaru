package simulasi;

import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("catatan sasuke: ");
        String[] catatanSasuke = scanner.nextLine().replace(" ", "").split("");

        int road = 0, gunung = 0, lembah = 0;

        for (int i = 0; i < catatanSasuke.length; i++) {

            if (catatanSasuke[i].equalsIgnoreCase("N")){
                road++;

                if (road == 0){
                    lembah++;
                }
            }else {
                road--;

                if (road == 0){
                    gunung++;
                }
            }

        }

        System.out.println("Gunung: " + gunung);
        System.out.println("Lembah: "+ lembah);

    }

}

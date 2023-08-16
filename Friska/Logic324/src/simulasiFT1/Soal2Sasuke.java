package simulasiFT1;

import java.util.Scanner;

public class Soal2Sasuke {
    public static void main(String[] args) {
        //1.Masukkan inputan
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan inputan: ");
        String inputan = input.nextLine();

        //2.Ubah ke split dan array
        String [] arrInputan = inputan.split("");

        //3.Inisialisasi gunung,lembah dan ketinggian
        int gunung = 0;
        int lembah = 0;
        int mdpl = 0;

        //4.Masukkan arr tadi, ke variabel
        for (int i = 0; i < arrInputan.length; i++) {
            String aksi = arrInputan[i];
            if(aksi.equalsIgnoreCase("N")){
                mdpl = mdpl + 1;
                if(mdpl == 0){
                    lembah++;
                }
            } else if (aksi.equalsIgnoreCase("T")) {
                mdpl = mdpl-1;
                if(mdpl == 0){
                    gunung++;
            }
            }

        }
        System.out.println("Gunung: "+gunung+",Lembah: "+lembah);


    }
}
package latihanC;

import java.util.Scanner;

public class SimNo5 {

    public static void main(String[] args) {

        int esLoli = 0, hargaEsKrim = 1000, esGratis = 0, stik = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("uang: ");
        long uang = scanner.nextLong();

        while (uang >= hargaEsKrim){

            uang = uang-hargaEsKrim;
            stik++;
            esLoli++;

            if (stik == 5){
                esGratis++;
                stik = 0;
            }
        }

        int maxEsKrim = esLoli+esGratis;
        System.out.print(maxEsKrim + " Es Loli");


    }

}

package mendalamiLatihanLogic;

import java.util.Scanner;

public class PercabanganSoal05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nilai: ");
        int nilai = scanner.nextInt();

        if (nilai > 7){
            nilai = nilai%7;
        }

        if (nilai >= 0){
            if (nilai == 1){
                System.out.print("Senin");
            } else if (nilai == 2) {
                System.out.print("Selasa");
            } else if (nilai == 3) {
                System.out.print("Rabu");
            } else if (nilai == 4) {
                System.out.print("Kamis");
            } else if (nilai == 5) {
                System.out.print("Jum'at");
            } else if (nilai == 6) {
                System.out.print("Sabtu");
            } else {
                System.out.print("Minggu");
            }
        }

    }

}

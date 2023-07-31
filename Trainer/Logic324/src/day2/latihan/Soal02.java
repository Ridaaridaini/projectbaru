package day2.latihan;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        String musim, hari;
        String hujan = "hujan", panas = "panas", libur = "libur", kerja = "kerja";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Musim: ");
        musim =scanner.nextLine(); //panas
        System.out.print("Hari: ");
        hari = scanner.nextLine(); //libur

        scanner.close();

        // equals() = panas =Panas //false
        // equalsIgnoreCase() pAnAs == panas // true

        if (musim.equalsIgnoreCase(hujan) && hari.equalsIgnoreCase(libur)){ //false dan true
            System.out.println("Rehat di rumah");
        } else if (musim.equalsIgnoreCase(hujan) && hari.equalsIgnoreCase(kerja)) { //false dan false
            System.out.println("Pasrah aja deh");
        } else if (musim.equalsIgnoreCase(panas) && hari.equalsIgnoreCase(libur)) { //true dan true
            System.out.println("Jalan jalan ke pantai"); // cetak ini (jalan jalan ke pantai)
        } else if (musim.equalsIgnoreCase(panas) && hari.equalsIgnoreCase(kerja)) {
            System.out.println("Hangout bareng teman kantor");
        }else {
            System.out.println("not identified");
        }

    }
}

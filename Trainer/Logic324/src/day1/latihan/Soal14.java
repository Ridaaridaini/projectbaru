package day1.latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        long sepuluhRibu, limaRibu, duaPuluh;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah pecahan 5rb: ");
        limaRibu = scanner.nextLong(); //2

        System.out.print("Jumlah pecahan 10rb: ");
        sepuluhRibu = scanner.nextLong(); //2

        System.out.print("Jumlah pecahan 20rb: ");
        duaPuluh = scanner.nextLong(); // 3

        scanner.close();

        long jumlahLimaRibu = limaRibu*5000; // 2*5000 = 10000
        long jumlahSepuluhRibu = sepuluhRibu*10000; // 2*10000 = 20000
        long jumlahDuaPuluh = duaPuluh*20000; // 3*20000 = 60000

        long jumlahTotal = jumlahLimaRibu+jumlahSepuluhRibu+jumlahDuaPuluh; // 10000 + 20000 + 60000 = 90000

        System.out.println("Mbah jambrong memiliki " + limaRibu + " lembar uang 5rb, " + sepuluhRibu
                + " lembar uang 10rb, " + duaPuluh + " lembar uang 20rb. Total uang Mbah Jambrong adalah "
                + jumlahTotal);
    }
}

package simulasi;

import java.util.Scanner;

public class Soal08 {

    public static void main(String[] args) {

        String[] murid = {"Andi", "Budi", "Cindy", "Dedi", "Eki"};
        int[] nilaiMurid = {85, 70, 90, 75, 100};

        Scanner scanner = new Scanner(System.in);

        System.out.print("input1: ");
        String[] nama = scanner.nextLine().trim().split(" ");

        System.out.print("input2: ");
        String[] nilai = scanner.nextLine().trim().split(" ");

        boolean[] hasil = new boolean[nama.length];
        for (int i = 0; i < murid.length; i++) {
            for (int j = 0; j < nama.length; j++) {
                if (murid[i].equalsIgnoreCase(nama[j])){
                    if (nilaiMurid[i] == Integer.parseInt(nilai[j])){
                        hasil[j] = true;
                        continue;
                    }
                    hasil[j] = false;
                }
            }
        }

        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }

    }

}

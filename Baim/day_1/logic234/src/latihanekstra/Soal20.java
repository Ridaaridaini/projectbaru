package latihanekstra;

import java.util.Scanner;

public class Soal20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        String[] bilangan = scanner.nextLine().split(" ");
        int[] angka = new int[bilangan.length];

        
        int jumlah = 0;
        for (int i = 0; i < bilangan.length; i++) {
            jumlah += Integer.parseInt(bilangan[i]);
        }

        if(bilangan.length%2 == 1){
            int median = bilangan.length/2;
            System.out.println("Median: " + bilangan[median]);
        } else {
            int tengah = bilangan.length/2;
            int nilai1 = Integer.parseInt(bilangan[tengah]);
            int nilai2 = Integer.parseInt(bilangan[(tengah-1)]);
            double median = (nilai1+nilai2)/2f;
            System.out.println("Median: " + median);
        }

        System.out.println("Mean: " + jumlah/bilangan.length);

    }
}

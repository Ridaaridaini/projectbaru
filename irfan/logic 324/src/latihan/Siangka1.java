package latihan;

import java.util.Scanner;

public class Siangka1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan angka = ");
        int input = scanner.nextInt();

        int count = 0;
        int lock = 100;
        int start = lock;

        while (count < input){
            for (;start >= 10;){
                String strStart = start + "";
                String[] arrStart = strStart.split("");

                int jumlah = 0;
                for (int i = 0; i < arrStart.length; i++) {
                    int digit = Integer.parseInt(arrStart[i]);
                    int digitKuadrat = digit * digit;
                    jumlah = jumlah + digitKuadrat;
                }
                if (jumlah == 1) {
                    System.out.println(lock + " adalah si Angka 1");
                    count++;
                    lock++;
                    start = lock;
                    break;
                }
                    if (jumlah == 10){
                        System.out.println(lock + " adalah si Angka 10");
                        count++;
                        lock++;
                        start = lock;
                        break;

                    } else if (jumlah < 10){
                    lock++;
                    start = lock;
                    break;
                }
                start = jumlah;
            }
        }
    }
}

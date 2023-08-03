package latihan;

import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("input saldo OPO");
        Integer opo=input.nextInt();
        input.nextLine();
        int cup=0, harga=0;
        if (opo>=27000 && opo<=99000) {
            cup = opo / 9000;
            harga = cup * 9000;
            opo = opo - harga + (harga / 10);
            System.out.println("Jumlah cup: " + cup + " Saldo Akhir: " + opo);
        } else if (opo>99000) {
            cup = 11;
            harga = cup * 9000;
            opo = opo - harga + (harga / 10);
            System.out.println("Jumlah cup: " + cup + " Saldo Akhir: " + opo);

        }else
            System.out.println("saldo tidak cukup");

    }
    }


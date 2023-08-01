package day6.latihan;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nama: ");
        String myName = scanner.nextLine();
        String[] splitMyName = myName.split(" ");

        for (int i = 0; i < splitMyName.length; i++) {

            String[] name = splitMyName[i].split("");

            for (int j = 0; j < name.length; j++) {
                //cetak huruf awal
                if (j == 0){
                    name[j] = name[j].toUpperCase();
                    System.out.print(name[j]);
                }
                //cetak bintang
                for (int k = 0; k < name[i].length(); k++) {
                    System.out.print("*");
                }
                //cetak huruf akhir
                if (j == (name.length)-1){
                    name[j] = name[j].toUpperCase();
                    System.out.print(name[j]);
                }

            }

            System.out.println();
        }
    }

}



package ft1;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kata: ");
        String[] kata = scanner.nextLine().split(" ");

        String kataClean = "";
        for (int i = 0; i < kata.length; i++) {
            String[] temp = kata[i].split("");
            for (int j = 0; j < temp.length; j++) {
                String tampung = "";
                if (",'@/".contains(temp[j])) {
                    continue;
                } else {
                    kataClean += temp[j];
                }

                if (kataClean.contains(tampung)) {
                    tampung = "";
                    continue;
                }
            }

            kataClean += " ";
        }

        int bantu = 0;
        String[] temp = kataClean.split(" ");
        String[] tempKataBaru = new String[temp.length];

        for (int i = 0; i < temp.length; i++) {
            if(i==0){
                tempKataBaru[0] = temp[0];
            }
            for (int j = 0; j < temp.length; j++) {
                if(tempKataBaru[i].equalsIgnoreCase(temp[j])){
                    tempKataBaru[i] = temp[i];
                }
            }
        }

        for (int i = 0; i < tempKataBaru.length; i++) {
            System.out.println(tempKataBaru[i]);
        }
        // coba

    }
}

        // for (int i = 0; i < temp.length; i++) {
        //     for (int j = 0; j < temp.length; j++) {
        //         if (temp[i] == temp[j]) {
        //             bantu++;
        //         }
        //     }
        //     if (i == 0) {

        //         System.out.println(temp[0]);
        //     }
        //     if (bantu >= 2) {
        //         System.out.println(temp[i]);
        //         bantu = 0;
        //     }
        // }
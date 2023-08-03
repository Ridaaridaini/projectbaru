package latihanB;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {
        int tracking = 0, lembah = 0, gunung = 0;
        Scanner scanner = new Scanner(System.in);

        String turunNaik = scanner.nextLine();

        String[] arrTurunNaik = turunNaik.split("");

        for (int i = 0; i < arrTurunNaik.length; i++) {

            if (arrTurunNaik[i].equals("N")){
                tracking += 1;

                if (tracking == 0){
                    lembah += 1;
                }
            } else if (arrTurunNaik[i].equals("T")) {
                tracking -= 1;

                if (tracking == 0){
                    gunung += 1;
                }
            }else {
                System.out.println("anda tersesat");
            }

        }

        System.out.println("Lembah: " + lembah);
        System.out.println("Gunung: " + gunung);



    }

}

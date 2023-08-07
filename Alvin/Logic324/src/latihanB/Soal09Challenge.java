package latihanB;

import java.util.Scanner;

public class Soal09Challenge {

    public static void main(String[] args) {

        int tracking = 1, lembah = 0, gunung = 0;

        int skip = 1;
        Scanner scanner = new Scanner(System.in);

        String turunNaik = scanner.nextLine();

        String[] arrTurunNaik = turunNaik.split("");


        for (int i = 0; i < arrTurunNaik.length; i++) {

            if (arrTurunNaik[i].equals("N")){

                if (skip==1 && tracking==0){
                    skip = 0;
                }
                tracking += 1;

                if (tracking == 0 && skip==0){
                    lembah += 1;
                }
            } else if (arrTurunNaik[i].equals("T")) {

                if (skip == 1 && tracking == 0){
                    skip = 0;
                }
                tracking -= 1;

                if (tracking == 0 && skip==0){
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

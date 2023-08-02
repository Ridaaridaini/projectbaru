package day6.latihan;

import java.util.Scanner;

public class soal10 {
    public static void main(String[] args) {
        //"Hattori sedang berlatih untuk menjadi ninja yang baik dengan berlari melewati gunung dan lembah.
        //Yang didefinisikan sebagai gunung dan lembah adalah:
        //- Gunung: urutan Naik dan Turun yang bermula di 0 mdpl dan berakhir di 0 mdpl
        //- Lembah: urutan Turun dan Naik yang bermula di 0 mdpl dan berakhir di 0 mdpl
        //Hattori mencatat perjalanannya dengan simbol N saat ia menanjak dan T saat ia turun dalam sebuah urutan seperti berikut
        //Input : N N T N N N T T T T T N T T T N T N
        //Berapa Gunung dan Lembah yang sudah dilewati hatori?"


        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        String input = scanner.nextLine();
        int jalan=0;
        int gunung=0;
        int lembah=0;

        input=input.replace(" ","");
        String[] arrInput=input.split("");
        for (int i = 0; i < arrInput.length; i++) {
            if(arrInput[i].equalsIgnoreCase("N")){
                jalan=jalan+1;
                if (jalan==0){
                    lembah=lembah+1;
                }
            } else if (arrInput[i].equalsIgnoreCase("T")) {
                jalan=jalan-1;
                if(jalan==0){
                    gunung=gunung+1;
                }
            }
        }

        System.out.println("gunung: " + gunung+ " lembah: " + lembah);

    }
}

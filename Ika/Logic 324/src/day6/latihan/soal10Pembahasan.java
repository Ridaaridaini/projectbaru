package day6.latihan;

import java.util.Scanner;

public class soal10Pembahasan {
    public static void main(String[] args) {
        //"Hattori sedang berlatih untuk menjadi ninja yang baik dengan berlari melewati gunung dan lembah.
        //Yang didefinisikan sebagai gunung dan lembah adalah:
        //- Gunung: urutan Naik dan Turun yang bermula di 0 mdpl dan berakhir di 0 mdpl
        //- Lembah: urutan Turun dan Naik yang bermula di 0 mdpl dan berakhir di 0 mdpl
        //Hattori mencatat perjalanannya dengan simbol N saat ia menanjak dan T saat ia turun dalam sebuah urutan seperti berikut
        //Input : N N T N N N T T T T T N T T T N T N
        //Berapa Gunung dan Lembah yang sudah dilewati hatori?"


        System.out.println("===========PEMBAHASAN ==================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan input: ");
        String input = scanner.nextLine();
        String input1 = input.replace(" ","");
        int ketinggian=0;
        int gunung = 0;
        int lembah=0;

        String[] arrInput =input1.split("");
        for (int i = 0; i < arrInput.length; i++) {//i=0
            String aksi =arrInput[i];
            if(aksi.equalsIgnoreCase("N")){
                ketinggian = ketinggian+1;
                if(ketinggian==0){
                    lembah=lembah+1;
                }

            } else if (aksi.equalsIgnoreCase("T")) {
                ketinggian = ketinggian-1;
                if(ketinggian==0){
                    gunung=gunung+1;
                }
            }
        }

        System.out.println("gunung : " + gunung + " lembah : " + lembah);

    }
}

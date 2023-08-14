package simulasiFT1;

import java.util.Scanner;

public class soal02 {
    public static void main(String[] args) {
        //Sasuke akan melakukan perjalanan ekspedisi keluar konoha dengan melewati gunung dan lembah. Yang didefinisikan sebagai gunung dan lembah adalah:
        //- Gunung: urutan Naik dan Turun yang bermula di 0 mdpl dan berakhir di 0 mdpl
        //- Lembah: urutan Turun dan Naik yang bermula di 0 mdpl dan berakhir di 0 mdpl
        //Lalu Sasuke mencatat perjalanannya dengan simbol N saat ia menanjak dan T saat ia turun dalam sebuah urutan
        //Contoh seperti berikut N N T N N N T T T T T N T T T N T N
        //Berapa Gunung dan Lembah yang sudah dilewati Sasuke?

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan perjalanan : ");
        String perjalanan = scanner.nextLine();

        int jalan = 0;
        int gunung =0;
        int lembah = 0;

        String[] arrPer =perjalanan.replace(" ","").split("");
        for (int i = 0; i < arrPer.length; i++) {
            if(arrPer[i].equalsIgnoreCase("n")){
                jalan = jalan + 1;
                if(jalan==0){
                    lembah=lembah+1;
                }
            } else if (arrPer[i].equalsIgnoreCase("t")) {
                jalan = jalan-1;
                if(jalan==0){
                    gunung=gunung+1;
                }
            }
        }

        System.out.println("lembah : " + lembah );
        System.out.println("gunung : " +gunung);

    }

}

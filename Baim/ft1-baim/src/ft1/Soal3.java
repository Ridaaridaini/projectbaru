package ft1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan String: ");
        String[] kata = scanner.nextLine().replace(" ", "").split("");
        System.out.print("Penggal kata: ");
        int angka = scanner.nextInt();
        
        String kataAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String kataBantu = "";
        int bantu = 0;

        for (int i = kata.length; i > 0; i--) {
            if(kataAlphabet.contains(kata[i-1])){
                kataBantu += kata[i-1];
                bantu++;
            }
            if(bantu == angka){
                kataBantu += ", ";
                bantu = 0;
            }
        }
        // for (int i = 0; i < kata.length; i++) {
        //     if(kataAlphabet.contains(kata[i])){
        //         kataBantu += kata[i];
        //         bantu++;
        //         if(bantu == angka){
        //             kataBantu += ", ";
        //             bantu = 0;
        //         }
        //     }
        // }
        // System.out.println(kataBantu);


        // for (int i = kata.length; i > 0; i--) {
        //     System.out.println(kata[i-1] + ", ");
        // }

        System.out.println(kataBantu);
    }
}

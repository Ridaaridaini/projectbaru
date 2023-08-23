import java.util.Arrays;
import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {
        // belum selesai
        Scanner scanner = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print("string kata/kalimat: ");
        String[] kalimat = scanner.nextLine().replace(" ", "").split("");

        System.out.print("n: ");
        int n = scanner.nextInt();

        String kalimat2 = "";

        for (int i = 0; i < kalimat.length; i++) {
            if (!alphabet.contains(kalimat[i])){
                continue;
            }
            kalimat2 += kalimat[i];
        }

//        String kebalik = "";
//        for (int i = kalimat.length-1; i >= 0 ; i--) {
//            if (!alphabet.contains(kalimat[i])){
//                continue;
//            }
//            kebalik += kalimat[i];
//        }

        String[] arrKalimat = kalimat2.split("");
//        String[] arrKalimatKebalik = kebalik.split("");
        String x = "";
//        String y = "";

        for (int i = 0; i <= arrKalimat.length; i+=n) {
            for (int j = n; j <= arrKalimat.length; j+=n) {
                x += kalimat2.substring(i, j) +" ";
                i += n;
            }
        }

//        for (int i = 0; i < arrKalimatKebalik.length; i+=n) {
//            for (int j = n; j < arrKalimatKebalik.length; j+=n) {
//                y += kebalik.substring(i, j) +" ";
//                i += n;
//            }
//        }

        System.out.println(x);
//        System.out.println(y);

    }

}

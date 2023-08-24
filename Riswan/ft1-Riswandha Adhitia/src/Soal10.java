import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.print("String s = ");
        String[] kata = input.nextLine().replace(" ","").toLowerCase().split("");
        String kalimat = "";

        for (int i = 0; i < kata.length; i++) {
            if(alfabet.contains(kata[i])){
                kalimat=kalimat + kata[i];
            }
        }
        String vokal = "aiueo";
        int output = 0;
        String[] kalimat1 = kalimat.split("");
//        for (int i = 0; i < kalimat1.length; i++) {
//            for (int j = 0; j < vokal.length(); j++) {
//                if (kalimat1[i].equalsIgnoreCase(vokal.contains(kalimat1[i+1])))
//            }
//        }

        String hasil= "";
        String hasil2= "";

        for (int i = 0; i < kalimat1.length; i++) {
            if (!vokal.contains(kalimat1[i])){
                hasil = hasil+kalimat1[i];
            } else if (vokal.contains(kalimat1[i]) && !hasil2.contains(kalimat1[i])) {
                hasil2 = hasil2+kalimat1[i];
            }
        }
        System.out.println(hasil);
        System.out.println(hasil2);
        System.out.println(hasil.length());
        System.out.println(hasil2.length());
        System.out.println(hasil.length() - hasil2.length());
    }
}

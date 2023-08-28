package ft1;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("kata : ");
        String n = scanner.nextLine().toLowerCase();

        String[] arrN = n.split("");

        String huruf = " ,' @ / &";
        String abjad = " ";
        String kalimat = " ";

        for (int i = 0; i < arrN.length; i++) {
            if (huruf.contains(arrN[i])){
//                abjad = abjad + arrN[i];
            }else{
                kalimat = kalimat + arrN[i];

            }
        }
//        System.out.print("kalimat :"+abjad);
        System.out.print("kalimat :"+kalimat);
    }
}

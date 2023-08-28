package ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inputan N : ");
        String n = scanner.nextLine().toLowerCase();

        System.out.print(" N : ");
        int a = scanner.nextInt();

        String[] arrN = n.replace(" ","").split("");
        String b = "?";
        String kalimat="";

        for (int i = 0; i < arrN.length; i++) {
            if(!kalimat.contains(arrN[i])){
                if (kalimat.length() > a ){
                    kalimat += ",";
                }
            }
            kalimat +=arrN[i];

        }
        System.out.print("kalimat : "+kalimat);

    }
}

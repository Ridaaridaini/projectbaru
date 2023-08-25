package simulasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inputan  : ");
        String n = scanner.nextLine().toLowerCase();

        String[] arrN = n.replace(" ","").split("");
        Arrays.sort(arrN);

        String kata = "";

        for (int i = 0; i < arrN.length; i++) {
            if (!kata.contains(arrN[i])){
                if (kata.length() > 0 ){
                    kata += ",";
                }
            }
            kata += arrN[i];

        }
        System.out.print("Huruf : "+kata);
    }
}

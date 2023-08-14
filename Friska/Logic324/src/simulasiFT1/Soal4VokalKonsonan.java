package simulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4VokalKonsonan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata:");
        String[] kata = input.nextLine().toLowerCase().replace(" ","").split("");
        Arrays.sort(kata);
        for (int i = 0; i < kata.length; i++) {
            if (i==0){
                System.out.print(kata[i]);
            } else if (kata[i].equalsIgnoreCase(kata[i-1])) {
                System.out.print(kata[i]);
            }else{
                System.out.print(", "+kata[i]);
            }
        }



    }
}

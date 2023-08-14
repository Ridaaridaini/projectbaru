package simulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan kalimat: ");
        String kal = input.nextLine();

        String kalRep = kal.replace(" ", "").toLowerCase();
        String [] kalSplit = kalRep.split("");

        Arrays.sort(kalSplit);

        String tampung = "";

        for (int i = 0; i < kalSplit.length; i++) {
            if(!tampung.contains(kalSplit[i])){
                if (tampung.length()>0){
                    tampung += " , ";
                }

        }
        tampung = tampung + kalSplit[i];
    }
        System.out.println(tampung);
}
}

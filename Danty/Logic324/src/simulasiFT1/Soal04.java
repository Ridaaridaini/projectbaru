package simulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String kalimat = input.nextLine();

        String[] arrK = kalimat.toLowerCase().replace(" ", "").split("");
        Arrays.sort(arrK);

        for (int i = 0; i < arrK.length; i++) {

            if(i == 0){
                System.out.print(arrK[i]);
            } else if(arrK[i].equalsIgnoreCase(arrK[i-1])){
                System.out.print(arrK[i]);
            } else{
                System.out.print(", " + arrK[i]);
            }

        }


    }
}


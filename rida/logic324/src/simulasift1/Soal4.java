package simulasift1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan kalimat");
        String[] kalimat=input.nextLine().toLowerCase().replace(" ","").split("");
        Arrays.sort(kalimat);
        for (int i = 0; i < kalimat.length; i++) {
            if(i==0){
                System.out.print(kalimat[i]);
            } else if (kalimat[i-1].equalsIgnoreCase(kalimat[i])) {
                System.out.print(kalimat[i]);

            }else {
                System.out.print(", "+kalimat[i]);
            }

        }
    }
}

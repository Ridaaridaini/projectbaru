package simulasift1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal05part1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan kalimat");
        String[] kalimat=input.nextLine().toLowerCase().replace(" ","").split("");
        Arrays.sort(kalimat);//aacee
        for (int i = 0; i < kalimat.length; i++) {
            if (i==0){
                System.out.print(kalimat[i]);
            } else if (kalimat[i].equalsIgnoreCase(kalimat[i-1])) {
                System.out.print(kalimat[i]);
            }else {
                System.out.print(", "+kalimat[i]);
            }

        }
    }
}

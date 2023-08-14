package simulasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input n: ");
        String[] n = scanner.nextLine().toLowerCase().replace(" ", "").split("");

        Arrays.sort(n);

        for (int i = 0; i < n.length; i++) {
            if (i == 0){
                System.out.print(n[i]);
                continue;
            }

            if (n[i].equals(n[i-1])){
                System.out.print(n[i]);
            }else {
                System.out.print("," + n[i]);
            }
        }

    }

}

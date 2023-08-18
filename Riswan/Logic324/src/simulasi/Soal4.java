package simulasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input n : ");
        String[] n = input.nextLine().replace(" ","").split("");
        Arrays.sort(n);

        for (int i = 0; i < n.length; i++) {
            if (i==0){
                System.out.print(n[i]);
            }else if(n[i].equalsIgnoreCase(n[i-1])){
                System.out.print(n[i]);
            }else {
                System.out.print(", ");
                System.out.print(n[i]);
            }
        }
    }
}

package day10;

import java.util.Scanner;

public class hackerrankInString {
    public static void main(String[] args) {
        //belum

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String n = scanner.nextLine();

        n = n.toLowerCase().replace(" ","");
        String[] arrN = n.split("");

        String hackerrank = "hackerrank";
        String[] arrHacker = hackerrank.split("");

        String value ="";
        for (int i = 0; i < arrN.length; i++) {

            for (int j = 0; j < arrHacker.length; j++) {
                if(arrN[i].contains(arrHacker[i])){
                    value = arrN[j];
                }else {
                    System.out.println("NO");
                }

            }
        }

        System.out.println(value);
    }
}

package mendalamiLatihanLogic;

import java.util.Scanner;

public class Pangram {

    public static void main(String[] args) {

        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

        Scanner scanner = new Scanner(System.in);

        System.out.print("input: ");
        String words = scanner.nextLine().replace(" ", "").toLowerCase();
        boolean pangram = true;

        for (int i = 0; i < alphabet.length; i++) {
            if (!words.contains(alphabet[i])){
                pangram = false;
                break;
            }
        }

        if (pangram){
            System.out.print("pangram");
        }else {
            System.out.print("not pangram");
        }

    }

}

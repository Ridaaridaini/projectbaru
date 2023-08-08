package Extra;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        char awalan ,akhiran;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inputkan Kalimat = ");
        String n = scanner.nextLine();

        String [] arrA = n.split(" ");

        for (String arrB : arrA){
            if (!arrB.isEmpty()){
                awalan =  Character.toUpperCase(arrB.charAt(0));
                akhiran = Character.toLowerCase(arrB.charAt(arrB.length()-1));

                System.out.print(awalan);

                for (int i = 0; i < 3; i++) {
                    System.out.print("*");
                }
                System.out.println(akhiran);
            }
        }
    }
}

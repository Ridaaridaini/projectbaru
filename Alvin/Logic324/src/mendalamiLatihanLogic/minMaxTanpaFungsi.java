package mendalamiLatihanLogic;

import java.util.Scanner;

public class minMaxTanpaFungsi {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("deret: ");
        String[] deret = scanner.nextLine().trim().split(" ");

        int min = Integer.parseInt(deret[0]);
        int max = Integer.parseInt(deret[0]);

        for (int i = 0; i < deret.length; i++) {

            if (Integer.parseInt(deret[i]) > max){
                max = Integer.parseInt(deret[i]);
            }

            if (Integer.parseInt(deret[i]) < min){
                min = Integer.parseInt(deret[i]);
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }

}

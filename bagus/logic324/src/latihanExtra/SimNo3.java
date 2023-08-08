package latihanExtra;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SimNo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan kata: ");
        String kata = input.nextLine();

        String [] kataSplit = kata.split("");




//        Arrays.sort(kataSplit, Collections.reverseOrder());
        for (int i  = kataSplit.length-1; i >= 0; i--) {
            for (int j = 0; j < kataSplit.length; j++) {


                System.out.print("*");
            }

            System.out.println(kataSplit[i]);



        }


        }



    }


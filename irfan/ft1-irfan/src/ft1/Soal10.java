package ft1;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("String s : ");
        String n = scanner.nextLine().toLowerCase();

        String[] arrN = n.replace(" ", "").split("");

        String karakterUnik = arrN[0];

        String hurufVokal = "aiueo";
        String vokal = "";
        String konsonan = "";

//        Integer[] tampung = new Integer[n.length()];
        for (int i = 0; i < (arrN.length - 1); i++) {

            for (int j = 0; j < arrN.length; j++) {
                if (!hurufVokal.equals(arrN[j])) {
                    if (karakterUnik.toString().contains(arrN[j])) {
                        continue;
                    }
                    karakterUnik = karakterUnik+ arrN[j];


                }
            }
        }
            System.out.println(karakterUnik);
            System.out.println(karakterUnik.length() + " karakter");


        }
    }



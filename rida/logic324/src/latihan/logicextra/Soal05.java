package latihan.logicextra;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String[] kata = input.nextLine().toLowerCase().split("");
        Integer[] arrStrin = new Integer[kata.length];
        //input.nextLine();
        System.out.println("Masukkan inputan array: ");
        for (int i = 0; i < kata.length; i++) {
            arrStrin[i] = input.nextInt();
        }
        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equalsIgnoreCase("a")) {
                if (arrStrin[i] == 1) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("b")) {
                if (arrStrin[i] == 2) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("c")) {
                if (arrStrin[i] == 3) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("d")) {
                if (arrStrin[i] == 4) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("e")) {
                if (arrStrin[i] == 5) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("f")) {
                if (arrStrin[i] == 6) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("g")) {
                if (arrStrin[i] == 7) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("h")) {
                if (arrStrin[i] == 8) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("i")) {
                if (arrStrin[i] == 9) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("j")) {
                if (arrStrin[i] == 10) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("k")) {
                if (arrStrin[i] == 11) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("l")) {
                if (arrStrin[i] == 12) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("m")) {
                if (arrStrin[i] == 13) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("n")) {
                if (arrStrin[i] == 14) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("0")) {
                if (arrStrin[i] == 15) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("p")) {
                if (arrStrin[i] == 16) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("q")) {
                if (arrStrin[i] == 17) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("r")) {
                if (arrStrin[i] == 18) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("s")) {
                if (arrStrin[i] == 19) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("t")) {
                if (arrStrin[i] == 20) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("u")) {
                if (arrStrin[i] == 21) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("v")) {
                if (arrStrin[i] == 22) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("w")) {
                if (arrStrin[i] == 23) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("x")) {
                if (arrStrin[i] == 24) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("y")) {
                if (arrStrin[i] == 25) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            } else if (kata[i].equalsIgnoreCase("z")) {
                if (arrStrin[i] == 26) {
                    System.out.print("True");
                } else {
                    System.out.print("False");
                }
            }
            if (i!=(kata.length)-1){
                System.out.print(", ");
            }

        }
    }
}

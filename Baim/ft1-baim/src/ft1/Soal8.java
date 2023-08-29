package ft1;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan deret: ");
        String[] deretStr = scanner.nextLine().split(" ");
        int[] deret = new int[deretStr.length];

        for (int i = 0; i < deret.length; i++) {
            deret[i] = Integer.parseInt(deretStr[i]);
        }

        System.out.print("Masukkan Pola: ");
        String pola = scanner.nextLine();

        System.out.print("Masukkan action: ");
        String action = scanner.nextLine();

        //0 1 2
        //3 4 5
        //6 7 8

        //1 2 3
        //4 5 6
        //7 8 9

        // int[] deret1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int jumlah = 0;
        if (pola.equalsIgnoreCase("+") && action.equalsIgnoreCase("+")) {
            System.out.println("Deret 1: " + deret[1]);
            System.out.println("Deret 4: " + deret[4]);
            System.out.println("Deret 7: " + deret[7]);
            System.out.println("Deret 3: " + deret[3]);
            System.out.println("Deret 4: "+ deret[4]);
            System.out.println("Deret 5: "+ deret[5]);
            jumlah = deret[1] + deret[4] + deret[7] + deret[3] + deret[4] + deret[5];
            System.out.println("Jumlah: " + jumlah);
        }
        if (pola.equalsIgnoreCase("+") && action.equalsIgnoreCase("-")) {
            jumlah = deret[1] - deret[3] - deret[4] - deret[5] - deret[7] - deret[8];
            System.out.println("Jumlah: " + jumlah);
        }
        if (pola.equalsIgnoreCase("+") && action.equalsIgnoreCase("x")) {
            jumlah = deret[1] * deret[3] * deret[4] * deret[5] * deret[7] * deret[8];
            System.out.println("Jumlah: " + jumlah);
        }

        if (pola.equalsIgnoreCase("-") && action.equalsIgnoreCase("+")) {
            jumlah = deret[3] + deret[4] + deret[5];
            System.out.println("Jumlah: " + jumlah);
        }
        if (pola.equalsIgnoreCase("-") && action.equalsIgnoreCase("-")) {
            jumlah = deret[3] - deret[4] - deret[5];
            System.out.println("Jumlah: " + jumlah);
        }
        if (pola.equalsIgnoreCase("-") && action.equalsIgnoreCase("x")) {
            jumlah = deret[3] * deret[4] * deret[5];
            System.out.println("Jumlah: " + jumlah);
        }

        if (pola.equalsIgnoreCase("x") && action.equalsIgnoreCase("+")) {
            jumlah = deret[0] + deret[4] + deret[8] + deret[2] + deret[4] + deret[6];
            System.out.println("Jumlah: " + jumlah);
        }
        if (pola.equalsIgnoreCase("x") && action.equalsIgnoreCase("-")) {
            jumlah = deret[0] - deret[4] - deret[8] + deret[2] + deret[4] + deret[6];
            ;
            System.out.println("Jumlah: " + jumlah);
        }
        if (pola.equalsIgnoreCase("x") && action.equalsIgnoreCase("x")) {
            jumlah = deret[0] * deret[4] * deret[8] + deret[2] + deret[4] + deret[6];
            ;
            System.out.println("Jumlah: " + jumlah);
        }
    }
}

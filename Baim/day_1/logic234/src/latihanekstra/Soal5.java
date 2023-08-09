package latihanekstra;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        String[] array = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata/kalimat: ");
        String[] kata = scanner.nextLine().toLowerCase().split("");

        System.out.print("Masukkan array angka (1, 2, 3, 4, 5, 6, 7 ... 26): " );
        String[] angka = scanner.nextLine().replace(" ", "").split(",");
        int[] angkaInt = new int[angka.length];
        String[] jawaban = new String[kata.length];

        for (int i = 0; i < angka.length; i++) {
            angkaInt[i] = Integer.parseInt(angka[i]);
        }

        if (kata.length != angkaInt.length) {
            System.out.println("Panjang karakter dan angka harus sama");
        }

        for (int i = 0; i < kata.length; i++) {
            if (kata[i].equals(array[0])) {
                if (angkaInt[i] == 1) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[1])) {
                if (angkaInt[i] == 2) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[2])) {
                if (angkaInt[i] == 3) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[3])) {
                if (angkaInt[i] == 4) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[4])) {
                if (angkaInt[i] == 5) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[5])) {
                if (angkaInt[i] == 6) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[6])) {
                if (angkaInt[i] == 7) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[7])) {
                if (angkaInt[i] == 8) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[8])) {
                if (angkaInt[i] == 9) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[9])) {
                if (angkaInt[i] == 10) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[10])) {
                if (angkaInt[i] == 11) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[11])) {
                if (angkaInt[i] == 12) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[12])) {
                if (angkaInt[i] == 13) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[13])) {
                if (angkaInt[i] == 14) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[14])) {
                if (angkaInt[i] == 15) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[15])) {
                if (angkaInt[i] == 16) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[16])) {
                if (angkaInt[i] == 17) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[17])) {
                if (angkaInt[i] == 18) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[18])) {
                if (angkaInt[i] == 19) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[19])) {
                if (angkaInt[i] == 20) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[20])) {
                if (angkaInt[i] == 21) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[21])) {
                if (angkaInt[i] == 22) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[22])) {
                if (angkaInt[i] == 23) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[23])) {
                if (angkaInt[i] == 24) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[24])) {
                if (angkaInt[i] == 25) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
            if (kata[i].equals(array[25])) {
                if (angkaInt[i] == 26) {
                    jawaban[i] = "True";
                } else {
                    jawaban[i] = "False";
                }
            }
        }

        for (int j = 0; j < jawaban.length; j++) {
            System.out.print(jawaban[j] + ", ");
        }

    }
}

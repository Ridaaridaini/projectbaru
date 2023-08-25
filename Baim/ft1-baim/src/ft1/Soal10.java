package ft1;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String[] kata = scanner.nextLine().split(" ");
        ;

        int bilangan = 0;
        String kataTampung = "";
        for (int i = 0; i < kata.length; i++) {
            String[] temp = kata[i].split("");
            for (int j = 0; j < temp.length; j++) {
                if (!"aiueo".contains(temp[j])) {
                    if (j == temp.length - 1) {
                        continue;
                    } else if ("aiueo".contains(temp[j + 1])) {
                        bilangan++;
                    }
                }
            }
        }

        System.out.println(bilangan);
    }
}

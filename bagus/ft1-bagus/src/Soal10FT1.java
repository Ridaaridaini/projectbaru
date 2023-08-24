import java.util.Scanner;

public class Soal10FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Kalimat: ");
        String kalimat = input.nextLine();//baca buku
        String kalimatReplace = kalimat.replace(" ", "");
        String[] kalSplit = kalimatReplace.split("");

        String[] vokal = {"a", "i", "u", "e", "o"};
        String[] konsonan = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        String tampung = "";
        for (int i = 0; i < kalSplit.length; i++) {
            for (int j = 0; j < konsonan.length; j++) {
                for (int k = 0; k < vokal.length; k++) {
                    if (kalSplit[i].equals(konsonan[j]) && kalSplit[i + 1].equals(vokal[k])) {
                        tampung = tampung + kalSplit[i];
                    }
                }
            }
        }
        System.out.println(tampung.length());
    }
}

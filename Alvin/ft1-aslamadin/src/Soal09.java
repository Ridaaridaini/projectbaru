import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("words: ");
        String[] words = scanner.nextLine().split(" ");

        if (!(words.length >= 1 && words.length <= 50)){
            System.out.println("panjang daftar kata tidak sesuai");
        }

        String wordsF = "";
        for (int i = 0; i < words.length; i++) {
            if (!(words.length >= 1 && words.length <= 7)){
                continue;
            }
            if (wordsF.contains(words[i])){
                continue;
            }

            for (int j = 0; j < words.length; j++) {
                if (words[i].length() == words[j].length()){
                    wordsF += words[j] + " ";
                }
            }
            wordsF += "\n";
        }

        System.out.println(wordsF);
    }

}

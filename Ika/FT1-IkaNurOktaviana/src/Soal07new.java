import java.util.Scanner;

public class Soal07new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat : ");
        String[] kalimat = scanner.nextLine().
        replace(",", "").replace("\'", "").
        replace("\"", "").
        replace("@", "").replace("/","").replace("&","").split(" ");

        String  tamp = "";

        for (int i = 0; i < kalimat.length; i++) {
//            System.out.print(kalimat[i] + " ");
            for (int j = i+1; j < kalimat.length; j++) {
                if (!(kalimat[i].equalsIgnoreCase(kalimat[j]))) {
                    continue;
                }
                System.out.print(kalimat[j] + " ");
            }
        }

    }
}

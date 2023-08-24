import java.util.Scanner;

public class Soal7FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Kalimat: ");//siang makan nasi kalo malam makan mie
        String kalimat = input.nextLine();
        String kalReplace = kalimat.replaceAll("[^a-zA-z]" ," ").replace("  "," ");
        String[] kalSplit = kalReplace.split(" ");

        String tampung = "";
        for (int i = 0; i < kalSplit.length; i++) {
            if (!tampung.contains(kalSplit[i])){
                tampung = tampung + kalSplit[i];
            }
        }
        System.out.println(tampung);

        System.out.println(kalReplace);
    }
}

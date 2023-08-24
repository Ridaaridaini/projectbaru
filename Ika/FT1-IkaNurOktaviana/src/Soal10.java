import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] arrKal = scanner.nextLine().toLowerCase().replace(" ","").replaceAll("[^a-zA-Z]", "").split("");
        String  kons = "";

        for (int i = 0; i < arrKal.length; i++) {
            if(!(arrKal[i].equals("a") || arrKal[i].equals("u") || arrKal[i].equals("i") || arrKal[i].equals("e") || arrKal[i].equals("o"))){
               kons = kons+arrKal[i];
            }
        }

        System.out.println(kons);
        System.out.println(kons.length());
    }

}

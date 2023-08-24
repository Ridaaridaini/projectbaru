import java.util.Scanner;

public class Soal2FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan username: ");
        String kal = input.nextLine();
        String[] kalSplit = kal.split("[^a-zA-z]");


        String[] angka = new String[3];
        String tampung = "";
        for (int i = 0; i < kalSplit.length; i++) {
            tampung = kalSplit[i];
        }
        System.out.println(tampung);


        if (tampung.contains("_")){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }



    }
}

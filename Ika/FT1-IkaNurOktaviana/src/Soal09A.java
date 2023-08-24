import java.util.Scanner;

public class Soal09A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kalimat = scanner.nextLine().toLowerCase().split(" ");

        String tamp ="";
        for (int i = 0; i < kalimat.length; i++) {
            for (int j = 0; j < kalimat.length; j++) {
                if(kalimat[i].length() == kalimat[j].length()){
                    tamp = tamp + kalimat[i];
                    System.out.print( tamp);
                }
            }
        }


    }
}

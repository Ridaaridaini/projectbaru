import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat : ");
        String[] kalimat = scanner.nextLine().
        replace(",", "").replace("\'", "").
        replace("\"", "").
        replace("@", "").replace("/","").replace("&","").split(" ");

//        String tampung ="";

        for (int i = 0; i < kalimat.length; i++) {
            System.out.print(kalimat[i] + " ");
//            String[] splitkal = kalimat[i].split("");
//            for (int j = 0; j < splitkal.length; j++) {
//             if(tampung.contains(splitkal[j])){
//                 tampung = tampung + splitkal[j];
//             }
//                System.out.print(tampung);
//            }
        }

    }
}

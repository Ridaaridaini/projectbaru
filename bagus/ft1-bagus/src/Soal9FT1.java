import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Soal9FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan kalimat: ");
        String kal = input.nextLine();
        String[] kalSplit = kal.split(" ");

        String empatHuruf = "";
        String tampung = "";
        for (int i = 0; i < kalSplit.length; i++) {
            for (int j = 0; j < kalSplit.length; j++) {
                if (kalSplit[i].length() == kalSplit[j].length()){
                    tampung = tampung+kalSplit[i];
                }

            }
            System.out.println(kalSplit[i]);

//            if (kalSplit[i].length() == 4) {
//                if (i == kalSplit.length - 1) {
//                    System.out.println(kalSplit[i]);
//                } else
//                    System.out.print(kalSplit[i] + ", ");
//            }
//
//
//            if (kalSplit[i].length() == 5) {
//                if (i == kalSplit.length - 1) {
//                    System.out.println(kalSplit[i]);
//                } else
//                    System.out.println(kalSplit[i] + ", ");
//            }

        }



    }


}


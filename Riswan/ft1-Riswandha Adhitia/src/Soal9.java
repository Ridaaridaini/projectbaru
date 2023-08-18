import java.util.Arrays;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("worlds : ");
        String[] kata = input.nextLine().split(" ");
        String kalimat ="";

        String[] hasil = new String[kata.length];

        for (int i = 0; i < kata.length; i++) {
            kalimat = "";
            for (int j = 0; j < kata.length; j++) {
                if(kata[i].length() ==kata[j].length()){
                    kalimat= kalimat+kata[j]+", ";
                }
            }
            //System.out.println(kalimat);
            System.out.println();
            hasil[i] = kalimat;

        }
        Arrays.sort(hasil);
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i]+", ");
        }
//        String hasil2 = "";
//        for (int i = 0; i < hasil.length; i++) {
//            if (!hasil2.contains(hasil[i] && hasil[i].length()<)){
//                hasil2 = hasil2+hasil[i];
//                System.out.println(hasil[i]);
//            }
//
//        }
    }
}

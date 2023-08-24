import java.util.Random;
import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("total penduduk n: ");
        int n= scanner.nextInt();

        System.out.print("total paslon: ");
        int m = scanner.nextInt();
        double[] paslon = new double[m];
        double hasilHitung =0;

        for (int i = 0; i < m; i++) {
            paslon[i] = random.nextInt(n);
            System.out.println(paslon[i]);
            hasilHitung = (paslon[i]/n)*100;
            System.out.println(hasilHitung + "%");
        }

    }
}

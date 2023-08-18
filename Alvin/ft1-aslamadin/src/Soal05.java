import jdk.jshell.spi.SPIResolutionException;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {
// finished
        Scanner scanner = new Scanner(System.in);

        System.out.print("total penduduk: ");
        int n = scanner.nextInt();

        System.out.print("calon legislatif: ");
        int m = scanner.nextInt();

        Random random = new Random();
        int jumPenduduk = n;
        int pemilih;
        double presentase;
        int i = 0;

        while (m >= i){
            if (i == m){
                System.out.println("Golput: " + n + "(" + (n*100)/jumPenduduk + "%)");
                break;
            }

            pemilih = random.nextInt(n);
            presentase = (double) (pemilih*100)/jumPenduduk;

            System.out.println("Calon no. urut " + (i+1) + ": " + pemilih + " suara (" + presentase + "%)");
            n = n - pemilih;

            i++;
        }

    }

}

import java.util.Random;
import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int randomA = random.nextInt(10);
        int randomB = random.nextInt(10);
        int m =0;
        int n=3;
        int tampunganA =0;
        int tampunganB=0;

        System.out.print("pilih player A atau B (1 atau 2) : ");
        int kotak =scanner.nextInt();
        while (m<n){
            if(kotak==1){
                System.out.print("masukan angka A: ");
                int kotakMasuk = scanner.nextInt();
                tampunganA = tampunganA + randomA;
                tampunganB = tampunganB + randomB;
                System.out.println(" A "+tampunganA);
                System.out.println(" B "+tampunganB);
                m++;
            } else if (kotak==2) {
                System.out.print("masukan angka B: ");
                int kotakMasuk = scanner.nextInt();
                tampunganA = tampunganA + randomA;
                tampunganB = tampunganB + kotakMasuk;
                System.out.println(" A "+tampunganA);
                System.out.println(" B "+tampunganB);
                m++;
            }

        }
        if(tampunganA>tampunganB){
            System.out.println("anda menang");
        }else {
            System.out.println("anda kalah");
        }


    }
}

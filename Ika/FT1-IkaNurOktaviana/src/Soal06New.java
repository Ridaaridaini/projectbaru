import java.util.Random;
import java.util.Scanner;

public class Soal06New {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m =0;
        int n=3;
        int tampunganA =0;
        int tampunganB=0;

        System.out.print("pilih player A atau B (1 atau 2) : ");
        int kotak =scanner.nextInt();
        while (m<n){
            int randomA = random.nextInt(9);
            randomA+=1;
            int randomB = random.nextInt(9);
            randomB+=1;
            if(kotak==1){
                tampunganA = tampunganA + randomA;
                tampunganB = tampunganB + randomB;
                System.out.println(" A = " +tampunganA);
                System.out.println(" B =" +tampunganB);
                m++;
            }
            else if (kotak==2) {
                tampunganA = tampunganA + randomA;
                tampunganB = tampunganB + randomB;
                System.out.println(" A = " +tampunganA);
                System.out.println(" B = " +tampunganB);
                m++;
            }
            System.out.println();

        }

        if(kotak==1){
            if(tampunganA>tampunganB){
                System.out.println("anda menang!");
            }else {
                System.out.println("anda kalah");
            }
        }else if(kotak==2){
            if(tampunganB>tampunganA){
                System.out.println("anda menang");
            }else {
                System.out.println("anda kalah");
            }
        }else{
            System.out.println("ganti");
        }

    }
}

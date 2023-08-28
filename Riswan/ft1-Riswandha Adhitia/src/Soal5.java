import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Jumlah penduduk : ");
        int n = input.nextInt();
        System.out.println("banyak legislatif : ");
        int x = input.nextInt()+1;

        int[] legislatif = new int[x];
        int tampung=0;
        for (int i = 0; i < x; i++) {
            legislatif[i] = random.nextInt(n);
            tampung = tampung+legislatif[i];
            if (tampung>n){
                tampung=0;
                i=0;
                for (int j = 0; j < x; j++) {
                    legislatif[j] = 0;
                }
            }
        }
        legislatif[0] = n-tampung;

        Arrays.sort(legislatif);
        for (int i = 0; i < x; i++) {
            if(i==0){
                System.out.println("Golput : "+legislatif[i]+" ("+ (double)legislatif[i]/n* 100 +" % )");
            }else {
                System.out.println("Calon no. Urut  "+i+": "+legislatif[i]+" ("+ (double)legislatif[i]/n* 100 +" % )");
            }

        }
    }
}

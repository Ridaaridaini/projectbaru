import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] kotakAsli = {3,5,3,5,8,5,3,5,3};
        int[] kotakUrut = {3,5,3,5,8,5,3,5,3};
        Arrays.sort(kotakUrut);
        int a = 0;
        int b = 0;
        int tampungA= 0;
        int tampungB= 0;
        System.out.println("pilih player : ");
        String player = input.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.println("Round "+(i+1));
            a = random.nextInt(10);
            b = random.nextInt(10);
            System.out.println("Player a : " +a +" Player b : " +b );

            for (int j = 0; j < kotakUrut.length; j++) {
                if (j==a-1){
                    tampungA = tampungA + kotakAsli[i];
                }
            }
            for (int j = 0; j < kotakUrut.length; j++) {
                if (j==b-1){
                    tampungB = tampungB + kotakAsli[i];
                }
            }
            System.out.println("Nilai A :"+ tampungA +" Nilai B :"+tampungB);
        }
        if(player.equalsIgnoreCase("a")){
            if(tampungA>tampungB){
                System.out.println("anda A menang");
            }else {
                System.out.println("kalah");
            }    
        } else if (player.equalsIgnoreCase("b")) {
            if(tampungA>tampungB){
                System.out.println(" kalah");
            }else {
                System.out.println("anda B menang");
            }
        }

    }
}

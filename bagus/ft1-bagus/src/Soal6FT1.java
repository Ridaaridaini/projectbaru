import java.util.Random;
import java.util.Scanner;

public class Soal6FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Pilihan Player: ");
        String player = input.nextLine();
        int jumlahMenangA = 0;
        int jumlahMenangB = 0;
        int main = 1;
        while (main <= 3) {


            int a = random.nextInt(20);
            int b = random.nextInt(20);


            if (player.equalsIgnoreCase("A")){
                System.out.println("Nilai A = " + a);
                System.out.println("Nilai B = " + b);

                if (a>b){
                    System.out.println("Round "+main+ " A menang, B kalah");
                    jumlahMenangA++;
                }else if(a<b) {
                    System.out.println("Round "+main+ " A kalah, B menang");
                    jumlahMenangB++;
                }else{
                    System.out.println("Draw");
                }
            }

            else if (player.equalsIgnoreCase("B")){
                System.out.println("Nilai A = " + a);
                System.out.println("Nilai B = " + b);

                if (a>b){
                    System.out.println("Round "+main+ " A menang, B kalah");
                    jumlahMenangA++;
                }else if(a<b) {
                    System.out.println("Round "+main+ " A kalah, B menang");
                    jumlahMenangB++;
                }else{
                    System.out.println("Draw");
                }
            }

            main++;

        }


        if (jumlahMenangA>jumlahMenangB){
            System.out.println("A menang");
        }else {
            System.out.println("B menang");
        }


//        if (a>b){
//            System.out.println("Anda Menang, B kalah");
//        }else {
//            System.out.println("Anda kalah, B menang");
//        }
    }
}

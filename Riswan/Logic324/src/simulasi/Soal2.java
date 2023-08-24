package simulasi;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // N N T N N N T T T T T N T T T N T N
        int mdpl = 0;
        int gunung = 0;
        int lembah = 0;
        System.out.println("Input : ");
        String[] perjalanan = input.nextLine().split(" ");

        for (int i = 0; i < perjalanan.length; i++) {
            if(perjalanan[i].equalsIgnoreCase("n")){
                mdpl = mdpl +1;
                if(mdpl ==0){
                    lembah = lembah +1;
                }
            } else if (perjalanan[i].equalsIgnoreCase("t")) {
                mdpl = mdpl -1;
                if(mdpl ==0){
                    gunung = gunung +1;
                }
            }
        }
        System.out.println("Gunung : " + gunung);
        System.out.println("lembah : " + lembah);
        System.out.println("mdpl : "+mdpl);
    }
}

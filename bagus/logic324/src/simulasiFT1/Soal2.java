package simulasiFT1;


import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gunung = 0;
        int lembah = 0;
        int ketinggian = 0;

        System.out.println("input: ");
        String jalan = input.nextLine();

        String jalanRep = jalan.replace(" ", "");
        String [] jalanSplit = jalanRep.split("");

        for (int i = 0; i < jalanSplit.length; i++) {
            if (jalanSplit[i].equalsIgnoreCase("N")){
                ketinggian = ketinggian + 1;
                if (ketinggian == 0){
                    lembah = lembah + 1;
                }
            }
            if (jalanSplit[i].equalsIgnoreCase("T")){
                ketinggian = ketinggian - 1;
                if (ketinggian == 0){
                    gunung = gunung + 1;
                }
            }
        }
        System.out.println(gunung + " gunung, " + lembah + " lembah");
    }
}

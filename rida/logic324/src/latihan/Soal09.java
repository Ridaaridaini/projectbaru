package latihan;

import java.util.Random;
import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomGen = new Random();
        System.out.print("Masukkan jumlah kartu: ");
        Integer n= input.nextInt();
        int player= n;
        int computer= n;
        int jumKartu=0;
        while(jumKartu!=player+computer){
            System.out.print("Masukkan tawaran: ");
            Integer m= input.nextInt();
            int kotakA= randomGen.nextInt(10);
            int kotakB= randomGen.nextInt(10);
            System.out.println("Pilih kotak: 1.Kotak A   2.Kotak B");
            Integer pil= input.nextInt();
            if(pil==1){
                if (kotakA>kotakB){
                    System.out.println("Angka kotak: "+kotakA+ " & "+kotakB+". YOU WIN");
                    player=player+m;
                    computer=computer-m;
                    System.out.println("Sisa kartu anda: "+player+" computer "+computer);
                } else if (kotakA<kotakB) {
                    System.out.println("Angka kotak: "+kotakA+ " & "+kotakB+". YOU lOSE");
                    player=player-m;
                    computer=computer+m;
                    System.out.println("Sisa kartu anda: "+player+" computer "+computer);
                }else {
                    System.out.println("Isi kotak sama ");
                    System.out.println("Sisa kartu anda: "+player+" computer "+computer);
                }
            } else if (pil==2) {
                if (kotakB>kotakA){
                    System.out.println("Angka kotak: "+kotakA+ " & "+kotakB+". YOU WIN");
                    player=player+m;
                    computer=computer-m;
                    System.out.println("Sisa kartu anda: "+player+" computer "+computer);
                } else if (kotakB<kotakA) {
                    System.out.println("Angka kotak: "+kotakA+ " & "+kotakB+". YOU LOSE");
                    player=player-m;
                    computer=computer+m;
                    System.out.println("Sisa kartu anda: "+player+" computer "+computer);
                }else {
                    System.out.println("Isi kotak sama ");
                    System.out.println("Sisa kartu anda: "+player+" computer "+computer);
                }
            }
            if (player>computer){
                jumKartu=player;
            }else {
                jumKartu=computer;
            }
        }

    }
}

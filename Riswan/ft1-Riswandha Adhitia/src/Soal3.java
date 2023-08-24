import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String abjad = "abcdefghijklmnopqrstuvwxyz";
        String konsonan ="bcdfghjklmnpqrstvwxyz";
        String vokal = "aiueo";
        String abjad2 = abjad.toUpperCase();

        System.out.println("kalimat : ");
        String[] kalimat  = input.nextLine().replace(" ","").split("");
        System.out.println("penggal kata : ");
        int penggal = input.nextInt();

//        for (int i = 0; i < kalimat.length; i++) {
//            if(abjad.contains(kalimat[i]) || abjad2.contains(kalimat[i])){
//                if(i % penggal ==0 && i !=0){
//                    System.out.print(" , ");
//                }
//                System.out.print(kalimat[i]);
//            }
//        }
        for (int i = 0; i < kalimat.length; i++) {
            if(abjad.contains(kalimat[i]) || abjad2.contains(kalimat[i])){
                if(i % penggal ==0 && i !=0){
                    System.out.print(" , ");
                }
                String[] terbalik =kalimat[i].split("");
                for (int j = terbalik.length-1; j >= 0; j--) {
                    System.out.print(terbalik[j]);
                }
            }
        }
    }
}

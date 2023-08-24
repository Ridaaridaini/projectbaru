import java.util.Arrays;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata atau kalimat: ");
        String[] kata = input.nextLine().replace(" ","").split("");

        Arrays.sort(kata);
        System.out.println("Masukkan panjang penggalan kata");
        int panjang = input.nextInt();
        int[] penggalan = new int[panjang];

        String unik = "";

        for (int i = 0; i <= kata.length; i++) {
            System.out.print(kata[i]+" ");
            if (i <= penggalan.length){
                if(!unik.contains(kata[i])){
                    unik = unik + kata[i];
                }System.out.print(unik+" ");

            }
        }



    }
}


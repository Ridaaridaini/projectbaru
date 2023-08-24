package simulasiFT1;

import java.util.Scanner;

public class Soal05 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Uang Budi = ");
        int uang = input.nextInt();

        int hargaCoklat = 3000;
        int coklat = uang/hargaCoklat;
        int stempel = coklat; //ini karena tiap beli coklat dapat 1 stempel

        while(stempel >= 5){

            int tukerCoklat = stempel/5; //bonus 1 coklat setelah mendapatkan 5 stempel
            int tukerStempel = tukerCoklat;
            int sisaStempel = stempel % 5;

            coklat = coklat + tukerCoklat;
            stempel = sisaStempel + tukerStempel;

        }

        System.out.print("Coklat = " + coklat);

    }
}

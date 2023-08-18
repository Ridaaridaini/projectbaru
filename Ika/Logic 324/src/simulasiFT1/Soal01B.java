package simulasiFT1;

import java.util.Scanner;

public class Soal01B {
    public static void main(String[] args) {
        //Sebuah deret terbentuk dari nilai yang sama dari kelipatan bilangan a dan b.
        // tampilkan deret tersebut jika panjang deretnya adalah n.
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan panjang deret: ");
        int deret = scanner.nextInt();

        System.out.print("masukan a: ");
        int a = scanner.nextInt();

        System.out.print("masukan b: ");
        int b = scanner.nextInt();

        int kpk=0;
        for (int i = 1; i <= deret; i++) {
            if(a%i==0 && b%i==0){
                kpk=i;
            }
        }
        int hasilKpk = (a*b)/kpk;
//        System.out.println(hasilKpk);

        int[] arrDeret = new int[deret];
        int kelipatan=hasilKpk;

        for (int i = 0; i < deret; i++) {
            arrDeret[i]=hasilKpk;
            System.out.print(arrDeret[i] + " ");
            hasilKpk = hasilKpk + kelipatan;
        }



    }
}

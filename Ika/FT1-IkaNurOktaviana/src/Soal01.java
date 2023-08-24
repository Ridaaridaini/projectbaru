import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int deret = scanner.nextInt();

        int[] arrderet = new int[deret];
        System.out.print("masukan angka ");
        for (int i = 0; i < arrderet.length; i++) {
            arrderet[i] = scanner.nextInt();
            System.out.println(arrderet[i]);
        }

        for (int i = 0; i < arrderet.length-1; i++) {
            int hasil = arrderet[i] + arrderet[i+1];
            System.out.println(arrderet[i] +  " + " + arrderet[i+1] + " = " + hasil);

        }


    }
}

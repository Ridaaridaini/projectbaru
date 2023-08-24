import java.util.Scanner;

public class Soal01New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan angka : ");
        String[] angka = scanner.nextLine().split(" ");

        for (int i = 0; i < angka.length-1; i++) {
//            int parAngka = Integer.parseInt(angka[i]);
//            System.out.println(parAngka);
            int hasil = Integer.parseInt(angka[i]) + Integer.parseInt(angka[i + 1]);
//            System.out.println(hasil);
            System.out.println(angka[i] + " + " + angka[i + 1] + " = " + hasil);
//            for (int j = angka.length-1; j >=0 ; j--) {
//                System.out.print(angka[j] + " ");
//        }
            System.out.println();
        }


    }
}
//for (int j = angka.length-1; j >=0 ; j--) {
//        System.out.println(angka[j] + " + " + angka[j+1] + " = " + hasil);
//        }
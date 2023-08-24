import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan deret angka n:");
        int n = input.nextInt();

        String strCoba = n+"";
        String [] arrStrCoba= strCoba.split("");
        int jumlah = 0;
        for (int i = 0; i < arrStrCoba.length; i++) {
            int hasil =Integer.parseInt(arrStrCoba[i]);
            jumlah= jumlah + hasil;

        }
        System.out.println(jumlah);


    }


}





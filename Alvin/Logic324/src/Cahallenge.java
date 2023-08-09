import java.util.Scanner;

public class Cahallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("panjang deret: ");
        int n = scanner.nextInt();

        int angka = 0;
        for (int i = 0; i < n; i++) {

            if (i%2==0){
                angka += 2;
                if (i == n-1){
                    System.out.print(angka);
                    continue;
                }
                System.out.print(angka + " ");
            }else {
                System.out.print("* ");
            }

        }

    }

}

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {
// selesai
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        System.out.print("x: ");
        int x = scanner.nextInt();

        int halaman = 1; //1 0+1 =1
        int[] deret = new int[n];
        for (int i = 0; i < n-2; i++) {
            deret[i] = halaman;
            halaman += 2;
        }

        int halamanX = 2; //2 0+1=1
        int[] deretX = new int[n];
        for (int i = 0; i < n-2; i++) {
            deretX[i] = halamanX;
            halamanX += 2;
        }


        for (int i = 0; i < deret.length; i++) {
            if (x == deret[i]){
                System.out.println("lembar ke-" + (i+1));
            } else if (x == deretX[i]) {
                System.out.println("lembar ke-" + (i+1));
            }
        }

    }

}

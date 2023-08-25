import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("deret ");
        int deret = scanner.nextInt();
        int n=0;
        int perkalian=0;
        int[] arrDeret = new int[deret];

//        for (int i = 0; i < deret; i++) {
//            System.out.print("masukan nilai: ");
//            for (int j = 0; j < deret; j++) {
//                arrDeret[j] = scanner.nextInt();
//                System.out.println(arrDeret[j]);
//            }
//        }


        for (int i = 0; i < deret; i++) {
            for (int j = 0; j < deret; j++) {
                arrDeret[j] =n;
                System.out.print(arrDeret[j] + " ");
                n= n+1;

                if(i==1){
                    int kali = arrDeret[j];
                    perkalian = kali *kali;
                }
            }
            System.out.println();
        }
        System.out.println(perkalian);

    }
}

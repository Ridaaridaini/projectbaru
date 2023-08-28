import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n : ");
        int n= scanner.nextInt();

        System.out.print("x: ");
        int x = scanner.nextInt();

        int cover =1;
        int halBelakang = 1;

        n= n-cover-halBelakang;
        int lembar = n - x;
//        int lembarGenap=lembar-1;
        if(x%2 !=0){
            System.out.println("lembar " + lembar);
        }else {
            System.out.println("lembar " + lembar);
        }
    }
}

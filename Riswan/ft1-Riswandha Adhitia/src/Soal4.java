import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("N : ");
        int n = input.nextInt();
        System.out.println("x : ");
        int x = input.nextInt();
        int lembar =0;
        while (x>0){
            x = x-2;
            lembar = lembar+1;
        }
        System.out.println("lembar ke : "+lembar);
    }
}

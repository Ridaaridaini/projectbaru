import java.util.Scanner;

public class Soal04new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n : ");
        int n= scanner.nextInt();

        System.out.print("x: ");
        int x = scanner.nextInt();
        int genap = x/2;
        int lembarGanjil = (x/2)+1;

        if(x%2 !=0){
            System.out.println("lembar " + lembarGanjil);
        }else {
            System.out.println("lembar " + genap);
        }
    }
}

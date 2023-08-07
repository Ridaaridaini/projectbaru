package day3LoopingBasic.latihan3;

public class Soal12PolaSegi3Siku {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i <= n; i++){//true
            System.out.println();// enter

            for (int j = 0; j < i; j++) {// i =1 -> true
                System.out.print("*" +" "); //print * + spassi
                
            }
        }
        System.out.println();
        // n = 4
        int n2 = 4;
        for (int i = 0; i <= n2 ; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(("*")+" ");

            }

        }
    }
}

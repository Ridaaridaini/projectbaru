package day3;

public class ContohForLoop {

    public static void main(String[] args) {

        System.out.println("Contoh 1");
        for (int i = 0; i < 3; i++) {//i = 0 1 2 3
            System.out.print(i);
        }

        //output : 0 1 2

        System.out.println();
        System.out.println("Contoh 2");
        for (int i = 5; i > 1; i = i - 2){//i = 5, 3, 1
            System.out.print(i);
        }
        //output : 5 3

        System.out.println();
        System.out.println("Contoh 3");
        for (;;){
            System.out.println(0);
        }







    }
}

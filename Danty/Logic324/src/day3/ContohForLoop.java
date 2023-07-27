package day3;

public class ContohForLoop {

    public static void main(String[] args) {

        System.out.println("Contoh 1");

        for (int i = 0; i < 3; i++) {

            System.out.print(i);

        }
        System.out.println();
        System.out.println("Contoh 2");
        for (int i = 5; i > 1 ; i = i -2) {

            System.out.print(i);
        }
        System.out.println();
        System.out.println("Contoh 3");
        for(;;) //ingat di statement 2 default true (always true)
            System.out.println(0); //infinity loop (gak berhenti2)
    }
}

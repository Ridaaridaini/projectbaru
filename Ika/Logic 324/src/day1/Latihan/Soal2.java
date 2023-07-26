package day1.Latihan;

public class Soal2 {
    public static void main(String[] args) {

        // menukar nilai a dengan nilai b dan sebaliknya tanpa variabel tambahan
        int a = 3;
        int b = 4;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

        /*a=4;
        System.out.println(a);
        b=3;
        System.out.println(b);*/

    }
}

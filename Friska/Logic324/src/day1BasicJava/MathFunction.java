package day1BasicJava;

public class MathFunction {
    public static void main(String[] args) {
        //perpangkatan
        System.out.println((int)Math.pow(2,8));

        //nilai absolute
        System.out.println(Math.abs(-15));

        //pembulatan
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(2.6));

        //pembulatan ke atas
        System.out.println(Math.ceil(2.1));

        //pembulatan ke bawah
        System.out.println(Math.floor(2.5));
    }
}

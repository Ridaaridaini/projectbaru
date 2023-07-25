package day1;

public class MathFunction {

    public static void main(String[] args) {
        //perpangkatan
        System.out.println((int)Math.pow(2,8)); //256

        //nilai absolut
        System.out.println(Math.abs(-15)); //15

        //pembulatan
        System.out.println(Math.round(2.5)); //3
        System.out.println(Math.round(2.4)); //2

        //pembulatan ke-atas
        System.out.println(Math.ceil(2.1)); //3.0

        //pembulatan ke-bawah
        System.out.println(Math.floor(2.6)); //2.0
    }

}

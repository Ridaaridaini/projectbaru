package day1BasicJava;

public class CastingParsing {
    public static void main(String[] args) {
        //CASTING
        double a = 12.5;
        //costing value a menjadi int
        int b = (int) a;
        System.out.println(b);
        long c = b ;

        //PASSING
        String strA = "120";
        String strB = "100";

        System.out.println(strA+strB);

        //String -> integer
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);

        //String -> long
        long longA = Long.parseLong(strA);
        System.out.println(intA+intB);

        //int -> String
        String strAB = intA + "";
        strAB = String.valueOf(intA);

    }
}

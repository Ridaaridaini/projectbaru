package day1;

public class CastingParsing {
    public static void main(String[] args) {

        double a = 12.5;

        //casting value a menjadi int
        int b = (int) a;
        System.out.println(b);

        long c = b;

        //Parsing
        String strA = "120";
        String strB = "100";

        System.out.println(strA+ strB);

        // string -> int
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);

        //string -> long
        long longA = Long.parseLong(strA);

        System.out.println(intA+intB);

        //int -> string
        String strAB = intA +"";
        String strBA = String.valueOf(intA);
    }
}

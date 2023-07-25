package day1;

public class CastingParsing {

    public static void main(String[] args) {
        //CASTING

        double a = 12.5;
        //casting value a menjadi int
        int b = (int) a;
        System.out.println(b);
        long c = (long) a;

        //PARSING
        String strA = "120";
        String strB = "100";

        System.out.println(strA + strB);

        //String -> int
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);

        //String -> Long
        long longA = Long.parseLong(strA);

        System.out.println(intA+intB);

        //int -> String
        String strAB = intA + "";
        String strBA = String.valueOf(intA);



    }
}

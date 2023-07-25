package day1;

public class CastingParsing {
    public static void main(String[] args) {
        // casting double ke integer
        double a = 23.34;
        int b = (int) a;
        System.out.println(b);

        //parsing
        String strA = "212";
        String strB = "188";

        //str to int
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);

        System.out.println(intA+intB);

        //str to long
        long longA = Long.parseLong(strA);
        long longB = Long.parseLong(strB);

        System.out.println(longA+longB);

        //int to str
        String strAB = intA + "";
        String strBA = String.valueOf(intA);

        System.out.println(strAB);
        System.out.println(strBA);

    }
}

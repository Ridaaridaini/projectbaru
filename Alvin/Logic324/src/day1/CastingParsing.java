package day1;

public class CastingParsing {
    public static void main(String[] args) {
        //CASTING
        //double to integer
        double a = 12.5;
        int b = (int) a; //casting a the double to b the integer

        System.out.println(b);

        long c = b;
        System.out.println(c);

        //PARSING
        //string to integer

        String strA = "120";
        String strB = "100";

        int intStrA = Integer.parseInt(strA);
        int intStrB = Integer.parseInt(strB);
        //string to long
        long longStrA = Long.parseLong(strA);
        long longStrB = Long.parseLong(strB);

        System.out.println(intStrA + intStrB);
        System.out.println(longStrA + longStrB);

        //int to string
        String stringIntA = String.valueOf(intStrA + intStrB);

        System.out.println(stringIntA);
    }
}

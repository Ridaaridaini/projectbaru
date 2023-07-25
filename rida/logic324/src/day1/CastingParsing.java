package day1;

public class CastingParsing {
    public static void main(String[] args) {
        //casting
        double a =12.5;
        //casting value
        int b =(int) a;
        System.out.println(b);
        long c = b;
        //long c=(long)a;
        //parsing
        String strA ="120";
        String strB ="100" ;
        System.out.println(strA + strB);
        //string->int
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);
        //System.out.println(intA+intB);
        // string->long
        long longA= Long.getLong(strA);
        System.out.println(intA+intB);
        //int -> string
        String strA1 = intA +"";
        String strB1 = String.valueOf(intA);

    }
}

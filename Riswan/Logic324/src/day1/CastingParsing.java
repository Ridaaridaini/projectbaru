package day1;

public class CastingParsing {
    public static void main(String[] args) {
        double a = 12.5;
        //casting value a menjadi int
        int b = (int) a;
        System.out.println(b);
        long c = b;

        // parsing
        String strA = "120";
        String strB = "100";
        int angka = 10;

        //String  to INT
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);

        //String  to long
        long longA = Long.parseLong(strA);
        long longB = Long.parseLong(strB);

        //Int to String
        String strAB = String.valueOf(angka);
        String BA = strA +"";

        System.out.println("hasil "+ (intA + intB));
        System.out.println("hasil "+ (longA + longB));
        System.out.println("hasil "+ (strAB + BA));

    }
}

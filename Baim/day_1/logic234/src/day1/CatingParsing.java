package day1;

public class CatingParsing {
    public static void main(String[] args) {
        // Casting
        int a = 10;
        double b = 3.0;

        // int c = a / b; // error
        int c = (int) (a / b);
        System.out.println(c);

        // Parsing
        String d = "10";
        int e = Integer.parseInt(d);
        System.out.println(e);

        String f = "3.0";
        double g = Double.parseDouble(f);
        System.out.println(g);

        String h = "true";
        boolean i = Boolean.parseBoolean(h);
        System.out.println(i);

        //int -> string
        String strA = a + "";
        String strB = String.valueOf(a);

        System.out.println(strA + " " + strB);



    }
}

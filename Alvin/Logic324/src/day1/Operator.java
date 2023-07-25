package day1;

public class Operator {
    public static void main(String[] args) {
        //bilangan bulat { +, -, *, /, % }

        int a = 13 + 2 - 5 * 9 /2;
        System.out.println(a);

        int iniModulus = 15 % 6;
        System.out.println(iniModulus);

        //bilangan desimal { +, -, *, /, % }
        double iniDesimal = 1.2 + 3.2 * 1 / 3.1;
        System.out.printf("%15.2f", iniDesimal);
        System.out.println();

        //boolean { &&, ||, ! }

        boolean iniBooleanX = true || false;

        boolean iniBooleanY = true && false || true;

        boolean iniBooleanZ = !((true && false) || false);

        boolean iniBooleanA = !((true || false) && false);

        System.out.println(iniBooleanX + " " + iniBooleanY + " " + iniBooleanZ + " " + iniBooleanA);

        //string {+}
        System.out.println("Me"+"And"+"You");

//        extraordinary
//        String + Integer
//        "Hey" + 123 = "Hey123"

//        int / int
//        5 / 2 = 2

//        int/double atau double/int
//        5.0 / 2 = 2.5
//        5 / 2.0 = 2.5
//        5 / 2f = 2.5
//        5f / 2 = 2.5

        System.out.println(5f/2);
    }
}

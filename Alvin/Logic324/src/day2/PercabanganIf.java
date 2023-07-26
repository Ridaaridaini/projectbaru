package day2;

public class PercabanganIf {
    public static void main(String[] args) {
        int a = 5;

        if (a <= 5){
            System.out.println("a small number");
        }

        if (a >= 10) {
            System.out.println("a big number");
        }

        int b = 7;

        if (b <= 5) {
            System.out.println("b small number");
        } else if (b>=10) {
            System.out.println("b big number");
        }else{
            System.out.println("b regular number");
        }

        String thisTernary = b<=5 ? "b small number" : "b big number";

        System.out.println(thisTernary);

    }
}

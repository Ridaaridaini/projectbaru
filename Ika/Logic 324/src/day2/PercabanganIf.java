package day2;

public class PercabanganIf {
    public static void main(String[] args) {

        int a = 7;

        if (a <= 5) {
            System.out.println("a bilangan kecil");//body
        }
        if (a >= 10) {
            System.out.println("a bilangan besar");// dua-duanya tercetak karena beda rangkaian
            //merapihkan file shourcut --> ctrl + alt +shift+l
        } else if( a == 7 ){
            System.out.println("a bilangan beruntung");
        } else {
            System.out.println(" a bilangan biasa");
        }


    }
}

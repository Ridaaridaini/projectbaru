package day2;

public class PerbandinganString {

    public static void main(String[] args) {

        String string1 = "Dianty";
        String string2 = "Dianty";
        String string3 = "dianty";


        //cek apakah string sama
        //rumus equals case sensitive
        boolean cek1 = string1.equals(string2); //true

        //cek apakah string sama tanpa melihat huruf kapital
        //rumus equalsIgnoreCase tidak case sensitive
        boolean cek2 = string1.equalsIgnoreCase(string2); //true

        //cek apakah string tidak sama
        //rumusnya equals tetapi ditambah tanda seru di paling depan
        boolean cek3 = !string1.equals(string2); //false


        System.out.println(cek1);
    }
}

package day2;

public class PerbandinganString {
    public static void main(String[] args) {

        String string1 = "Irfan";
        String string2 = "Irfan";
        String string3 = "irfan";

        //cek apakah string sama
        boolean cek1 = string1.equals(string1);
        boolean cek2 = string2.equals(string2);

        //cek apakah string sama tanpa melihat huruf kapital
        boolean cek3 = string1.equalsIgnoreCase(string3);

        //cek apakah string tidak sama
        boolean cek4 = !string1.equals(string2);
        //3 ! = 3 -> false
    }
}

package day2;

public class PerbandinganString {
    public static void main(String[] args) {
        String string1 = "Riswan";
        String string2 = "Riswan";
        String string3 = "riswan";

        // cek apakah String sama
        boolean cek1 = string1.equals(string2);//true
        boolean cek2 = string1.equals(string3);//false

        //cek apakah string sama tanpa melihat huruf kapital
        boolean cek3 = string1.equalsIgnoreCase(string3);//true

        //cek apakah string tidak sama
        boolean cek4 = !string1.equals(string2);//false
    }
}

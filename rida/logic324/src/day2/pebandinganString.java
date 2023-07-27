package day2;

public class pebandinganString {
    public static void main(String[] args) {
        String str1="Riswan";
        String str2="Riswan";
        String str3="riswan";

        // Cek apakah String sama
        boolean cek1 = str1.equals(str2);//true
        boolean cek2 = str2.equals(str3);//false

        //cek apakah String sama tanpa melihat huruf kapital atau tidak
        boolean cek3 = str1.equalsIgnoreCase(str3);//true

        //Cek apakah string tidak sama
        boolean cek4 = !str1.equals(str2);//false



    }
}

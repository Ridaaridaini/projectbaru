package day2;

public class PerbandinganString {
    public static void main(String[] args) {

        String string1 ="Riswan";
        String string2 ="Riswan";
        String string3 ="riswan";



        //chek apakah string 1 dan 2 sama
        boolean cek1 = string1.equals(string2);//true
        boolean cek2 = string1.equals(string3);//false


        //chek apakah string sama tanpa melihat huruf kapital
        boolean cek3 = string1.equalsIgnoreCase(string3);//true

        //chek apakah string tidak sama
        boolean cek4= !string1.equals(string2);//false



    }
}

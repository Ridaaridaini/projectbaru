package day2;

import java.text.DecimalFormat;

public class PerbandinganString {
    public static void main(String[] args) {
        String string1 = "Riswan";
        String string2 = "Riswan";
        String string3 = "riswan";

        //Cek apakah string sama
        boolean cek1 = string1.equals(string2); //true
        boolean cek2 = string1.equals(string3); //false

        //cek apakah string sama tanpa melihat huruf kapital
        boolean cel3 = string1.equalsIgnoreCase(string3); //true

        //cek apakah string tidak sama
        boolean cek4 = !string1.equals(string2); //false
        //3 != 3 -> false

        //===============================
        //Format Angka
        long uang = 1_000_000_000;

        DecimalFormat df = new DecimalFormat("#,###.##");
        String cetak = df.format(uang);

        System.out.println(cetak);

        //=================================
        //Memaksa program berhenti

        System.exit(0);
        System.out.println("ini tidak muncul");






    }

}

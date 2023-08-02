package day6;

import java.util.Collections;

public class StirngManipulation {

    public static void main(String[] args) {

        String strIni = "Hallo World!";

        // 1. length = untuk mengetahui panjang string

        // contoh: "hello".length() -> 5

        int panjangStr = strIni.length();
//        "hello".length();
        System.out.println(panjangStr);


        // 2. trim = menghilangkan whitespace di awalan dan akhiran string

        //contoh : "hello  ".trim -> hello

        String strIni1 = "hello     ";

        String trimStr = strIni1.trim();
        int lengthWtrim = trimStr.length();
        int lengthWOtrim = strIni1.length();

        System.out.println("string setelah di trim: " + trimStr);
        System.out.println("length with trim: " + lengthWtrim);
        System.out.println("length with out trim: " + lengthWOtrim);

        // 3. substring 1 = memotong bagian depan string berdasarkan 1 parameter

        String tampungStr = "Riswan".substring(3);

        System.out.println(tampungStr);

        // 4. substring 2 = memotong bagian string berdasarkan 2 parameter

        tampungStr = "XSIS ACADEMY".substring(5, 8);

        System.out.println(tampungStr);

        // replace(a, b) -> String
        // 5. replace = mengantikan bagian string a ke b
        // contoh : "XSIS ACADEMY".replace( "XSIS", "RIDA" ) -> "RIDA ACADEMY"
        // contoh : "XSIS ACADEMY".replace( "SIS", "BRO" ) -> "XBRO ACADEMY"

        String myName = "Aslamadin Alvian Haz";

        String strReplace = myName.replace(" ", "");
        String strReplace2 = myName.replace(" ", "-");

        System.out.println(myName);
        System.out.println(strReplace);
        System.out.println(strReplace2);

        // 6. charAt(a), a -> int = mengambil karakter pada index ke-a pada string
        // contoh "dianti".charAt(3) -> 'n'

        char tempCharAt = "Dianty".charAt(3);
        System.out.println(tempCharAt);

        // 7. tuUpperCase() = mengubah string menjadi huruf kapital semua
        // contoh: "anya forger".toUpperCase() -> "ANYA FORGER"

        System.out.println(myName);
        String strUpper = myName.toUpperCase();

        System.out.println(strUpper);

        // 8. toLowerCase() = mengubah string menjadi huruf kecil semua
        // contoh: "ALVIN".toLowerCse() -> "alvin"

        String strLower = strUpper.toLowerCase();

        System.out.println(strLower);

        // 9. contains(a); a -> String = untuk mengecek apakah suatu string mengandung value yang sesuai dengan strng a (parameter)
        // contoh: "Bagus".contains("gus") -> true
        // contoh: "Bagus".contains("Bus") -> false

        boolean strContains = "Bagus".contains("g");
        boolean strContains2 = "Bagus".contains("Bus");

        System.out.println(strContains);
        System.out.println(strContains2);

        // 10. equals(a); a->String = membandingkan String dengan memperhatikan variasi string(cth: besar atau kecil huruf)
        // contoh: "Bagus".equals("bagus") -> false

        // 11, equalsIgnoreCase(a); a->String = membandingkan String tanpa memperhatikan variasi String
        // contoh: "Bagus".equalsIgnoreCase("bagus") -> true

        boolean strEqualsIgnoreCase = "Bagus".equalsIgnoreCase("ba gus");
        System.out.println("Bagus >< ba gus: " + strEqualsIgnoreCase);

        // 12. split(a); a -> String = memisahkan String berdasarkan parameter a, return String
        // contoh: "XSIS ACADEMY JOGJA".split(" ") -> String[] {"XSIS", "ACADEMY", "JOGJA"}
        // contoh: "a-b-c-d".split("-") -> String[] {"a", "b", "c", "d"}
        // contoh: "alv -in".split("") -> String[] {"a", "l", "v", " ", "-", "i", "n"}

        String[] strArrName = myName.split(" ");
        System.out.println();

        for (int i = 0; i < strArrName.length; i++) {
            System.out.println(strArrName[i]);
        }


        //kasus 1
        String contoh = "Rp.1.000.000";

        System.out.println(contoh);

        contoh = contoh.substring(3).replace(".", "");

        long tempContoh = Integer.parseInt(contoh);

        System.out.println(contoh);
        System.out.println(tempContoh);

        //kasus 2
        String contoh2 = "ID23452453453-TAS";
        String contoh3 = "ID434-Barang Mewah";

        String[] x = contoh2.split("-");
        String[] y = contoh3.split("-");

        System.out.println("nama barang: " + x[1]);
        System.out.println("nama barang: " + y[1]);

        //kasus 3
        String email = "alvian.aslamadin@gmail.com";
        String[] name = email.split("@");
        String[] name2 = name[0].split("\\.");
        System.out.println(name2[1] + " " + name2[0]);


    }

}

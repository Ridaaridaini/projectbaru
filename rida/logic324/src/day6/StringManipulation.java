package day6;

import java.sql.SQLOutput;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "Hello World";
        //1. length
        //mengetahui panjang suatu string
        int tampung = str1.length(); //atau
        "Hello".length();
        System.out.println("Panjang String: " + tampung);
        //spasi ikut dihitung dalam length

        //2. trim
        //menghilangkan whitespace diawalan dan akhiran string
        //cth : "hello baim ".trim() -> "hello baim"
        String tampungStr = str1.trim();
        "hello".trim();
        tampung = str1.trim().length(); //String manipulation dapat di kombinasikan
        System.out.println("Hasil trim : " + tampungStr);

        //3. substring(a) a-> int
        //memotong bagian depan String, stringnya dimulai indeks ke a(return string)
        //cth: "Riswan".substring(3) ->"wan"
        tampungStr = "Riswan".substring(3);
        System.out.println("Hasil substring 3 Riswan : " + tampungStr);

        //4. substring(a,b) a,b-> int
        //memotong dengan batasan indeks a dan b (return String)
        //cth "XSIS ACADEMY".substring(5,8) -> "ACA
        tampungStr = "XSIS ACADEMY".substring(5, 8);
        System.out.println("Hasil string 5,8 : " + tampungStr);

        //5. replace(a,b)
        //menggantikan bagian string a diubah ke b
        //cth:"XSIS ACADEMY".replace("XSIS","RIDA") ->"RIDA ACADEMY"
        //cth:"XSIS ACADEMY XSIS".replace("XSIS","RIDA") ->"RIDA ACADEMy RIDA" //BERUBAH
        //CTH: "XSIS ACADEMY".replace("SIS","BRO") -> "XBRO ACADEMY"
        //cth: "XSIS ACADEMY".replace("S","A") ->"XAIA ACADEMY"
        tampungStr = "XSIS ACADEMY".replace("SIS", "BRO");
        System.out.println("Hasil dari  replace : " + tampungStr);

        //6.charAT(a) a ->int
        //mengambil karakter di indeks a (return char)
        //cth : "Dianty".charAt(3) ->'n'
        char tampungChar = "Dianty".charAt(3);
        System.out.println("Hasil charAt 3 : " + tampungChar);

        //7. toUpperCase()
        //mengubah string meenjadi huruf kapital semua
        //cth: "anya forger".toUpperCase() ->"ANYA FORGER"
        tampungStr = "anya forger".toUpperCase();
        System.out.println("Hasil to UpperCase : " + tampungStr);

        //8. tolowerCase()
        //mengubah string menjadi huruf kecil semua (return String)
        //cth: "ALVIN".tolowerCase() -> "alvin"
        tampungStr = "ALVIN".toLowerCase();
        System.out.println("Hasil to LowerCase : " + tampungStr);

        //9. contains(a) a -> String
        //mengecek apakah string mengandung String a (return boolean)
        //cth: "bagus".contains("gus") -> true
        //cth: "Baim".contains("b") ->false
        //cth: "irfan-kun".contains("fankun") -> false
        boolean tampungBoolean = "Bagus".contains("gus");
        System.out.println("Hasil contains : " + tampungBoolean);

        //10. equals(a) a-> String
        //mengecek apakah string yang kita cek sama dengan string a (CASE SENSITIF). return boolean
        //cth: "Bagus.equals("bagus") ->false

        //11. equalsIgnoreCase(a) a-> String
        //mengecek apakah string yang kita cek sama denbgan string a (TIDAK CASE SENSITIF). Return boolean
        //cth: "Bagus.equalsIgnoreCase("bagus") ->true

        //12. split(a) a->String
        //memisahkan String berdasarkan pemisah a. return String[]
        //cth: "XSIS ACADEMY JOGJA".SPLIT(" ") -> String[]("XSIS", "ACADEMY", "JOGJA")
        //cth: "a-b-c-d".split("-") ->String[]{"a","b","c","d"}
        //cth: "Sakura -chwan".split(" ") ->String[]("S","a","k","u","r","a"," ","c","h","w","a","n"}

        String[] tampungArr = "XSIS ACADEMY JOGJA".split(" ");
        for (int i = 0; i < tampungArr.length; i++) {
            System.out.println(tampungArr[i]);
        }
        String contoh = "Rp.1.000.000";
        contoh =contoh.substring(3); //1.000.000
        contoh = contoh.replace(".",""); //1000000
        int contohInt = Integer.parseInt(contoh);
        System.out.println(contohInt + 5000);
    }

}

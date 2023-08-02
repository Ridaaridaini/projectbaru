package day6;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "   hallo bagus   ";

        //length = untuk ngitung panjang string
        int tampung = str1.length();

        System.out.println(tampung);

        //bisa juga kek gini
        //"hello".length();

        //trim = untuk menghilangkan whitespace didepan dan di belakang string

        int tampungTrim = str1.trim().length();
        System.out.println(tampungTrim);

        //substring = buat motong

//        "bagus".substring(2);
        System.out.println("bagus".substring(2));

        //substring 2 parameter

        System.out.println("bagus iman prasetyo".substring(5,15));

        //replace(a, b) = buat ganti a jadi b

        System.out.println("Bagus Iman Prasetyo".replace("Bagus", "Nurul"));

        //charAt(a) = parameter a bertipe int, return dari charAt adalah char
        System.out.println("iman".charAt(2));

        //toUpperCase = buat gedein huruf

        System.out.println("bagus iman prasetyo".toUpperCase());

        //toLowerCase = buat kecilin huruf

        System.out.println("PRASETYO".toLowerCase());

        //contains("a") = ngecek apakah string mengandung kata "a" -> return boolean

        System.out.println("bagus".contains("agus"));

        //equals = mengecek apakah string sama dengan parameter yang diisi

        System.out.println("bagus".equals("BAGUS"));

        //equalsIgnoreCase = sama aja kayak equals tapi tidak case sensitip

        System.out.println("bagus".equalsIgnoreCase("BAGUS"));

        //split(a)= memisahkan string berdasarkan a dan return string[]

        
        System.out.println("bagus".split(""));
    }
}

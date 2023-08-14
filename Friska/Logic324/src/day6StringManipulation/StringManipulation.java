package day6StringManipulation;

public class StringManipulation {
    public static void main(String[] args) {

        String str1 = "Hello World!";

        //01 length
        //Mengetahui panjang suatu string

        int tampung = str1.length();
        "hello".length();
        System.out.println("panjang string :"+ tampung);

        //02.Trim
        //Menghilangkan whittespace di awalan dan akhiran string (return Stirng)
        // contoh: " Hello Baim ".trim() -> "Hello baim"
        String tampungStr = str1.trim();
        "hello".trim();
        System.out.println("Hasil trim : " + tampungStr);
        tampung = str1.trim().length();
        System.out.println("Panjang String setelah trim :"+tampung);

        //03.Substring
        //Memotong bagian depan string, stringnya dimulai indeks ke a (return String)
        //cth : "Rizwan".substring -> "wan"
        tampungStr = "Rizwan".substring(3);
        System.out.println("Hasil Substring 3 Rizwan "+tampungStr);

        //04.Substirng (a,b) a,b -> int
        //Memotong dengan batasan indeks a dan b (return string)
        // cth : "XSIS ACADEMY".substring(5,8) -. "ACA"
        tampungStr = "XSIS ACADEMY".substring(5,8);
        System.out.println("Hasil substring 5,8 :"+tampungStr);

        //05.replace (a,b) a,b -> String
        //Menggantikan bagian string a diubah menjadi b
        //cth : "XSIS ACADEMY".replace)("XSIS","RIDA") -> "RIDA ACADEMY"
        //cth : "XSIS ACADEMY".replace)("SIS","BRO> "XBRO ACADEMY"
        //cth : "XSIS ACADEMY".replace)(" ","") -> "XSISACADEMY"
        //cth : "XSIS ACADEMY".replace)("S","A") -> "XAIA ACADEMY
        tampungStr = "XSIS ACADEMY".replace("SIS","BRO");
        System.out.println("Hasil dari replace:" + tampungStr);

        //06.CharAt(a) a-> int
        //Mengambil karakter di indeks a
        //cth : "Dianty".charAt(3) -> 'n'
        char tampungChar = "Dianty".charAt(3);
        System.out.println("Hasil dari charAt3 "+tampungChar);

        //07.toUpperCase()
        //Mengubah string menjadi huruf kapital semua
        //cth: "anya forger".toUpperCAse() --> "ANYA FORGER"
        tampungStr = "anya forger".toUpperCase();
        System.out.println("Hasil to Upper Case: "+tampungStr);

        //08.toLowerCase()
        //Mengubah string menjadi huruf kecil semua
        //cth. "ALVIN".toLowerCase();

        tampungStr = "AlVIN".toLowerCase();
        System.out.println("Hasil to LowerCase"+tampungStr);

        //09.contains(a) a-> String
        //Mengecek apakah string mengandung string a
        //cth : "Bagus".contains("gus") -> true
        //cth : "Baim".contains ("b") -> false
        //cth : "Irfan-kun".contains ("fankun") -> false
        boolean tampungBoolean = "Bagus".contains("gus");
        System.out.println("Hasil contains "+ tampungBoolean);

        //10.equals
        //Mengecek apakah string yang kita cek sama dengan string a (CASE SENSTIF).return boolean
        //cth : "Bagus".equals("bagus") ->false


        //11.equalsIgnoreCase
        //Mengecek apakah string yang kita cek sama dengan string a (TIDAK CASE SENSTIF).return boolean
        //cth : "Bagus".equalsIgnoreCase("bagus") ->true

        //12.Split(a) a ->String
        //Memisahkan string berdasarkan pemisah a. return String[]
        //cth : "XSIS ACADEMY JOGJA".split(" ") -> (XSIS", "ACADEMY", "JOGJA")
        //cth : "a-b-c-d".split("-") -> String[] {"a","b","c","d"}
        //cth : "Sakura -chwan".split("")
        //String[] {"S","a","k","u","r","a"," ","-","c","h","a","w","n"}
        String[] tampungArr = "XSIS ACADEMY JOGJA".split(" ");
        for (int i = 0; i < tampungArr.length; i++) {
            System.out.println(tampungArr[i]);

        }
        String contoh = "Rp.1000.000";
        contoh = contoh.substring(3);//1.000.000
        contoh = contoh.replace(".",""); //1000000
        int contohInt = Integer.parseInt(contoh);
        System.out.println(contohInt+ 5000);

        //Kasus 2
        String contoh2 = "ID12-Tas";
        String contoh3 = "ID12-Barang Mewah";

        String[] arrContoh2 = contoh2.split("-"); //{"ID12","Tas"}
        String namaBarang = arrContoh2[1]; //"Tas"
        System.out.println(namaBarang);

//        //Kasus 3
//        String contoh4 = "ibrohim.huzaini@gmail.com";
//        String[] arrContoh4 = contoh4.split(0);
//        contoh4 = arrContoh4;
//
//        //Split
//        arrContoh4 = contoh4.split("\\.");
//        String hasil = arrContoh4 [0];
//        System.out.println(hasil);
//
//        //Jalur replace
//        contoh4 =contoh4.replace("."," ");
//        System.out.println(contoh4);




    }
}

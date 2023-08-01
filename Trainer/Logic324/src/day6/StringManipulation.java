package day6;

public class StringManipulation {

    public static void main(String[] args) {

        String str1 = "Hello World   ";

        //01. length
        //Mengetahui panjang suatu string (return int)
        //cth : "hello".length() -> 5
        int tampung = str1.length();
        "hello".length();
        System.out.println("Panjang String : " + tampung);

        //02. trim
        //Menghilangkan whitespace di awalan dan akhiran string (return String)
        //cth : "  hello Baim  ".trim() -> "hello Baim"
        String tampungStr = str1.trim();
        "hello".trim();
        System.out.println("Hasil trim : " + tampungStr);
        tampung = str1.trim().length();
        System.out.println("Panjang String setelah Trim : " + tampung);

        //03. substring(a) a -> int
        //Memotong bagian depan string, stringnya dimulai indeks ke a (return String)
        //cth : "Riswan".substring(3) -> "wan";
        tampungStr = "Riswan".substring(3);
        System.out.println("Hasil substring 3 Riswan : " + tampungStr);

        //04. substring(a,b) a,b -> int
        //Memotong dengan batasan indeks a dan b (return String)
        //cth : "XSIS ACADEMY".substring(5,8) -> "ACA"
        tampungStr = "XSIS ACADEMY".substring(5,8);
        System.out.println("Hasil substring 5,8 : " + tampungStr);

        //05. replace(a,b) a,b -> String
        //Menggantikan bagian string a diubah ke b (return String)
        //cth : "XSIS ACADEMY XSIS".replace("XSIS","RIDA) -> "RIDA ACADEMY RIDA"
        //cth : "XSIS ACADEMY".replace("SIS","BRO") -> "XBRO ACADEMY"
        //cth : "XSIS ACADEMY".replace(" ","") -> "XSISACADEMY"
        //cth : "XSIS ACADEMY".replace("S","A") -> "XAIA ACADEMY"
        tampungStr = "XSIS ACADEMY".replace("SIS","BRO");
        System.out.println("Hasil dari Replace : " + tampungStr);

        //06. charAt(a) a -> int
        //Mengambil karakter di indeks a (return char)
        //cth : "Dianty".charAt(3) -> 'n'
        char tampungChar = "Dianty".charAt(3);
        System.out.println("Hasil charAt 3 : " + tampungChar);

        //07. toUpperCase()
        //Mengubah string menjadi huruf kapital semua (return String)
        //cth : "anya forger".toUpperCase() -> "ANYA FORGER"
        tampungStr = "anya forger".toUpperCase();
        System.out.println("Hasil to UpperCase : " + tampungStr);

        //08. toLowerCase()
        //Mengubah string menjadi huruf kecil semua (return String)
        //cth : "ALVIN".toLowerCase() -> "alvin"
        tampungStr = "ALVIN".toLowerCase();
        System.out.println("Hasil to LowerCase : " + tampungStr);

        //09. contains(a) a -> String
        //Mengecek apakah string mengandung string a (return boolean)
        //cth : "Bagus".contains("gus") -> true
        //cth : "Baim".contains("b") -> false
        //cth : "Irfan-kun".contains("fankun") -> false
        boolean tampungBoolean = "Bagus".contains("gus");
        System.out.println("Hasil contains : " + tampungBoolean);

        //10. equals(a) a -> String
        //Mengecek apakah string yang kita cek sama dengan string a (CASE SENSITIF). return boolean
        //cth: "Bagus".equals("bagus") -> false

        //11. equalseIgnoreCase(a) a -> String
        //Mengecek apakah string yang kita cek sama dengan string a (TIDAK CASE SENSITIF). return boolean
        //cth: "Bagus".equalsIgnoreCase("bagus") -> true

        //12. split(a) a -> String
        //Memisahkan string berdasarkan pemisah a. return String[]
        //cth : "XSIS ACADEMY JOGJA".split(" ") -> String[] {"XSIS", "ACADEMY", "JOGJA"}
        //cth : "a-b-c-d".split("-") -> String[] {"a","b","c","d"}
        //cth : "Sakura -chwan".split("")
        //                 -> String[] {"S","a","k","u","r","a"," ","-","c","h","w","a","n"}
        String[] tampungArr = "XSIS ACADEMY JOGJA".split(" ");
        for (int i = 0; i < tampungArr.length; i++) {
            System.out.println(tampungArr[i]);
        }

        //Kasus 1
        String contoh = "Rp.1.000.000";
        //contoh = contoh.substring(3); //1.000.000
        //contoh = contoh.replace(".",""); //1000000
        contoh = contoh.substring(3).replace(".","");
        int contohInt = Integer.parseInt(contoh);
        System.out.println(contohInt + 5000);

        //Kasus 2
        String contoh2 = "ID12-Tas";
        String contoh3 = "ID213-Barang Mewah";

        String[] arrContoh2 = contoh2.split("-"); //{"ID12","Tas"};
        String namaBarang = arrContoh2[1]; //"Tas"
        System.out.println(namaBarang);

        //Kasus 3
        //String contoh4 = "ibrohim.huzaini@gmail.com"; //-> "ibrohim huzaini"
        String contoh4 = "sakura.chan.machan@gmail.com"; //-> "ibrohim huzaini"
        String[] arrContoh4 = contoh4.split("@"); //{ibrohim.huzaini,gmail.com}
        contoh4 = arrContoh4[0]; //ibrohim.huzaini

        //Jalur Split
//        arrContoh4 = contoh4.split("\\."); //{ibrohim,huzaini}
//        String hasil = arrContoh4[0] + " " + arrContoh4[1];
//        System.out.println(hasil);

        //Jalur Replace
        contoh4 = contoh4.replace("."," ");
        System.out.println(contoh4); //ibrohim huzaini






    }

}

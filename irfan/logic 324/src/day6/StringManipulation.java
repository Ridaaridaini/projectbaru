package day6;

public class StringManipulation {
    public static void main(String[] args) {

        String str1 = "Hello word";

        //01. Length => mengetahui panjang suatu String (return int)
        //cth : "hello".length() -> 5
        int tampung = str1.length();
        "hello".length();
        System.out.println("panjang string = "+tampung);


        //02. trim => menghilangkan whitespace diawalan dan akhiran string
        //cth : "  hello irfan  ".trim() => "hello irfan"
        String tampungstr = str1.trim();
        "hello".trim();
        System.out.println("Hasil trim :" + tampungstr);
        tampung = str1.trim().length();
        System.out.println("panjang string setelah trim"+tampung);


        //03. substring (a) = int
        //memotong bagian depan string, stringnya dimulai indeks ke a (return string)
        //cth :"riswan".substring(3) => "wan";
        tampungstr ="Riswan".substring(3);
        System.out.println("panjang substring = "+tampungstr);


        //04. substring (a,b) a,b => int
        //memotong dengan batasan indeks a dan b (return string)
        //cth : "XSIS ACADEMY".substring (5,8) => "ACA"

        tampungstr = "XSIS ACADEMY".substring(5,8);
        System.out.println("Hasil substring 5,8"+tampungstr);

        //05. replace(a,b) => string
        //menggantikan bagian string a diubah ke b
        //cth : "XSIS ACADEMY XSIS".replace("XSIS","RIDA") -> "RIDA ACADEMY RIDA"
        //cth : "XSIS ACADEMY".replace("SIS","BRO) -> "XBRO ACADEMY"
        //cth : "XSIS ACADEMY".replace("S","A) -> "XAIA ACADEMY"


        tampungstr = "XSIS ACADEMY".replace("SIS", "BRO");
        System.out.println("Hasil dari replace = "+tampungstr);

        //06. charAt(a) a => int
        //mengambil karakter di indeks a (return char)
        //cth :"DIANTY".charAt(3) ->'n'

        char tampungChar = "Dianty".charAt(3);
        System.out.println("Hasil charAt 3 = "+tampungChar);

        //07. toUpperCase()
        //Mengubah string menjadi huruf kapital semua
        //cth : "irfan".toUpperCase() -> "IRFAN"
        tampungstr = "irfan afandi".toUpperCase();
        System.out.println("Hasil to UpperCase :"+ tampungstr);


        //08. toLowerCase()
        // mengubah string menjadi huruf kecil semua (return string)
        //cth : "IRFAN".toLowerCase();
        tampungstr = "IRFAN".toLowerCase();
        System.out.println("Hasil LowerCase = " +tampungstr);


        //09. contains(a) a -> String
        //mengecek apakah string mengandung string a (return boolean)
        // cth :"bagus".contains ("gus") -true
        //cth :"Baim".contains ("b") -> false
        //cth :"Irfan-kun".contains ("fankun") -> false
        boolean tampungBoolean = "Bagus".contains("gus");
        System.out.println("Hasil contains = "+tampungBoolean);



        //10. equals(a) a -> String
        //Mengecek apakah string yang kita cek sama dengan string a (CASE SENSITIF).return boolean
        //cth: "Bagus".equals("bagus") -> false



        //11. equaseIgnoreCase(a) a -> String
        //mengecek apakah string yang kita cek sama dengan string a ( TIDAK CASE SENSITIF).return boolean
        //cth: "Bagus".equaseIgnoreCase("bagus")-> true


        //12. split(a) a -> String
        //memisahkan string berdasarkan pemisah a => return String []
        //cth : "XSIS ACADEMY JOGJA".split(" ") -> String[] {"XSIS","ACADEMY","JOGJA"}
        //cth : "a-b-c-d".split("-") -> String[] {"a","b","c","d"}
        //cth : "ir -fan".split("") -> String[] {"i","r"," ","-","f","a","n"}

        String[] tampungArr = "XSIS ACADEMY JOGJA".split(" ");
        for (int i = 0; i < tampungArr.length; i++) {
            System.out.println(tampungArr[i]);

        }

        //Kasus 1
        String contoh = "Rp.1.000.000";
        contoh = contoh.substring(3);
        contoh = contoh.replace("."," ");
        // combo => contoh = contoh.substring(3).replace(".","");
       // int contohInt = Integer.parseInt(contoh);
       // System.out.println(contohInt + 5000);

        //Kasus 2
        String contoh2 = "ID12-Tas";
        String contoh3 = "ID213-Barang Mewah";

        String[] arrContoh2 = contoh2.split("-"); //{"ID12","Tas"}
        String namaBarang = arrContoh2[1]; //"Tas"
        System.out.println(namaBarang);

        //kasus 3
        String contoh4 ="ibrohim.hujaini@gmail.com"; // ->"ibrohim huzaini"
        String[] arrcContoh4 = contoh4.split("@"); //{ibrohim.huzaini,gmail.com}
        contoh4 = arrcContoh4[0];//ibrohim.huzaini

        //jalursplit
      //  arrcContoh4 = contoh4.split("\\."); //{ibrohim,huzaini}
      //  String hasil = arrcContoh4[0]+" "+arrcContoh4[1];
      //  System.out.println("hasil");

        //jalur cepat
        contoh4 = contoh4.replace("."," ");
        System.out.println(contoh4); //ibrohim huzaini
    }
}

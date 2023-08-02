package day6;

import java.util.zip.DeflaterOutputStream;

public class StringManipulation {
    public static void main(String[] args) {

        String str1 ="  Hello World  ";

        //01. length()
        // mengetahui panjang suatu String (return int)
        // contoh : "hello".length(); ---> 5
       int tampung = str1.length();
       int a =   "hello".length();
       System.out.println("Panjang String : " + tampung);
       System.out.println("panjang string hello : " + a);


       //02. trim (return string)
        //digunakan untuk menghilangkan whitspace untuk awalan dan akhiran string
        //cth : "  hello ika   ".trim -->"hello ika"
        //digunakan saat akan mengitung length() namun ada banyak whitspace
        String tampungStr = str1.trim();
        "hello".trim();
        System.out.println("hasil trim : " + tampungStr);

        int b =str1.trim().length();//ditrim terlebih dahulu kemudian di ambil panjang barisnya
        System.out.println("panjang string setelah trim: "+ b);

        //03. substring(a) a-->int
        //memotong bagian dari string , stringnya dimulai dari INDEKS KEa(return string0
        //cth : "Riswan".substring(3) -->"wan". 3 adalah indeks pertam yang diambil indeks sebelumnya dihapuskan

        tampungStr = "Riswan".substring(3);
        System.out.println("hasil subsrtring indeks ke-3 Riswan: " + tampungStr);

        //04. subsrting(a,b) dengan a,b adalah integer
        //fungsinya untuk memotong dengan batasan indeks a dan b dengan return string
        // dengan a ikut diambil sedangkan untuk bnya tidak ikut, tapi indeks sebelum 8 yang akan terprint
        // cth : "XSIS ACADEMY".substring(5,8)--> "ACA"
        tampungStr = "XSIS ACADEMY".substring(5,8);
        System.out.println("hasil substrin(5,8) " + tampungStr);
        System.out.println("hasil dari subsrting dengan dibatasi dua indeks adalah : " + tampungStr);

        //05. replace(a,b) --> string
        // menggantikan bagian string a diubah menjadi string b
        //cth : "XSIS ACADEMY".replace("XSIS", "RIDA") --> "RIDA ACADEMY"
        //cth : "XSIS ACADEMY".replace("SIS", "BRO") -->"XBRO ACADEMY"
        //cth : "XSIS ACADEMY".replace(" ","")-->"XSISACADEMY"
        //CTH : "XSIS ACADEMI".replace("S", "A") --> "XAIA ACADEMY"
        tampungStr = "XSIS ACADEMY".replace("SIS", "BRO");
        System.out.println("hasil dari replace : " + tampungStr);

        //06. charAt(a) --> dengan a adalah int
        // mengambil karakter di indeks a
        //cth : "Dianty".charAt(3) --> "n"
        char tampungChar = "Dianty".charAt(3);
        System.out.println("hasil charAt 3 : " + tampungChar);

        //07. toUpperCase()
        // mengubah string menjadi huruf kapital semua (return String)
        // cth : "anya forger".toUpperCase() --> "ANYA FORGER"
        tampungStr = "anya forger".toUpperCase();
        System.out.println("hasil dari toUpperCase : " + tampungStr);

        //08. toLowerCase
        //mengubah string menjadi huruf kecil semua (return String)
        // crh "ALVIN".toLowerCase(); --> "alvin"
        tampungStr ="ALVIN".toLowerCase();
        System.out.println("hasil dari toLowerCase : " + tampungStr);

        //09. contains(a) --> a adalah String
        // mengecek apakah string mengandung string a (return boolean)
        //cth : "bagus".contains("gus") --> true
        //cth : "Baim".contains("b") --> false karena berbeda yansatu b sedangkan yang satunya B
        //cth : "Irfan-kun".contains("fankun") --> false
        boolean tampungBoolean = "Bagus".contains("gus");
        System.out.println("hasil contains : " + tampungBoolean);

        //10. equals(a) a-->string  (return BOOLEAN)
        //mengechek apakah string yang kita chek apakah sama dengan string a dan CASE SENSITIVE/
        //cth : "Bagus".equals("bagus") --> false

        //11. equalsIgnoreCase(a) a--> String
        //mengechek apakah string yang kita cek sama dengan string a (TIDAK CASE SENSITIVE). return boolean
        //cth : "Bagus".equalsIgnoreCase("bagus") -->true

        //12. split(a)  a-->String
        //memisahkan string berdasarkan pemisah a RETURN VALUE STRING[]/string array
        //cth : "XSIS ACADEMY JOGJA".split(" ") --> {"XSIS", "ACADEMY", "JOGJA"}
        //CTH : "a-b-c-d".split("-") --> String[] {"a","b,"c","d"}
        //cth : "yogya -karta".split("") --> String[] {"y","o","g","y","a"," ", "-","k","a","r","t","a"}

        String[] tampungArr = "XSIS ACADEMY JOGJA".split(" ");//" " untuk mengambil perkalimat
        for (int i = 0; i < tampungArr.length; i++) {
            System.out.println(tampungArr[i]);
        }

        String contoh = "Rp.1.000.000";
//        contoh = contoh.substring(3);//1.000.000
//        contoh = contoh.replace(".", "");
        contoh = contoh.substring(3).replace(".",""); //dicombo
        int contohInt = Integer.parseInt(contoh);
        System.out.println(contohInt + 5000);

        String contoh2="I012-Tas";
        String contoh3="I0213-Barang Mewah";

        //hanya mengambil barangnya saja idnya tidak
        String[] arrContoh2 = contoh2.split("-");//{"I012","Tas"}

        String namaBarang = arrContoh2[1];
        System.out.println(namaBarang);

        //hanya mengambil barangnya saja idnya tidak
        String[] arrContoh3 = contoh3.split("-");//{"I012","Tas"}
        String namaBarang1 = arrContoh3[1];
        System.out.println(namaBarang1);

        //kasus3
        String contoh4 = "ikanur.oktaviana@gmail.com";//-->
        String[] arrContoh4 = contoh4.split("@");//--> {"ikanur.oktaviana","gmail.com"}
        contoh4 = arrContoh4[0];//--> ikanur.oktaviana
        System.out.println(contoh4);

     //dengan Replace
     contoh4 = contoh4.replace("."," ");
     System.out.println(contoh4);






//        //dengan split
//        arrContoh4 = contoh4.split("\\.");
//        String hasil = arrContoh4[0] + " " + arrContoh4[1];
//     System.out.println(hasil);


























    }
}

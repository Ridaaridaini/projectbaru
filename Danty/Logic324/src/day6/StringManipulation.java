package day6;

public class StringManipulation {

    public static void main(String[] args) {

        String str1 = "Hello World";

        //length
        //Mengetahui panjang suatu string (return int)
        //cth : "hello".length(); -> 5
        int tampung = str1.length(); //spasi dihitung
        "hello".length();
        System.out.print("Panjang String : " + tampung);

        System.out.println();

        //trim
        //berfungsi menghilangkan whitespace (spasi) di awalan dan akhiran string
        //cth : " hello dianty ".trim(); -> "hello dianty"
        String str2 = " hello dianty ";
        String menampung = str2.trim();
        System.out.print("Hasil trim : " + menampung);

        System.out.println();

        int tmpng = str2.trim().length();
        System.out.print("Hasil panjang string setelah di trim : " + tmpng);

        System.out.println();

        //Substring(a) a -> int
        //Mmemotong bagian depan string, stringnya dimulai indeks ke a (return String);
        //cth : "Dianty".substring(3) -> "nty";
        String nama = "Dianty".substring(3);
        System.out.print("Hasil Substring : " + nama);

        System.out.println();

        //substring (a,b) a,b -> int
        //Memotong dengan batasan indeks a dan b (return String)
        //cth : "XSIS ACADEMY".substring(5,8) -> "ACA" (yang kecetak huruf di indeks 5, 6, 7)
        nama = "XSIS ACADEMY".substring(5,8);
        System.out.println("Hasil Substring 5,8 : " + nama );


        //replace(a,b) a,b -> String
        //Menggantikan bagian string a diubah ke b
        //cth : "XSIS ACADEMY XSIS".replace("XSIS", "RIDA") -> "RIDA ACADEMY RIDA"
        //cth : "XSIS ACADEMY".replace("SIS", "BRO") -> "XBRO ACADEMY"
        //cth : "XSIS ACADEMY".replace(" ", "") -> "XSISACADEMY" (ini menggantikan spasi)
        //cth : "XSIS ACADEMY".replace("S", "A") -> "XAIA ACADEMY" (satu huruf diganti, jadi ganti semua) (case sensitive)
        nama = "XSIS ACADEMY".replace("SIS","BRO");
        System.out.println("Hasil Replace : " + nama);

        //charAt(a) a -> int
        //Mengambil karakter di indeks a (return char)
        //cth : "Dianty".charAt(3) -> 'n'
        char saya = "Dianty".charAt(3);
        System.out.println("Hasil charAt : " + saya);

        //toUpperCase()
        //Mengubah string menjadi huruf kapital semua
        //cth : "dianty fistika".toUpperCase(); -> "DIANTY FISTIKA"
        nama = "dianty fistika".toUpperCase();
        System.out.println("Hasil toUpperCase : " + nama);


        //toLowerCase()
        //Mengubah string menjadi huruf kecil semua
        //cth : "DIANTY FISTIKA".toLowerCase(); -> "dianty fistika"
        nama = "DIANTY FISTIKA".toLowerCase();
        System.out.println("Hasil toLowerCase : " + nama);

        //contains(a) a -> string;
        //Mengecek apakah mengandung string a (return boolean)
        //cth : "Dianty".contains("Dia") -> true
        //cth : "Dianty".contains("d") -> false
        //cth : "Dianty-ssi".contains("tyssi") -> false

        boolean namaSaya = "Dianty".contains("Dia");
        System.out.println("Hasil Contains : " + namaSaya);

        //equals(a) a -> string
        //Mengecek apakah string yang kita cek sama dengan string a (CASE SENSITIVE) return boolean
        //cth: "Dianty".equals("dianty") -> false

        //equalsIgnoreCase(a) a -> string
        //Mengecek apakah string yang kita cek sama dengan string a (TIDAK CASE SENSITIVE) return boolean
        //cth: "Dianty".equalsIgnoreCase("dianty") -> true

        //split(a) a -> String
        //Memisahkan string berdasarkan pemisah a, return String[]
        //cth : "XSIS ACADEMY JOGJA".split(" ") -> String[] {"XSIS", "ACADEMY", "JOGJA"} (ini split berdasarkan spasi)
        //cth : "a-b-c-d".split("-") -> String[] {"a", "b", "c", "d"}
        //cth : "Sakura -chan".split("") -> String [] {"s", "a", "k", "u", "r", "a", " ", "-", "c", "h", "a", "n"}
        String [] academy = "XSIS ACADEMY JOGJA".split(" ");
        for (int i = 0; i < academy.length; i++) {
            System.out.println(academy[i]);

        }

        String contoh = "Rp.1.000.000";
        //contoh = contoh.substring(3);//1.000.000
        //contoh = contoh.replace(".","");//1000000
        contoh = contoh.substring(3).replace(".","");//gabungan cara di atasnya
        int contohInt = Integer.parseInt(contoh); //ini di konversi ke tipe data integer
        System.out.println(contohInt + 5000);

        //Contoh 2
        String contoh2 = "ID12-Tas";
        String contoh3 = "ID123-Barang Mewah";

        String[] arrContoh2 = contoh2.split("-");
        String namaBarang = arrContoh2[1];
        System.out.println(namaBarang);

        String[] arrContoh3 = contoh3.split("-");
        String namaBarangMewah = arrContoh3[1];
        System.out.println(namaBarangMewah);

        //Kasus 3
        String contoh4 = "dianty.fistika@gmail.com"; //
        String[] arrContoh4 = contoh4.split("@");
        contoh4 = arrContoh4[0];

        //replace
        contoh4 = contoh4.replace("."," ");
        System.out.println(contoh4);



    }

}

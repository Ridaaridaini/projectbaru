package day6;

public class StringManipulation {
    public static void main(String[] args) {
        String str1 = "Hello World   ";

        //length / panjang String
        int tampung = str1.length();
        System.out.println("Panjang String : "+ tampung);

        // trim
        // menghilangkan whitespace di awalan dan akhiran string
        // cth : " hello Riswan ".trim() -> "hello Riswan"
        String tampungStr = str1.trim();
        System.out.println("Hasil String : "+ tampungStr);
        System.out.println();
        tampung = str1.trim().length();
        System.out.println("Panjang String : "+ tampung);

        //3 substring(a) a -> int
        //Memotong bagian depan String, stringnya dimulai indeks ke a (return String)
        // cth : "Riswan".subtring(3) -> "wan";
        tampungStr = "Riswan".substring(3);
        System.out.println("Hasil substring 3 Riswan : " + tampungStr);

        //substring(a,b) a,b ->int
        //momotong dengan batasan indeks a dan b (return String)
        // cth : "Xsis Academy".substring(5,8) -> "Aca"
        tampungStr = "Xsis Academy".substring(5,8);
        System.out.println("Hasil substring 5,8 : "+ tampungStr);

        // 5 replace(a,b) a,b -> String
        // menggantikan bagian string a diubah ke b
        //contoh : "Xsis Academy Xsis".replace("Xsis","Rida") -> "Rida Academy Rida"
        //contoh : "Xsis Academy".replace("sis","bro") -> "Rbro Academy"
        //contoh : "Xsis Academy".replace(" ","") -> "XsisAcademy"
        //contoh : "Xsis Academy".replace("s","a") -> "Xaia Academy"

        tampungStr = "XSIS ACADDEMY".replace("SIS","BRO");
        System.out.println("Hasil Replace : " + tampungStr);

        //06 charAt(a a-> int
        // Mengambil karakter di indeks a (return char)
        //contoh : "Dianty".charAt(3) -> 'n'
        char tampungChar = "Dianty".charAt(3);
        System.out.println("hasil charat 3 : "+ tampungChar);

        //07. toUpperCase()
        // merubah string menjadi huruf kapital semua
        // cth : "anya forger".toUpperCase() -> "ANYA FORGER"
        tampungStr = "anya forger".toUpperCase();
        System.out.println("hasil upper case : "+ tampungStr);

        //08. toLowerCase()
        // merubah string menjadi huruf kapital semua
        // cth : "ANYA FORGER".toLowerCase() -> "anya forger"
        tampungStr = "ANYA FORGER".toLowerCase();
        System.out.println("hasil lower case : "+ tampungStr);

        //09. contains(a) a->String
        //Mengecek apakah string mengandung string a(return boolean)
        //cth: "Bagus".contains("gun") ->true
        //cth: "Bim".contains("b") ->false
        //cth: "Infan-kun".contains("fankun") ->false
        boolean tampungBoolean = "Bagus".contains("gus");
        System.out.println("hasil contains : "+tampungBoolean);

        // equals(a) a -> String
        // Mengecek apakah string yang kita cek sama dengan string a (Case Sensitif). return boolean
        // cth : "Riswan".equals("riswan") -> false

        // equalsIgnoreCase(a) a -> String
        // Mengecek apakah string yang kita cek sama dengan string a (tidak Case Sensitif). return boolean
        // cth : "Riswan".equals("riswan") -> True

        //split(a) a -> String
        // memisahkan string berdasarkan pemisah a. return String[]
        //cth : "XSIS ACADEMY JOGJA".split(" ") -> String[]{"XSIS","ACADEMY","JOGJA"}
        //cth : "a-b-c-d".split("-") -> String[]{"a","b","c","d"}
        //cth : "Riswan".split("") -> String[]{"R","i","s","w","a","n"}
        String[] tampungArr = "Xsis Academy Jogja".split(" ");
        for (int i = 0; i < tampungArr.length; i++) {
            System.out.println(tampungArr[i]);
        }
        String contoh = "Rp. 1.000.000";
        contoh = contoh.substring(4);//1.000.000
        System.out.println(contoh);
        contoh = contoh.replace(".","");//1000000
        System.out.println(contoh);
        int contohInt = Integer.parseInt(contoh);
        System.out.println("hasil : " +(contohInt+5000));

        String contoh2 = "ID12-Tas";
        String contoh3 = "ID1222-Tas ransel";

        String[] arrContoh2 = contoh2.split("-");//"ID12","Tas";
        String[] arrContoh3 = contoh2.split("-");//"ID1222","Tas ransel";
        String namaBarang = arrContoh2[1];
        System.out.println(namaBarang);

        String contoh4 = "ibrohim.huzaini@gmail.com";//"ibrohim huzaini"
        String[] arrContoh4 = contoh4.split("@");// {ibrohim.huzaini,gmail.com}
        contoh4 = arrContoh4[0];

        //jalur split
//        arrContoh4 = contoh4.split("\\.");//{ibrohim,huzaini}
//        String hasil = arrContoh4[0] + " "+arrContoh4[1];
//        System.out.println(hasil);

        //jalur Replace
        contoh4 = contoh4.replace("."," ");
        System.out.println(contoh4);
    }
}

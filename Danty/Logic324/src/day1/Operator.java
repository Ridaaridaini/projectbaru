package day1;

public class Operator {

    public static void main(String[] args) {
        //Bilangan bulat (+ - / * %)
        int a = 13 + 2 - 5 * 9 /2;
        System.out.println(a);

        int hasil1 = 3 % 2; //modulus sisa hasil bagi

        //Bilangan desimal (+ - / %)
        double b = 1.1 + 2.2; //
        System.out.println(b);
        System.out.printf("%.2f",b); //menghasilkan pembulatan hasil ke 2 angka dibelakang koma

        //Boolean (&& // !)
        boolean bolA = true || false; //true
        boolean bolB = true && false || true; //true (prosesnya yang dibaca "dan (&&)" terlebih dahulu)
        boolean bolC = !(true || false && false); //false

        System.out.println();
        System.out.println(bolA + " " + bolB); //untuk mengambil lebih dari 1

        System.out.println(); //untuk ganti baris (enter)

        //String (+)
        System.out.println("Saya " +"Dianty");


        //Tambahan
        //String + Integer
        //"Hey" + 123 = "Hey123"; (Menjadi String)

        //int / int (pembagian)
        // 5/2 = 2 (hasilnya tidak ada komanya)

        //int/double atau double /int
        // 5.0 / 2 = 2.5 (wajib mengubah salah satu menjadi koma misal ingin hasil pembagian koma)
        // 5 / 2.0 = 2.5
        // 5 / 2f = 2.5 (kalau tidak mau menggunakan koma, bisa menambahkan f dibelakang angka)

        System.out.println(5/2f);
    }
}

package day1;

public class MathFunction {

    public static void main(String[] args) {
       //perpangkatan
        System.out.println(Math.pow(2,8)); //hasilnya double (ini artinya 2 pangkat 8)
        System.out.println((int)Math.pow(2,8)); //kalau mau hasil tanpa koma

       //nilai absolut
        System.out.println(Math.abs(-15)); //15

       //pembulatan
        System.out.println(Math.round(2.5)); //3 (belakang koma >=5 dibulatkan ke atas)
        System.out.println(Math.round(2.4)); //2 (belakang koma < 5 dibulatkan ke bawah)

       //pembulatan ke atas
        System.out.println(Math.ceil(2.1)); //3.0 (hasil double)

       //pembulatan ke bawah
        System.out.println(Math.floor(2.5)); //2.0 (hasil double)

    }
}

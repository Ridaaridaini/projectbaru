package day1.latihan;

public class Soal02 {

    //Soal 02
    //Diketahui nilai a = 3 dan b = 4. Tukarlah nilai a dan b tanpa menggunakan variabel bantu!
    public static void main(String[] args) {

        int a = 3;
        int b = 4;

//        a = a + b; //a = 7
//        b = a - b;//b = 3;
//        a = a - b;// a = 4

        a = a * b; //a = 12
        b = a / b; //b = 3
        a = a / b; //a = 4

        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }
}

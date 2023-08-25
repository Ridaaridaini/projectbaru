import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alfabet = "abcdefeghijklmnopqrstufwxyz";
        String angka = "1234567890";

        String kata = input.nextLine().replace("_","");
        String katacek = kata;
        System.out.println(katacek);
        int cek = 0;
        if("abcdefeghijklmnopqrstufwxyz".contains(katacek)){
            cek = cek +1;
            System.out.println(cek);
        }
        if ("1234567890".contains(katacek)){
            cek = cek +1;
            System.out.println(cek);
        }
        if (cek ==2){
            System.out.println("valid");
        }else {
            System.out.println("tidak valid");
        }




//        else {
//            System.out.println("tidak valid");
//        }
    }
}
//&& kata.contains(angka)
//|| (kata.contains(angka) && kata.contains(alfabet))
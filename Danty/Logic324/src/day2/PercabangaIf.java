package day2;

public class PercabangaIf {

    public static void main(String[] args) {

        int a = 7;

        if (a<=5){
            System.out.print("a bilangan kecil"); //(penjelasan contoh 1) perintah ini tidak dijalankan karena tidak memenuhi kondisi a<5
        }

       else if (a>=10){
            System.out.print( "a adalah bilangan besar"); //maka output keseluruhan dari operasi ini hanya akan mencetak a bilangan kecil
        }
       else {
            System.out.print("a bilangan biasa");
        }
    }
}

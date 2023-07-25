package latihan;
import java.util.Scanner;
public class soal15 {

        public static void main(String[] args) {
            Scanner cupCake = new Scanner(System.in);


            double teriguResep = 125;
            double gulaResep = 100;
            double susuResep = 100;

            System.out.print("Masukkan jumlah cupcake yang ingin dibuat: ");
            int n = cupCake.nextInt();


            double takaranTerigu = (teriguResep / 15) * n;
            double takaranGula = (gulaResep / 15) * n;
            double takaranSusu = (susuResep / 15) * n;

            System.out.println("Takaran terigu untuk " + n + " cupcake: " + takaranTerigu + " gram");
            System.out.println("Takaran gula pasir untuk " + n + " cupcake: " + takaranGula + " gram");
            System.out.println("Takaran susu untuk " + n + " cupcake: " + takaranSusu + " mL");

            cupCake.close();
        }
}



package latihan;
import java.text.DecimalFormat;
import java.util.Scanner;
public class soal15 {

        public static void main(String[] args) {
            Scanner cupCake = new Scanner(System.in);


            double teriguResep = 125;
            double gulaResep = 100;
            double susuResep = 100;

            System.out.print("Masukkan jumlah cupcake yang ingin dibuat: ");
            int n = cupCake.nextInt();

            //decimal format
            DecimalFormat df = new DecimalFormat("##.00");

            String takaranTerigu = df.format((teriguResep / 15) * n);
            String takaranGula = df.format ((gulaResep / 15) * n);
            String takaranSusu = df.format ((susuResep / 15) * n);

            System.out.println("Takaran terigu untuk " + n + " cupcake: " + takaranTerigu + " gram");
            System.out.println("Takaran gula pasir untuk " + n + " cupcake: " + takaranGula + " gram");
            System.out.println("Takaran susu untuk " + n + " cupcake: " + takaranSusu + " mL");

            cupCake.close();



        }
}



import java.util.Scanner;

public class Soal03new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kal = scanner.nextLine().replace(" ","").replaceAll("[^a-zA-Z]", "").toLowerCase().split("");

        System.out.print("panjang penggalan kata: ");
        int n = scanner.nextInt();
        String kalimat = "";

        for (int i = 0; i < kal.length; i++) {
            if(i%n==0 && i>0){
                kalimat=kalimat  +  ",";
            }
            kalimat = kalimat+ kal[i];
            int sisaBagi = i%n;
            if(sisaBagi< n){
                continue;
            }
        }
        for (int i = kal.length-1; i > 0 ; i--) {
            if(i%n==0){
                kalimat = kalimat + ",";
            }
            kalimat = kalimat + kal[i];
        }

        System.out.print(kalimat);


    }
}

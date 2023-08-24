import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String sampah = ":,'@/&";
        System.out.print("String : ");
        String[] kalimat = input.nextLine().split("");
        String tampung = "";
        for (int i = 0; i < kalimat.length; i++) {
            if (!sampah.contains(kalimat[i])){
                tampung = tampung+kalimat[i];
            }
        }
//        System.out.println("output : "+tampung);
        String[] tampung1 = tampung.split(" ");
//        for (int i = 0; i < tampung1.length; i++) {
//            System.out.println(tampung1[i]);
//        }
        tampung = "";
        for (int i = 0; i < tampung1.length; i++) {
            if (!tampung.contains(tampung1[i])){
                tampung = tampung + tampung1[i]+" ";
            }
        }
        System.out.println("output :"+tampung);
    }
}

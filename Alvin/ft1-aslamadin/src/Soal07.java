import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {
// yakin
        Scanner scanner = new Scanner(System.in);

        System.out.print("input: ");
        String[] kata = scanner.nextLine().split("");

        String trash = ",'\"@/&";
        String kataFilter1 = "";

        for (int i = 0; i < kata.length; i++) {
            if (trash.contains(kata[i])){
                continue;
            }
            kataFilter1 += kata[i];
        }

        String[] arrKataFilter1 = kataFilter1.split(" ");
        String kataUnique = "";

        for (int i = 0; i < arrKataFilter1.length; i++) {
            if (kataUnique.contains(arrKataFilter1[i])){
                continue;
            }
            kataUnique += arrKataFilter1[i] + " ";
        }

        System.out.println(kataUnique.trim());

    }

}

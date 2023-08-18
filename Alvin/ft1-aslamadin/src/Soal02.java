import java.util.Scanner;

public class Soal02 {

    public static void main(String[] args) {
    // SELESAI FIX WKWK
        //tambah ketentuan harus mengandung angka dan huruf dan _
        String alfanumerik = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_";
        String alfabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numerik = "1234567890";
        String underscore = "_";

        boolean statusAlpha = false, statusNumerik = false, statusUnder = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("input username: ");
        String[] username = scanner.nextLine().split("");

        if (!(username.length >= 5 && username.length<=10)){
            System.out.print("invalid");
            System.exit(0);
        }

        for (int i = 0; i < username.length; i++) {
            //
            if (alfabet.contains(username[i])){
                statusAlpha = true;
            } else if (numerik.contains(username[i])) {
                statusNumerik = true;
            } else if (underscore.contains(username[i])) {
                statusUnder = true;
            }

            if (!alfanumerik.contains(username[i])){
                System.out.print("invalid");
                System.exit(0);
            }
        }

        if (!(statusNumerik && statusAlpha && statusUnder)){
            System.out.println("invalid");
            System.exit(0);
        }

        System.out.print("valid");



    }

}

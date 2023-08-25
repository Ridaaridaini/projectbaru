package ft1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String[] username = scanner.nextLine().split(" ");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String number = "1234567890";
        boolean undescore = false;
        boolean angka = false;
        boolean huruf = false;

        String bantu = "";
        for (int i = 0; i < username.length; i++) {
            String[] temp = username[i].split("");
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].contains("_")) {
                    undescore = true;
                }
                if (alphabet.contains(temp[j])) {
                    huruf = true;
                }
                if (number.contains(temp[j])) {
                    angka = true;
                }
                bantu += temp[j];
            }
        }

        if(bantu.length() > 5 && bantu.length() < 10 ){
            if (undescore && angka && huruf) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("invalid");
        }


    }
}
// if(username.length() > 5 && username.length() < 10 ){
// if(alphabet.contains(username)){
// if(number.contains(username)){
// if("-".contains(username)){
// System.out.println("Valid");
// } else {
// System.out.println("Invalid");
// }
// } else {
// System.out.println("Invalid");
// }
// }
// } else {
// System.out.println("Invalid");
// }

// int stringBenar = 0;
// for (int i = 0; i < username.length; i++) {
// if(username[i].contains(alphabet) && username[i].contains(number)){
// stringBenar ++;
// }
// }

// if(stringBenar!=0){
// System.out.println("Username valid");
// } else {
// System.out.println("username tidakvalid");
// }
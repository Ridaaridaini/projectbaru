package ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String[] kata = scanner.nextLine().split(" "); //aku ingin makan [aku, makan,]
        String[] arrayBaru = new String[kata.length];
        String[] arrayBaruLagi = new String[kata.length];
        
        for (int i = 0; i < kata.length; i++) {
            arrayBaru[i] += String.valueOf(kata[i].length()) + "_" +kata[i]; // [3_aku, 5_ingin, 5_makan]
        }

        Arrays.sort(arrayBaru); //['3_aku', '5', 5_ingin, 5_makan]
        for (int i = 0; i < arrayBaru.length; i++) {
            String[] temp = arrayBaru[i].split("_"); //['3', 'aku']
            if(temp.length!=0){
                arrayBaruLagi[i] = temp[1]; //[aku]
            }
        }
        
        for (int i = 0; i < arrayBaruLagi.length; i++) {
            if(i == 0){
                System.out.print(arrayBaruLagi[i]); //aku
            }
            if(i!=0){
                if(arrayBaruLagi[i-1].length() == arrayBaruLagi[i].length()){
                    System.out.print(", " + arrayBaruLagi[i]); //
                } else {
                    System.out.println();
                    System.out.print(arrayBaruLagi[i]); // ingin
                }
            }
        }
        
    }
}
// for (int i = 0; i < kata.length; i++) {
//     if (kata[i].length() <= 7) {
//         String[] temp = kata[i].split("");
//         for (int j = 0; j < temp.length; j++) {
//             kataBantu += temp[j];
//         }
//     }
//     kataBantu += ", ";
// }

// for (int i = 0; i < kata.length; i++) {
//     for (int j = 0; j < kata.length; j++) {
//         if(kata[j].equalsIgnoreCase(kata[i])){
//             continue;
//         }
//         if(kata[i].length() == kata[j].length()){
//             System.out.println(kata[i]);
//         }
//     }
// }
// System.out.println(kataBantu);

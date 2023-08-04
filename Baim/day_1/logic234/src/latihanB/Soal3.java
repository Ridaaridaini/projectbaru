package latihanB;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Banyaknya angka dari 'SiAngka-1' yang ingin ditampilkan: ");
        int angka = scanner.nextInt();

        
        int start = 100;
        int i = 0;

        while (i < angka) {
            int b = start;
            int result = 0;

            while (b > 10) {
                result = 0;
                while (b > 0) {
                    int digit = b % 10;
                    result += digit * digit;
                    b /= 10;
                }
                b = result;
            }

            if (result == 1) {
                System.out.println(start + " Si Angka 1");
                i++;
            }

            if (result == 10){
                System.out.println(start + " Si Angka 10");
            }

            start++;
        }
    }
}
// int i = 0;
// int[] bilanganResult = new int[angka];
// int result = 0;
// int element = 0;

// boolean cek = true;

// while(i < angka){
// String [] temp = Integer.toString(start).split("");
// for (int j = 0; j < temp.length; j++) {
// result += Integer.valueOf(temp[j]) * Integer.valueOf(temp[j]);
// if(result == 1){
// bilanganResult[j] = start;
// i++;
// } else if(){}
// }
// start++;
// }

// while (i < angka) {
// String[] temp = Integer.toString(start).split("");
// if (temp.length != 1) {
// for (int j = 0; j < temp.length; j++) {
// result += Integer.valueOf(temp[j]) * Integer.valueOf(temp[j]);
// }

// if (result == 1) {
// bilanganResult[element] = start;
// result = 0;
// element++;
// } else {
// String[] tempF = String.valueOf(result).split("");
// result = 0;
// for (int j = 0; j < tempF.length; j++) {
// result += Integer.valueOf(temp[j]) * Integer.valueOf(temp[j]);
// }
// }
// }
// i++;
// }

// System.out.println(result);
// while (i < angka) {
// int startCopy = start;
// while (startCopy > 0) {
// int digit = startCopy % 10;
// result += digit * digit;
// startCopy /= 10;
// }

// if (result == 1) {
// System.out.println(start + " Adalah si satu");
// i++;
// start++;
// result = 0;
// } else if (result >= 10) {
// result = 0;
// while (startCopy > 0) {
// int digit = startCopy % 10;
// result += digit * digit;
// startCopy /= 10;
// }
// if (result == 1) {
// System.out.println(start + " Adalah si satu");
// i++;
// start++;
// result = 0;
// } else {
// start++;
// result = 0;
// continue;
// }
// }
// }
// }
// while (i < angka) {
// int result = 0;
// int startCopy = start;

// while (startCopy > 0) {
// int digit = startCopy % 10;
// result += digit * digit;
// startCopy /= 10;
// }

// if (result == 1) {
// System.out.println(start);
// start++;
// i++;
// continue;
// } else if (result >= 10) {
// while (result > 0) {
// int digit = result % 10;
// result += digit * digit;
// if(result == 1){
// System.out.println(start);
// } else {
// result /= 10;
// }
// }

// if(result == 1){
// System.out.println(start);
// i++;
// start++;
// continue;
// } else {
// start++;
// continue;
// }
// } else {
// start++;
// continue;
// }


// int start = 100;
// int startCopy = start;
// int result = 0;
// int i = 0;
// int b = 100;

// while (i < angka) {
// while (b > 9) {
// result = 0;
// while (startCopy > 0) {
// int digit = startCopy % 10;
// result += digit * digit;
// startCopy /= 10;
// }
// if (result > 9) {
// b = result;
// startCopy = b;
// continue;
// }
// if (result < 10) {
// if (result == 1) {
// System.out.println(start);
// start++;
// b = start;
// startCopy = start;
// i++;
// break;
// } else {
// start++;
// b = start;
// startCopy = start;
// break;
// }
// }
// }
// }
// }
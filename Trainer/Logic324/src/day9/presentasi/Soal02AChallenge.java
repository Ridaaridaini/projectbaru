package day9.presentasi;

import java.util.Scanner;

public class Soal02AChallenge {

    public static void main(String[] args) {

        String tempat1="tempat1",tempat2="tempat2", tempat3="tempat3", tempat4="tempat4", toko="toko";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rute: ");
        String route = scanner.nextLine(); // Toko-Tempat1-Tempat2-Toko

        double jarak = 0;

        String[] arrRoute = route.split("-"); //["Toko", "tempat1", "tempat2", "Toko"]
        // jarak = 2 + 0.5 + 2.5 = 5km
        for (int i = 0; i < arrRoute.length; i++) { // i: 0 1 2 3 4false  berhenti

            if (arrRoute[i].equalsIgnoreCase(tempat1)){//false

                if (arrRoute[i-1].equalsIgnoreCase(tempat2)){
                    jarak = jarak +  0.5;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat3)) {
                    jarak = jarak +  2;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat4)) {
                    jarak = jarak +  4.5;
                } else if (arrRoute[i-1].equalsIgnoreCase(toko)) {// true
                    jarak = jarak +  2; // jarak = 2
                }

            }else if (arrRoute[i].equalsIgnoreCase(tempat2)){// true

                if (arrRoute[i-1].equalsIgnoreCase(tempat3)){
                    jarak = jarak +  1.5;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat4)) {
                    jarak = jarak +  4;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat1)) { //true
                    jarak = jarak +  0.5;
                } else if (arrRoute[i-1].equalsIgnoreCase(toko)) {
                    jarak = jarak +  2.5;
                }

            } else if (arrRoute[i].equalsIgnoreCase(tempat3)) { // false

                if (arrRoute[i-1].equalsIgnoreCase(toko)){
                    jarak = jarak +  4;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat1)) {
                    jarak = jarak +  2;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat2)) {
                    jarak = jarak +  1.5;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat4)) {
                    jarak = jarak +  2.5;
                }

            } else if (arrRoute[i].equalsIgnoreCase(tempat4)) { //false

                if (arrRoute[i-1].equalsIgnoreCase(toko)){
                    jarak = jarak +  6.5;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat1)) {
                    jarak = jarak +  4.5;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat2)) {
                    jarak = jarak +  4;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat3)) {
                    jarak = jarak +  2.5;
                }

            } else if (arrRoute[i].equalsIgnoreCase(toko) && i>0) { //true true

                if (arrRoute[i-1].equalsIgnoreCase(tempat1)){
                    jarak = jarak +  2;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat2) ) {
                    jarak = jarak +  2.5;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat3)) {
                    jarak = jarak +  4;
                } else if (arrRoute[i-1].equalsIgnoreCase(tempat4)) {
                    jarak = jarak +  6.5;
                }

                if (arrRoute.length > i+1){
                    System.out.println("Magerrrrr");
                    break;
                }
            }

        }


        double bensin = jarak/2.5;// 5/2.5 = 2 liter

        System.out.println(jarak + " km"); // 5km
        System.out.println(bensin + " liter"); // 2 liter

    }

}

//package BismillahFT1;
//
//import java.util.Scanner;
//
//public class MateriTambahan {
//    public static void main(String[] args) {
//        //FPB
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("masukan x: ");
////        int x = scanner.nextInt();
////
////        System.out.print("masukan y: ");
////        int y = scanner.nextInt();
////
////        int fpb=0;
////
////        for (int i = 1; i <= x && i<=y ; i++) {
////            if(x%i==0 && y%i==0){
////                fpb=i;
////            }
////        }
////        System.out.println(fpb);
////
////        //KPK Vers 2
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("masukan a: ");
////        int a = scanner.nextInt();
////
////        System.out.print("masukan b: ");
////        int b = scanner.nextInt();
////        int kpk=0;
////
////        for (int i = 1; i <=a && i<=b ; i++) {
////            if(a%i==0 && b%i==0){
////                kpk=i;
////            }
////        }
////        System.out.println(kpk);
////        int nilaikpk =(a*b)/kpk;
////        System.out.println(nilaikpk);
//
////        //Modus
////        Scanner scanner= new Scanner(System.in);
////        System.out.print("input angka : ");
////        String  angka = scanner.nextLine();
////
////        String[] arrAngka = angka.replace(" ","").split("");
////        //mencari modus
////        int maks=0, modus=0 , chek=0;
////        Arrays.sort(arrAngka);
////        for (int i = 0; i < arrAngka.length; i++) {
////            chek=1;
////            for (int j = i+1; j < arrAngka.length; j++) {
////                if(Integer.parseInt(arrAngka[i])==Integer.parseInt(arrAngka[j])){
////                    chek=chek+1;
////                }
////            }if(chek>maks){
////                maks=chek;
////                modus=Integer.parseInt(arrAngka[i]);
////            }
////
////        }
////        System.out.println("modus "+modus);
//
////        //Prima
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("masukan panjang deret: ");
////        int n = scanner.nextInt();
////
////        int[] arrPrima = new int[n];
////
////        int bil =2;
////        int i=0;
////        while (i<arrPrima.length){
////            int chek =0;
////            for (int j = 2; j <= bil; j++) {
////                if(bil%j==0){
////                    chek=chek+1;
////                }
////            }
////            if(chek==1){
////                arrPrima[i]=bil;
////                i++;
////            }
////            bil++;
////        }
//
//
//        for (int j = 0; j < arrPrima.length; j++) {
//            System.out.print(arrPrima[j] + " ");
//        }
//        //
//
//    }
//}

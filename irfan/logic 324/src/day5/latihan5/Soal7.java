package day5.latihan5;

public class Soal7 {
    public static void main(String[] args) {
        int[] arrA = {5, 4, 3, 1, 2, 7, 9, 8};
        int totalawal = 0 , totalGanjil = 0, totalGenap = 0;

        for (int i = 0; i < arrA.length; i++) {
            //logic menghitung pertambahan awal
            totalawal = arrA[i] + totalawal ;
            //logic untuk mencari nilai ganjil
            if (i % 2 != 0){
                totalGanjil = totalGanjil + arrA[i];
            }

            if (i % 2 == 0 && i > 0){
                totalGenap = totalGenap + arrA[i];
            }
        }
        System.out.print("awal: ");
        for (int i = 0; i < arrA.length; i++) {

            if (i != arrA.length-1){
                System.out.print(arrA[i] + "+");
            }else {
                System.out.print(arrA[i] + "=");
            }
        }
        System.out.print(totalawal);

        System.out.println();

        System.out.print("ganjil: ");
        for (int i = 0; i < arrA.length; i++) {

            if (i % 2 !=0){
                if (i != arrA.length-1){
                    System.out.print(arrA[i] + "+");
                }else {
                    System.out.print(arrA[i] + "=");
                }
            }

        }
        System.out.print(totalGenap);

        System.out.println();

        System.out.print("genap: ");
        for (int i = 0; i < arrA.length; i++) {

            if (i % 2 ==0 && i != 0){
                if (i != arrA.length-2){
                    System.out.print(arrA[i] + "+");
                }else {
                    System.out.print(arrA[i] + "=");
                }
            }

        }
        System.out.print(totalGenap);


    }

}




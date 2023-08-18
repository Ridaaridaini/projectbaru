import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("angka : ");
        String[] angka = input.nextLine().replace(" ","").split("");
        int[] angkaInt = new int[angka.length];
        int tanpung = 0;
        for (int i = 0; i < angkaInt.length; i++) {
            angkaInt[i] = Integer.parseInt(angka[i]);
        }
        for (int i = 0; i <=angkaInt.length ; i++) {
            for (int j = 0; j < i; j++) {
                if(j==0){
                    if(i==0){
                        System.out.print(angkaInt[j]+" ");
                        tanpung = angkaInt[j];
                    }else {
                        System.out.print(angkaInt[j]+" + ");
                        tanpung = angkaInt[j];
                    }
                }else if (j<i-1){
                    tanpung = tanpung+angkaInt[j];
                    System.out.print(angkaInt[j]+" + ");
                }else {
                    System.out.print(angkaInt[j]);
                    tanpung = tanpung+angkaInt[j];
                    if(j==i-1){
                        System.out.print(" = " +tanpung);
                    }
                }
            }
            System.out.println();
        }
    }
}

//if(i==0){
//        tanpung = angkaInt[j];
//        System.out.print(angkaInt[j]);
//        }else if (j==i-1){
//        System.out.print("= "+ (tanpung+angkaInt[j]));
//        }else {
//        System.out.print(angkaInt[j]+" ");
//        }

package latihan.logicextra;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan panjang deret: ");
        Integer n= input.nextInt();
        input.nextLine();
        Integer[] deretKel3= new Integer[n];
        Integer[] deretKel=new Integer[n];
        Integer[] jumDeret= new Integer[n];
        deretKel3[0]=2;
        deretKel[0]=-2;
        for (int i = 1; i <n ; i++) {
            deretKel3[i]=deretKel3[i-1]+2;
        }
        for (int i = 1; i < n; i++) {
            deretKel[i]=deretKel[i-1]-2;
        }
        for (int i = 0; i < n; i++) {
            if (i==(n-1)){
                jumDeret[i] = deretKel3[i] + deretKel[i];
                System.out.print(jumDeret[i]);
                break;
            }else
                jumDeret[i] = deretKel3[i] + deretKel[i];
                System.out.print(jumDeret[i]+", ");
        }

    }
}

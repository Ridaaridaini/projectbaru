package latihanC;

import java.util.Arrays;
import java.util.Scanner;

public class SampleSupernova {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int jumlahTotal = 0;
        int median, median2, indexMedian;

        System.out.print("input: ");
        String[] input = scanner.nextLine().split(" ");
        int[] arrInput = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arrInput[i] = Integer.parseInt(input[i]);
            jumlahTotal += arrInput[i];
        }

        Arrays.sort(arrInput);

        //mean
        double mean =(float) jumlahTotal/input.length;
        System.out.println("mean: " + (int)mean);

        //median
        if (input.length%2!=0){
            indexMedian =  (input.length+1)/2;
            median = arrInput[indexMedian-1];
            System.out.println("median: " + median);
        }
        if (input.length%2==0){
            indexMedian = ((input.length/2) + ((input.length/2)+1))/2;
            median = arrInput[indexMedian-1];
            median2 = arrInput[indexMedian];
            System.out.println("median: " + median + " dan " + median2);
        }

        //modus
        int[] count = new int[input.length];

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < input.length; j++) {

                if ()

            }
        }


    }

}

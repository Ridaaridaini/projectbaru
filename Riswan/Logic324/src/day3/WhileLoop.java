package day3;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;//langkah 1
        while (i <=10){ //langkah 2

            System.out.println(" cetak angka : " + i );//langkah 3

            i = i+2;//langkah 4
        }
        i=0;
        //do while
        do{
            System.out.println("angka : 1" + i);
            i++;
        }while(i<5);
    }
}

package day3;

public class WhileLoop {

    public static void main(String[] args) {

        //While Loop
        int i = 0; //i =0
        while(i < 0 /*kondisi apakah looping akan dilanjutkan*/){
            //Body
            System.out.print(i);
            i++;
        }

        i = 0; //tidak error karena masih 1 scope
        System.out.println();

        //i =0
        //Do While Loop
        do{
            System.out.println(i);
            i++;
        } while(i<0);

        //cetak : 0






    }

}

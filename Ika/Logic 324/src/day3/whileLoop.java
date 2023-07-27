package day3;

public class whileLoop {
    public static void main(String[] args) {

        // while loop
        int i = 0;
        while (i<5 /*kondisi apakah looping akan dilanjutkan*/ ){
            System.out.println("Hello ke-"+ i);
            i++;
        }

        i=0; // i masih bisa diakses karena masih di dalam satu scope
        System.out.println(i);

        //Do While loop
        //

        do{
            System.out.println(i);
            i++;
        }while (i<5);

    }

}

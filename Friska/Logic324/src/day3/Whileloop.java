package day3;

public class Whileloop {
    public static void main(String[] args) {
        int i =0;
        while (i < 5) {

            System.out.println("Hello");
            i++;
        }
        i =0 ;//tidak error karena masih 1 scope
        System.out.println();

        //do while loop
        do{
            System.out.println(i);
            i++;

        } while(i<5);
    }
}

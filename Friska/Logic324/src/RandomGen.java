import java.util.Random;

public class RandomGen {
    public static void main(String[] args) {
        //Instansiasi
        Random randomGenerator = new Random();

        //Gnerate Angka integer random
        int intA = randomGenerator.nextInt();
        System.out.println(intA);

        //Generate Angka Integer 0-9
        int intB = randomGenerator.nextInt( 10);
        System.out.println(intB);

        //Generate Angka integer 1-100
        int intC = randomGenerator.nextInt(101);
        intC = intC + 1;
        System.out.println(intC);

    }
}

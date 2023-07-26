package day1;

public class CastingParsing {

    public static void main(String[] args) {

        //CASTING

        double a = 12.5;
        int b = (int) a; //variabel a di casting menjadi integer

        long c = b; //ini bisa langsung tanpa dicasting karena masih sama2 tipe data bilangan bulat, selain itu  juga karena long memiliki kapasitas lebih dari integer

        //PARSING
        String strA = "120";
        String strB = "100";

        //String -> integer
        int intA = Integer.parseInt(strA); //merubah string jadi integer
        int intB = Integer.parseInt(strB); //sama

        //String -> long
        long longA = Long.parseLong(strA); //berlaku untuk semua tipe data, misal float, dounle, dll. Tinggal ganti nama

        System.out.println(intA+intB);

        //int -> String
        String strAB = intA + "";
        String strBA = String.valueOf(intA);

        System.out.println(strAB);
        System.out.println(strBA);

    }
}

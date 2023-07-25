package day1;

public class Komparasi {
    public static void main(String[] args) {
        /*komparasi equals(==), not equals(!=), lebih dari (>), kurang dari (<), lebih dari sama dengan (>=), kurang dari samadengan(<=)
        * Hasil selalu Boolean
        * */
        //equals(==)
        System.out.println(3==2);
        System.out.println((5== 10/2));

        // notEquals
        System.out.println(3 !=2); //true
        System.out.println(5 != 10/2);//false
        System.out.println(5<3); // false

        // lebih dari (>)
        System.out.println(3>2); //True

        // kurang dari (<)
        System.out.println(3<2); //false

        //lebih dari sama dengan (>=)
        System.out.println(3>=3); // true

        //kurang dari sama dengan (<=)
        System.out.println(5<= 10/2);//true


    }
}

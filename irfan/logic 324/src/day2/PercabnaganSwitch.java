package day2;

public class PercabnaganSwitch {
    public static void main(String[] args) {
        int a = 3;

        switch (a-2){
            case 1:
                System.out.println("a = 1");

            case 2:
                System.out.println("a = 2");

            case 3:
                System.out.println("a = 3");
                break;

            default:
                System.out.println("a tidak terdaftar");
                break;
        }
    }
}

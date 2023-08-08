package day10;

import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();
        kalimat = kalimat.toLowerCase().replace(" ", "");
        String[] arrKal = kalimat.split("");
        int[] arrAngka = new int[arrKal.length];

        System.out.print("masukan angka: ");
        for (int i = 0; i < arrKal.length; i++) {
            arrAngka[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrKal.length; i++) {
            if (arrKal[i].equalsIgnoreCase("a")) {
                if (arrAngka[i] == 1) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("b")) {
                if (arrAngka[i] == 2) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("c")) {
                if (arrAngka[i] == 3) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("d")) {
                if (arrAngka[i] == 4) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("e")) {
                if (arrAngka[i] == 5) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("f")) {
                if (arrAngka[i] == 6) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("g")) {
                if (arrAngka[i] == 7) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("h")) {
                if (arrAngka[i] == 8) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("i")) {
                if (arrAngka[i] == 9) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("j")) {
                if (arrAngka[i] == 10) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("k")) {
                if (arrAngka[i] == 11) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("l")) {
                if (arrAngka[i] == 12) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("m")) {
                if (arrAngka[i] == 13) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("n")) {
                if (arrAngka[i] == 14) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("o")) {
                if (arrAngka[i] == 15) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("p")) {
                if (arrAngka[i] == 16) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("q")) {
                if (arrAngka[i] == 17) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("r")) {
                if (arrAngka[i] == 18) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            } else if (arrKal[i].equalsIgnoreCase("s")) {
                if (arrAngka[i] == 19) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("t")) {
                if (arrAngka[i] == 20) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("u")) {
                if (arrAngka[i] == 21) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("v")) {
                if (arrAngka[i] == 22) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("w")) {
                if (arrAngka[i] == 23) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("x")) {
                if (arrAngka[i] == 24) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("y")) {
                if (arrAngka[i] == 25) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (arrKal[i].equalsIgnoreCase("z")) {
                if (arrAngka[i] == 26) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }

            if(i==arrAngka.length-1){
                System.out.print("");
            }else {
                System.out.print(",");
            }



        }

    }


}

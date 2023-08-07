package latihanFT1;

import java.util.Scanner;

public class Soal08Challenge {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String PIN = "123456"; //Karena hanya dipakai untuk login
        int biayaAdmin = 7500;
        int saldo = 0;

        int masukkanPin = 0;




        while (masukkanPin<3) {

            System.out.print("Masukkan PIN : ");
            String pin = input.nextLine();

            masukkanPin = masukkanPin + 1;

            if (pin.equalsIgnoreCase(PIN)) {

               break;


            }
            else if (!pin.equalsIgnoreCase(PIN)) {

                    continue;

                }




            }
        System.out.println("REKENING DI BLOKIR");



        }
    }


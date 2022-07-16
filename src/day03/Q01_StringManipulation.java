package day03;

import java.util.Locale;
import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin :");
        String str1= scan.nextLine();

        System.out.println("Lutfen bir kelime girin :");
        String str2= scan.nextLine().toLowerCase();

        System.out.println("Lutfen bir kelime girin :");
        String str3= scan.nextLine().toLowerCase();

        System.out.println("Lutfen bir kelime girin :");
        String str4= scan.nextLine().toLowerCase();

        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1) +" "+ str2 +" "+ str3 +" "+ str4+".");



    }
}

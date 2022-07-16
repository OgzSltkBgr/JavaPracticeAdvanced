package recap2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ismini ve soyisimi giriniz ");
        String isim = scan.nextLine(), soyIsim = scan.nextLine(); // multiple declaration

        String fullName = isim.concat(" "+ soyIsim).toUpperCase();
        System.out.println("fullName = " + fullName);


        //System.out.println((isim+" " +soyIsim).toUpperCase()); // buda benimki


    }
}

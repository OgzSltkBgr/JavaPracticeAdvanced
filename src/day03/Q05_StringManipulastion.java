package day03;

import java.util.Scanner;

public class Q05_StringManipulastion {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("soyisminizi giriniz");
        String soyIsim = scan.nextLine();


        if (isim.length()> soyIsim.length()) {
            System.out.println("İsminiz soyisminizden uzundur");
        }else if (isim.length()== soyIsim.length()){
            System.out.println("İsminiz ve soyIsminiz esit uzunlukta");
        }else System.out.println("Soyisminiz isminizden uzundur");



    }
}

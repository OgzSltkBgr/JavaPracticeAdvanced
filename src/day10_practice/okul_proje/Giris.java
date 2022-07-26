package day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
     */
    public static void main(String[] args) {
        System.out.println("Hosgeldiniz okulumuza");

        System.out.println("isim giriniz");
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();

        System.out.println("Soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Brans giriniz");
        String brans = scan.next();

       scan.nextLine();// dummy hayalet komut

        System.out.println("Telefon numarasi giriniz");
        String tel = scan.nextLine();

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim,soyisim,
                yas,brans,tel);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("Ogretmen Listesi : " + ogretmenList);

    }
}

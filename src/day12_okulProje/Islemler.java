package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler  {

    static List<Kisi> ogrtmnList= new ArrayList<>();
    static List<Kisi> ogrncList= new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    // static yazmamizin sebebi tum methodlardan ulasmak icin.
    // gokteki ay gibi heryeden ulaşılabilsin




    public static void girisPaneli(){
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");


        String secim=scan.next().toUpperCase();

        switch (secim) {
            case "1":
                islemMenusu();
            kisiTuru="OGRENCİ";

                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();


                break;
            case"Q":

                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                girisPaneli();
                break;




        }


    }

    private static void islemMenusu() {
        System.out.println("Sectigin kisi turu :" + kisiTuru+ ", lutfen asagidaki islemleri seciniz");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("İslem tercihinizi giriniz ");
        int secilenIslem= scan.nextInt();

        switch (secilenIslem) {
            case 1 :
                ekle();
                islemMenusu();

                break;
            case 2 :
               // arama();
                islemMenusu();

                break;
            case 3 :
              //  listeleme();
                islemMenusu();

                break;
            case 4 :
              //  silme();
                islemMenusu();

                break;
            case 5 :
                girisPaneli();

                break;
            case 0 :
                //cikis();

                break;
            default:
                System.out.println("guzel bir sey gir");
                islemMenusu();
                break;



        }


    }

    private static void ekle() { // bu method hem ogrenci hem ogretmen eklemek icin tasarlandi

        System.out.println("**** "+ kisiTuru+" ekleme sayfasina hosgeldin");
        System.out.println("isim soyisim giriniz");
        String adSoyad=scan.nextLine();
        scan.nextLine();
        System.out.println("kimlik giriniz");
        String kimlikNo=scan.nextLine();

        System.out.println("yas giriniz");
        int yas=scan.nextInt();

        if (kisiTuru.equals("OGRENCİ")){

        }else{
            System.out.println("bolum gir");
            String bolum=scan.nextLine();
            scan.nextLine();
            System.out.println("sicil no gir");
            String sicilNo=scan.nextLine();

            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogrtmnList.add(ogretmen);
            System.out.println(ogrtmnList);
        }

    }


}

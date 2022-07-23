package day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArraysList {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        List<String> databaseIsimler = new ArrayList<>();
        databaseIsimler.add("ahmet");
        databaseIsimler.add("mehmet");
        databaseIsimler.add("hasan");
        databaseIsimler.add("huseyin");
        databaseIsimler.add("melisa");
        databaseIsimler.add("oguz");
        System.out.println("databaseIsimler = " + databaseIsimler);

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanmak istediginiz username i giriniz");
        String username = scan.nextLine().trim();

        boolean usernameVarmi = databaseIsimler.contains(username);

        if (usernameVarmi){
            System.out.println("Bu kullanici adi zaten alinmis");
        }else System.out.println("Bu kullanici adini kullanabilirsiniz");

        if (usernameVarmi){
            int randomSayi= new Random().nextInt(100);
            username+=randomSayi;
            System.out.println("yeni kullanici adiniz : " + username);
        }else {
            System.out.println("yeni kullanici adiniz : " + username);
        }


    }
}

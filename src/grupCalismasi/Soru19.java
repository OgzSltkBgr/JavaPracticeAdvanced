package grupCalismasi;

import java.util.Scanner;

public class Soru19 {
    public static void main(String[] args) {
        /*
        Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız
    Test Data:
    2017
​
    Beklenen Çıktı:
    false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int year = scan.nextInt();

        artikYil(year);
    }

    public static void artikYil(int year) {

    //  if (year%4!=0){
    //      System.out.println(false);
    //  }else if (year%100!=0){
    //      System.out.println(true);
    //  }else if (year%400!=0){
    //      System.out.println(false);
    //  }else {
    //      System.out.println(true);
     //   }

        if ((year%400==0)||((year%100!=0) && (year%4==0))){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

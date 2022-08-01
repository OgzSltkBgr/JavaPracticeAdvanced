package grupCalismasi;

import java.util.Scanner;

public class Soru14 {
    /*
        Girilen iki String veriyi karşılaştıran Java kodu yazınız.

    Test data:
    1. String : techproed.com
    2. String : Techproed.com
​
    Beklenen Çıktı:
    False
​
    Test data:
    1. String : techproed.com
    2. String : techproed.com
​
    Beklenen Çıktı:
    true
         */
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Lutfen ilk kelimeyi giriniz");
        String input1 = abc.nextLine();
        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String input2 = abc.nextLine();

        if(input1.equals(input2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }




}

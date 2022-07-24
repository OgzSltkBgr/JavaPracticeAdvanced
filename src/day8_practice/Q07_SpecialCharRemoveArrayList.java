package day8_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q07_SpecialCharRemoveArrayList {
    public static void main(String[] args) {
        /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.
   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı
   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
        List<String> arrayList = new ArrayList<>();
        arrayList.add("$13");
        arrayList.add("$15");
        arrayList.add("$20");

        getSum(arrayList);
        System.out.println(arrayList); //[$13, $15, $20]

        System.out.println(getSum(arrayList));
    }

    private static int getSum(List<String> arrayList) {
        int toplam = 0;
        for (String each : arrayList
        ) {
            Integer sayi = Integer.parseInt(each.replaceAll("\\$",""));
            toplam += sayi;
        }
        if(toplam >=0){
            return toplam;
        }else
            return -1;
    }
}

package recap2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Q04_NestedIfandTernary {
     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Lutfen bir rakam giriniz");

         int sayi =scan.nextInt();

         // NESTED IF COZUMU
      //  String sonuc;

      //  if (sayi>=0 && sayi<=9) {
      //      if(sayi==9){sonuc="Dokuz";}
      //      else if (sayi==8){sonuc="sekiz";}
      //      else if (sayi==7){sonuc="Yedi";}
      //      else if (sayi==6){sonuc="Altı";}
      //      else if (sayi==5){sonuc="Bes";}
      //      else if (sayi==4){sonuc="Dort";}
      //      else if (sayi==3){sonuc="Uc";}
      //      else if (sayi==2){sonuc="Iki";}
      //      else if (sayi==1){sonuc="Bir";}
      //      else sonuc="Sifir";
      //      }else sonuc="Gecersiz";

       //  System.out.println("sonuc = " + sonuc);

            // TERNARY COZUMU

         String result = sayi==9 ? "dokuz" : sayi==8 ? "Sekiz": sayi==7 ? "Yedi": sayi==6 ? "Alti" : sayi==5 ? "Bes"
                 : sayi==4 ? "Dort ": sayi==3 ? "Uc": sayi==2 ? "Iki" : sayi==1 ? "Bir" : sayi==0 ? "Sifir" :"gecersiz";
         System.out.println("result: " + result);
     }
}

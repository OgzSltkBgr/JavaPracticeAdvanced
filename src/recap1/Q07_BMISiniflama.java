package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {

		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunu gir laa cm olsun");
        double boy = scan.nextDouble()/100;

        System.out.println("kilonu gir looo ");
        double kilo = scan.nextDouble();

        double vke = kilo/ (boy*boy) ;

        if (vke<=20){
            System.out.println("vke indexiniz :" + vke + " oldukca zayifsiniz");
        }else if (vke<=25){
            System.out.println("vke indexiniz :" + vke + " normalsiniz");
        }else if (vke<=30){
            System.out.println("vke indexiniz :" + vke + " sismansin");
        }else if (vke>30){
            System.out.println( "vke indexiniz :" + vke + " öküz olmuşsun");
        }


    }


}

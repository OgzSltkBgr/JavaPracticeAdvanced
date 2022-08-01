package day11_interviewQuestions;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
//bunu kart sifre kontrol de de kullabilirinisz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sifre = "erdal.bey123";
        int girisHakki=3;




        while (true) {
            System.out.println("Sifre gir");
            String girilenSifre=scan.nextLine();

            if (sifre.equals(girilenSifre)){
                System.out.println("Sifre basarili");
                break;
            }else {
                System.out.println("Sifreyi yanlis girdiniz");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz "+girisHakki );
            }
            if (girisHakki==0){
                System.out.println("Sifreniz bloke oldu " );
                break;
            }

        }
    }
}

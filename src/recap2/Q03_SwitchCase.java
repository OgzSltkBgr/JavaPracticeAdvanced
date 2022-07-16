package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen uc basamkli bir sayi giriniz");
        int sayi = scan.nextInt();
        int birlerBasamagi = sayi%10, onlarBasamagi = (sayi/10)%10, yuzlerBasamagi = sayi/100;

        if (sayi>99 && sayi<1000){
            switch (yuzlerBasamagi) {
                case 1: System.out.print("yuz"); break;
                case 2: System.out.print("iki yuz"); break;
                case 3: System.out.print("uc yuz"); break;
                case 4: System.out.print("dort yuz"); break;
                case 5: System.out.print("bes yuz"); break;
                case 6: System.out.print("altı yuz"); break;
                case 7: System.out.print("yedi yuz"); break;
                case 8: System.out.print("sekiz yuz"); break;
                case 9: System.out.print("dokuz yuz"); break;
                case 0: System.out.print("");
            }
            switch (onlarBasamagi){
                case 1 : System.out.print(" on"); break;
                case 2 : System.out.print(" yirmi"); break;
                case 3 : System.out.print(" otuz"); break;
                case 4 : System.out.print(" kırk"); break;
                case 5 : System.out.print(" elli"); break;
                case 6 : System.out.print(" altmis"); break;
                case 7 : System.out.print(" yetmis"); break;
                case 8 : System.out.print(" seksen"); break;
                case 9 : System.out.print(" doksan"); break;
                case 0 : System.out.print(""); break;
            }
            switch (birlerBasamagi){
                case 1 : System.out.print(" bir"); break;
                case 2 : System.out.print(" iki"); break;
                case 3 : System.out.print(" uc"); break;
                case 4 : System.out.print(" dort"); break;
                case 5 : System.out.print(" bes"); break;
                case 6 : System.out.print(" altı"); break;
                case 7 : System.out.print(" yedi"); break;
                case 8 : System.out.print(" sekiz"); break;
                case 9 : System.out.print(" dokuz"); break;
            }
        } else System.out.println("Uc basamakli sayi giriniz");








    }

}

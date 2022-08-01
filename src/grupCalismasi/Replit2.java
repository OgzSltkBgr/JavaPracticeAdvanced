package grupCalismasi;

import java.util.Scanner;

public class Replit2 {
    /*
    Ask user Name, Surname and credit card numbers than convert it to special form.
    (Initials for name and surname should be uppercase)
(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
Input :
John White 1234234534561478
Output :
Name : J*** W****
CCN : **** **** **** 1478
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String name = scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String surName = scan.next();

        System.out.println("Lutfen kart numaranizi giriniz");
        String num = scan.next();

        switch (num.length()){
            case 16:
        name = name.substring(0,1).toUpperCase()+ name.substring(1).replaceAll("\\w", "*");
        surName = surName.substring(0,1).toUpperCase()+ surName.substring(1).replaceAll("\\w", "*");
        num = num.substring(0,12).replaceAll("\\d","*") + num.substring(12);

                System.out.println("Name : " + name + " " + surName);
                System.out.println("CCN : " + num.substring(0,4) + " " + num.substring(4,8)+ " " +
                        num.substring(8,12)+ " " + num.substring(12,16));
                break;
            default :
                System.out.println("Lutfen gecerli bir kart numarası giriniz");

                /*
                Ask user to type a name,

the length of name should be 3.

Then check if the name has same characters.

If the String has same characters

Print “String has duplicate characters” Else

Print “String has unique characters”

Please use ternary.

Input :

ala

OutPut:

String has duplicate characters
                 */
        }
    }

}

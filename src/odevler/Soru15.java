package odevler;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen string giriniz");
        String str = scan.nextLine();

        System.out.println("Lutfen kacinci index i gormek istediginizi giriniz");
        int input = scan.nextInt();

        str = str.substring(input,input+1);
        System.out.println(str);

     //   for (int i = input; i <=input ; i++) {
     //       System.out.println(str.charAt(input));


      //  }
    }
}

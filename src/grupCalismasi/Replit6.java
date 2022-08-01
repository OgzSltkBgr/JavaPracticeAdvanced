package grupCalismasi;

import java.util.Scanner;

public class Replit6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ad giriniz");
        String name = scan.nextLine();

        if (name.length() == 3) {
            if (name.charAt(0) == name.charAt(1) || name.charAt(1) == name.charAt(2) || name.charAt(0) == name.charAt(2)) {
                System.out.println("Your String has duplicate characters");
            } else {
                System.out.println("Your String has unique characters");
            } }else{
                System.out.println("3 karakterli string giriniz");
            }

    }
}

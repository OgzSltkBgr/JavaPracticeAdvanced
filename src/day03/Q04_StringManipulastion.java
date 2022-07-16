package day03;

import java.util.Scanner;

public class Q04_StringManipulastion {
    public static void main(String[] args) {
        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();

        char ortancaKrk = kelime.charAt((kelime.length()-1)/2);

        if (kelime.length()%2==1 && kelime.length()>=3){
            System.out.println("Ortanca karakter : " + ortancaKrk);
        }

    }
}

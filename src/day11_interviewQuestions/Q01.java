package day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bit string giriniz");
        String str = scanner.nextLine();

        String arr[] =str.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int count = 1;

        for (int i = 1; i <arr.length ; i++) {

            if (arr[i-1].equals(arr[i])) {
                count++;
            }else{
                System.out.print(arr[i-1]+ " = " + (count)+ " ");
                count=1;
            }if (i== arr.length-1){
                System.out.print(arr[i]+ " = " + (count)+ " ");
            }
        }
    }
}

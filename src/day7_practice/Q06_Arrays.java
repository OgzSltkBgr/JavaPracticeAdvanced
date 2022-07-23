package day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {
    public static void main(String[] args) {
        /*
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz. */
        farkiniBul();
    }
    private static void farkiniBul() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array uzunlugunu giriniz : ");
        int uzunluk = scan.nextInt();
        int arr[]= new int[uzunluk];

        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Arrayin " + (i+1) + ". elemanini giriniz : "); // index değil diret eleman demek için i+1 dedik
            arr[i]= scan.nextInt();// fori den gelen indexler bu satirda kullanici
            // tarafindan dongnnu bitene kadar girilen elemanlar okunur
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]- arr[0]);

        // Math classi kullnarak cozunuz
    }
}

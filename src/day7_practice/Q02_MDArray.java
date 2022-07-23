package day7_practice;

import java.util.Arrays;

public class Q02_MDArray {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String [][] arr = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam =0;

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (arr[i][j].contains("$")){
                    toplam+=Double.parseDouble(arr[i][j].replace("$",""))*3.2;
                // parantz içindeki replaceAll methodu ile dolar işaretinden kurtulduk
                // sonra elimizde string "12" var (data type : String)
                // double toplam variable ile isleme katmak icin data casting yapmak gerekir
                // bu yuzden Double.parseDouble methodunu kullandik
                //bu asamada 12 degeri data type i double oldu eklerkende 3.2 yle carpmamizi istedigi icin carptik
                }else{
                    toplam+=Double.parseDouble(arr[i][j].replaceAll("€",""))*4.2;
                }
            }
        }
        System.out.println("toplam = " + toplam);
    }
}

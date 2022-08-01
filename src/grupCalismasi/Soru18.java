package grupCalismasi;

public class Soru18 {
    public static void main(String[] args) {
        /*
        Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.
​
    Test Data:
    java is fun
​
    Beklenen Çıktı:
​
    Stringdeki sesli harf sayısı: 4
             */

        String sesliHArfler="aeiou";
        String input = ("java is not fun, but it is, OGUZ").toLowerCase();

        sesliHarfSay(input,sesliHArfler);
    }
    private static void sesliHarfSay(String input, String sesliHArfler) {

        int count = 0;
        for (int i = 0; i <input.length() ; i++) {
            if (sesliHArfler.contains(input.substring(i,i+1))){
                count++;

            }
        }
        System.out.println("Strindeki sesli harf sayisi : " + count);
    }
}

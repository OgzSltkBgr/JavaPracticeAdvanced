package recap1;

import java.util.Scanner;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
    public static void main(String[] args) {

        char finalNotu = 'D';

        String result =finalNotu=='A' ? "Gayet Basarili" : finalNotu=='B' ?
                "Basarili" : finalNotu=='C' ? "Ha gayret" : "digerleri";
        System.out.println("result = " + result);

    }


}

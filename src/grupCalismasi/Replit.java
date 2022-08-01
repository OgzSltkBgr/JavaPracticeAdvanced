package grupCalismasi;

import java.util.Scanner;

public class Replit {
    /*
    Ask user to their weight and height and type a program with calculates mass index
HINT : Body Mass Index = Weight (kg) / Square of height (m)
Then give a message to user as following:
If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 , your weight is ideal If BMI is between 25 and 30,
you re fat If BMI is more than or equal to 30, obese
EXAMPLE :
INPUT:
Weight : 71
Height : 1,72
OUTPUT :
Your BMI is : 23.99945916711736 Your weight is ideal
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double weight = scan.nextDouble();
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        double height = scan.nextDouble();
        double bmi = weight/ (height*height);

        System.out.println((bmi < 18.5 ? "Your bmi is : " + bmi + "You re weak" : (bmi >= 18.5 && bmi < 25) ?
                "Your bmi is : " + bmi + " Your weight is ideal " :
                (bmi >= 25 && bmi < 30) ? "Your bmi is : " + bmi + "your re fat " :
                        "your bmi is : " + bmi + " you re obese"));
    }
}

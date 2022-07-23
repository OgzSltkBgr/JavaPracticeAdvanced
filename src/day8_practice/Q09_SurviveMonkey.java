package day8_practice;

public class Q09_SurviveMonkey {
    public static void main(String[] args) {
        /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
        int numberOfBananas =165, survivalDays = 1;
        boolean monkeyAlive = true;

        do {
            System.out.println("Maymunlar gunde 4 muz yer");
            System.out.println("bugun " + survivalDays + ". gun maymun halen hayatta");
            numberOfBananas-=4;
            survivalDays++;
            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("bugun "+ survivalDays + ". gun muz kalmadi, maymun sizlere omur...:(");
            }
        }while(monkeyAlive);

        System.out.println("toplam yasadigi gun sayisi : " + (survivalDays-1));


    }

}

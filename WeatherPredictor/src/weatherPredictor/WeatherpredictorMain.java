package weatherPredictor;

import java.util.Scanner;

public class WeatherpredictorMain {
    public static void main(String[] args) {

        Scanner s = null;
        boolean wrongInput = true;
        while (wrongInput) {
            try {
                System.out.println("Voor welke maand wilt u de voorspelling weten? ");
                s = new Scanner(System.in);
                String inputMonth = s.nextLine();
                inputMonth = inputMonth.toUpperCase();
                MonthsAverageWeather val = MonthsAverageWeather.valueOf(inputMonth);
                wrongInput = false;

                System.out.println("De temperatuur voor de maand " + inputMonth + " is "
                        + val.getGemiddeldeTemperatuur()
                        + " en de regenval is " + val.getGemiddeldeRegenval());
            } catch (IllegalArgumentException e) {
                System.out.println("slechte invoer!");
                // e.printStackTrace();
                // e.getMessage();
                System.out.println();
            }
        }

        try {
            s.close();
        } catch (NullPointerException e) {
            System.out.println("Geef juiste input.");
        }

    }

}

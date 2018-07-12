package megaCalc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MegaCalc3000PlusMain {
    public static void main(String[] args) {

        Boolean wrongInput = true;
        while (wrongInput) {
            try {
                System.out.print("Geef het eerste getal in: ");
                Scanner a = new Scanner(System.in);
                double getalA = a.nextDouble();

                System.out.print("Geef het tweede getal in: ");
                Scanner b = new Scanner(System.in);
                double getalB = b.nextDouble();

                System.out.print("Welke bewerking? ");
                Scanner bew = new Scanner(System.in);
                String bewerking = bew.nextLine();
                bewerking = bewerking.toUpperCase();
                Bewerking val = Bewerking.valueOf(bewerking);

                if (val.equals(Bewerking.PLUS)) {
                    System.out.println(Bewerking.plus(getalA, getalB));
                } else if (val.equals(Bewerking.MIN)) {
                    System.out.println(Bewerking.min(getalA, getalB));
                } else if (val.equals(Bewerking.MAAL)) {
                    System.out.println(Bewerking.maal(getalA, getalB));
                } else if (val.equals(Bewerking.OVER)) {
                    if (getalB == 0) {
                        System.out.println("Delen door null is flauwe kul! ");
                    } else {
                        System.out.println(Bewerking.over(getalA, getalB));

                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("verkeerde input!  ");
            } catch (IllegalArgumentException e) {
                System.out.println("Ongeldige bewerking! ");
            } catch (ArithmeticException e) {
                System.out.println("Delen door null is flauwe kul! ");
            }

        }

    }


}

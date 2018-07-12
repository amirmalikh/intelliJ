package Demo;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Demo {

    public static void main(String[] args) {


        double input = 1231507.83;


        DecimalFormat f = new DecimalFormat("€#,##0.00");

        String output = f.format(input);

        System.out.println(output);

        try {
            double input2 = (double)f.parse(output);
            System.out.println(input2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}

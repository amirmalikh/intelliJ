package ImperativeStatements;

public class NumbersPyramid {
    public static void main(String[] args) {



    int min = 0;
    int max = 7;


        while (min <= max) {
            //int power = (int) Math.pow(2, i);

            // count powers up
            for (int j = 0; j <= min; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }
            // count powers down
            for (int k = min - 1; k >= 0; k--) {
                System.out.print((int) Math.pow(2, k) + " ");
            }
            System.out.println(min);
            min++;
        }

    }

}

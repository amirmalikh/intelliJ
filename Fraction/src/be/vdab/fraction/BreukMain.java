package be.vdab.fraction;

public class BreukMain extends Breuk {
    public static void main(String[] args) {

        Breuk a = new Breuk(2,5);
        Breuk b = new Breuk(4,2);
        Breuk output = new Breuk(0,0);

        output = a.plus( b);
        String outputString = output.toString();

        System.out.println(outputString);


Breuk z = new Breuk();



    }







}

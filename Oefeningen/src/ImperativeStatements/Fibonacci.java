package ImperativeStatements;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 20;
        int a = 0;
        int b = 1;
        int average;

        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i <= n; i++) {
            int som = a + b;
            System.out.println(som);
            a = b;
            b = som;

        }

    }

}

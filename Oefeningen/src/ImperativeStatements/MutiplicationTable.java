package ImperativeStatements;

public class MutiplicationTable {
    public static void main(String[] args) {
/*  Write a program that prints the multiplication table up until a given value LIMIT. For example,
usingtheLIMIT = 10,producesthefollowingtable:
*/

        int limit = 10;

        System.out.print("      ");
        for (int i = 1; i <= limit; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("-----------------------------------------------");

        for (int i = 1; i <= limit; i++) {
            System.out.format("%4d |", i);

            for(int j=1;j<=limit;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();

        }
    }
}

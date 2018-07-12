package be.vdab.fraction;

public class Breuk extends Utilities {

    int teller;
    int noemer;


    public Breuk (){
    }

    public Breuk (int teller, int noemer){
        this.teller= teller;
        this.noemer = noemer;
    }



    public Breuk plus (Breuk input){
        Breuk output = new Breuk(0,0);
        int n1 = this.getTeller()*input.getNoemer();
        int n2 = this.getNoemer()*input.getTeller();
        int n3 = this.getNoemer()*input.getNoemer();

        output.setTeller(n1+n2);
        output.setNoemer(n3);

        return output;
        }

    public Breuk min (Breuk input){
        Breuk output = new Breuk(0,0);
        int n1 = this.getTeller()*input.getNoemer();
        int n2 = this.getNoemer()*input.getTeller();
        int n3 = this.getNoemer()*input.getNoemer();

        output.setTeller(n1-n2);
        output.setNoemer(n3);

        return output;
    }

    public Breuk maal (Breuk input){
        Breuk output = new Breuk(0,0);
        int n1 = this.getTeller()*input.getTeller();
        int n2 = this.getNoemer()*input.getNoemer();

        output.setTeller(n1);
        output.setNoemer(n2);

        return output;
    }

    public Breuk deel (Breuk input){
        Breuk output = new Breuk(0,0);
        Breuk input2 = input.omkering();
        int n1 = this.getTeller()* input2.getTeller();
        int n2 = this.getNoemer()* input2.getNoemer();

        output.setTeller(n1);
        output.setNoemer(n2);

        return output;
    }

    public Breuk omkering (){
        Breuk output = new Breuk(0,0);
        int n1 = this.getNoemer();
        int n2 = this.getTeller();

        output.setTeller(n1);
        output.setNoemer(n2);

        return output;
    }

        public String toString () {
            String output = this.getTeller() + " / " + this.getNoemer();
            return output;
    }








    public void vereenvoudig (Breuk input, Breuk input2) {
        Breuk output = new Breuk(0,0);
        int n1 = input.getTeller();
        int n2 = input2.getTeller();
        int n3 = input.getNoemer();
        int n4 = input2.getNoemer();

       output.setTeller(greatestCommonFactor(n1,n2));
       output.setNoemer(greatestCommonFactor(n3,n4));


         ;



    }


    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public void setNoemer(int noemer) {
        this.noemer = noemer;
    }


}

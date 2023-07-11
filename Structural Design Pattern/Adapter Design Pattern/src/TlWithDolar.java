public class TlWithDolar implements Dolar{

    private int quantity;
    private double dolar;

    public TlWithDolar(int quantity,double dolar){
        this.quantity = quantity;
        this.dolar = dolar;
    }

    @Override
    public double getDolarValue() {
        return dolar;
    }

    @Override
    public void getDolarInfo() {

        CalculateTl calculateTl = new CalculateTl();

        double tl = calculateTl.calculateTl(quantity,this);

        System.out.println(quantity + " dolar = " + tl + " TL");
    }
}
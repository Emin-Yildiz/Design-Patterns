public class TlWithEuro implements Euro{

    private int quantity;
    private double euro;

    public TlWithEuro(int quantity,double euro){
        this.quantity = quantity;
        this.euro = euro;
    }

    @Override
    public double getEuroValue() {
        return euro;
    }

    @Override
    public void getEuroInfo() {
        EuroToDolarAdapter adapter = new EuroToDolarAdapter(this);

        CalculateTl calculateTl = new CalculateTl();

        double tl = calculateTl.calculateTl(quantity, adapter);

        System.out.println(quantity + " euro = " + tl + " TL");
    }
}
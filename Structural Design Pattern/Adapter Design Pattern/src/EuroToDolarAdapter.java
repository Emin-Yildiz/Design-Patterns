public class EuroToDolarAdapter implements Dolar{

    // 1 dolar 0.9172 euro
    private TlWithEuro tlWithEuro;
    private static double DOLAR_EURO_RATE = 0.9172;

    public EuroToDolarAdapter(TlWithEuro tlWithEuro){
        this.tlWithEuro = tlWithEuro;
    }

    @Override
    public double getDolarValue() {
        return tlWithEuro.getEuroValue()/DOLAR_EURO_RATE;
    }

    @Override
    public void getDolarInfo() {

    }
}
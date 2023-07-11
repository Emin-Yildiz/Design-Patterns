public class Main {
    public static void main(String[] args) {
        TlWithEuro tlWithEuro = new TlWithEuro(100,25);
        TlWithDolar tlWithDolar = new TlWithDolar(100, 24);

        tlWithDolar.getDolarInfo();
        tlWithEuro.getEuroInfo();
    }
}
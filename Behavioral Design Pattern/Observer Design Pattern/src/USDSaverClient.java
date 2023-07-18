public class USDSaverClient extends Client{
    public USDSaverClient(CurrencyBasedSaving currencyBasedSaving) {
        super(currencyBasedSaving);
    }

    @Override
    public void showInfo() {
        System.out.println("Dolar Endeksli Birikim");
        super.showInfo();
    }
}

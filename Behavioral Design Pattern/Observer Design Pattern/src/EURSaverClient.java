public class EURSaverClient extends Client {

    public EURSaverClient(CurrencyBasedSaving currencyBasedSaving) {
        super(currencyBasedSaving);
    }

    @Override
    public void showInfo() {
        System.out.println("Euro Endeksli Birikim");
        super.showInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        CurrencyBasedSaving currencyBasedSaving = new USDBasedSaving();

        Client usdUser1 = new Client(currencyBasedSaving);
        Client usdUser2 = new Client(currencyBasedSaving);

        usdUser2.deposit(200.0);
        usdUser1.deposit(23131.0);

        currencyBasedSaving.setExchangeRate(30);

        usdUser1.showInfo();
        usdUser2.showInfo();
    }
}
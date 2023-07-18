public class Client {

    private CurrencyBasedSaving currencyBasedSaving; // kur değişkeni burada olduğu için bu sınıfa bağımlı
    private double totalCurrencySaving; // müşterinib sahip olduğu paranın kur karşılığı
    private double totalSaving; // müşterinin sahip olduğu paranın tl karşılığı

    public void showInfo(){
        System.out.println("Toplam Birikim : "+totalSaving);
    }

    public Client(CurrencyBasedSaving currencyBasedSaving){
        this.currencyBasedSaving = currencyBasedSaving;
        currencyBasedSaving.register(this);  // nesne yaratıldığı gibi abone olma işlemi gerçekleşir.
        this.totalSaving = 0;
        this.totalCurrencySaving = 0;
    }

    public void deposit(Double amount){
        totalCurrencySaving += amount/currencyBasedSaving.getExchangeRate();
        totalSaving += totalSaving+amount;
    }

    public double getTotalSaving() {
        return totalCurrencySaving*currencyBasedSaving.getExchangeRate();
    }

    public void setTotalCurrencySaving(double totalCurrencySaving) {
        this.totalCurrencySaving = totalCurrencySaving;
        totalSaving = totalCurrencySaving*currencyBasedSaving.getExchangeRate();
    }
}

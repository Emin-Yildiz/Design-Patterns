package money;

public abstract class MoneyAccountAbstraction implements MoneyAccount{

    protected double totalAmount;
    protected boolean isActive;

    public MoneyAccountAbstraction(){
        totalAmount = 0;
        isActive = true;
    }

    @Override
    public void deposit(double amount) {
        if(isActive){
            totalAmount += amount;
        }
    }

    @Override
    public void withDraw(double amount) {
        if (isActive){
            totalAmount -= amount;
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Toplam Bakiye = " + totalAmount);
    }
}

package bank;

import money.MoneyAccountAbstraction;

public abstract class BankAbstraction {
    public MoneyAccountAbstraction account; // has-a ilişkisi
    public abstract void depositUsd(double amount);
    public abstract void depositEuro(double amount);

    public BankAbstraction(MoneyAccountAbstraction account) {
        super();
        this.account = account;
    }
}

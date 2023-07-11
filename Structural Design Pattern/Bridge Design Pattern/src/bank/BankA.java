package bank;

import money.MoneyAccountAbstraction;

public class BankA extends BankAbstraction{

    public BankA(MoneyAccountAbstraction account) {
        super(account);
    }

    @Override
    public void depositUsd(double amount) {
        account.deposit(amount);
    }

    @Override
    public void depositEuro(double amount) {
        account.deposit(amount);
    }
}

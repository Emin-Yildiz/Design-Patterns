package bank;

import money.MoneyAccountAbstraction;

public class BankB extends BankAbstraction{
    public BankB(MoneyAccountAbstraction account) {
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

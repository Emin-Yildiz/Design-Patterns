import bank.BankA;
import bank.BankAbstraction;
import bank.BankB;
import money.EuroAccont;
import money.MoneyAccountAbstraction;
import money.UsdAccont;

public class Main {
    public static void main(String[] args) {

        MoneyAccountAbstraction dolarAccount1 = new UsdAccont();
        BankAbstraction bankAUsd = new BankA(dolarAccount1);

        MoneyAccountAbstraction euroAccount1 = new EuroAccont();
        BankAbstraction bankAEuro = new BankA(euroAccount1);

        MoneyAccountAbstraction dolarAccount2 = new UsdAccont();
        BankAbstraction bankBUsd = new BankB(dolarAccount2);

        MoneyAccountAbstraction euroAccount2 = new EuroAccont();
        BankAbstraction bankBEuro = new BankB(euroAccount2);

        bankBEuro.depositEuro(50);
        bankBUsd.depositUsd(100);

        bankAUsd.depositUsd(500);
        bankAEuro.depositEuro(14213);

        bankAUsd.account.showBalance();
        bankBUsd.account.showBalance();

        bankAEuro.account.showBalance();
        bankAUsd.account.showBalance();
    }
}
/*
Bridge design pattern birbirine bağımlı olan class'ları birbirinden bağımsız hale getirir.
 */

/*
Problem:

İki farklı yapı birbirine bağımlı olduğunda, bu yapılara özellik eklemek istediğimiz zaman bir çok subclass yazmak durumda kalırız.
Bu kodun esnekliğini, genişletirilebilirliğini ve değiştirilebilinirliğini bozar.
 */

/*
Çözüm:

Bridge desing bu sorunu kalıtımı nesne bileşimine geçerek çözmeye çalışır.

Birbirine bağlı yapıları farklı hiyearşiler olarak yazdığımız zaman, bir yappıya özellik eklediğimizde diğer yapı bu değişiklikten etkilenmeyecektir.
 */

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
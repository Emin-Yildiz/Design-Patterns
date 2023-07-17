public class Dolar10Dispenser implements DispenseChain{
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 10){
            int num = cur.getAmount()/10;
            int remainder = cur.getAmount() % 20; // remainder = kalan
            System.out.println(num+" adet 10$ banknot dağıtımı");
            if(remainder !=0) {
                this.chain.dispense(new Currency(remainder));
            }
        }else{
            this.chain.dispense(cur);
        }
    }
}

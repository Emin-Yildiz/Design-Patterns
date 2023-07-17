public class Dolar30Dispenser implements DispenseChain {
    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain chain) {
        this.chain = chain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 30){
            int num = cur.getAmount()/30;
            int remainder = cur.getAmount() % 30; // remainder = kalan
            System.out.println(num+" adet 30$ banknot dağıtımı");
            if(remainder !=0) {
                this.chain.dispense(new Currency(remainder));
            }
        }else{
            this.chain.dispense(cur);
        }
    }
}

public interface DispenseChain {
    // dispense = dağıtmak
    void setNextChain(DispenseChain chain);
    void dispense(Currency cur);

}

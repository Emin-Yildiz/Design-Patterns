public class RePayment extends AbstractCommand{

    @Override
    public void execute(User user, Product product) {
        PaymentAccount account = getCorrectPaymentAccount(user, product);
        double newBalance;
        if(account instanceof USDAccount){
            newBalance = user.getUsdAccount().balance + product.getPrice();
            user.getUsdAccount().balance = newBalance;
            System.out.println(PaymentConstants.PAYMENT_INFO_FOR_USD);
        }
        else if(account instanceof EURAccount){
            newBalance = user.getEurAccount().balance + product.getPrice();
            user.getEurAccount().balance = newBalance;
            System.out.println(PaymentConstants.PAYMENT_INFO_FOR_EUR);
        }

        user.getProductList().remove(product);
    }

}

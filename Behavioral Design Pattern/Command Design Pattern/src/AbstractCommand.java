public class AbstractCommand implements Command{

    protected  PaymentAccount getCorrectPaymentAccount(User user, Product product){
        String currency = product.getCurrency();
        if(PaymentConstants.USD.equals(currency)){
            return user.getUsdAccount();
        }else if (PaymentConstants.EUR.equals(currency)){
            return user.getEurAccount();
        }else {
            return null;
        }
    }

    @Override
    public void execute(User user, Product product) {

    }
}

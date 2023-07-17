public class Main {
    public static void main(String[] args) {

        Product telephone = GeneralInstanceFactory.getTelephoneInstance(); // telefon nesnesi üretip getirdi
        User user = GeneralInstanceFactory.getUserInstance(); // user nesnesi oluşturup getirdi

        onButtonClick(new Payment(), user, telephone);
        user.showInfo();

        onButtonClick(new RePayment(), user, telephone);
        user.showInfo();
    }

    private static void onButtonClick(Command command, User user, Product product){
        command.execute(user, product);
    }}
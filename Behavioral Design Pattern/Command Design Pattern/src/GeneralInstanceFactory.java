import java.util.ArrayList;

public class GeneralInstanceFactory {
    public static Product getTelephoneInstance(){ // telefon nesnesi oluşturup geriye döner.
        return new Product("Telefon","USD",1150);
    }

    public static User getUserInstance(){ // örnek bir user nesnesi oluşturur ve geriye döner.
        USDAccount usdAccount  = new USDAccount(2000);
        EURAccount eurAccount = new EURAccount(2000);
        return new User(usdAccount, eurAccount, new ArrayList<>());
    }
}

import java.util.List;

public class User {
    private USDAccount usdAccount;
    private EURAccount eurAccount;
    private List<Product> productList;

    public User(USDAccount usdAccount, EURAccount eurAccount, List<Product> productList) {
        this.usdAccount = usdAccount;
        this.eurAccount = eurAccount;
        this.productList = productList;
    }

    public void showInfo() {
        System.out.println("Dolar Hesabı Bakiyesi : " + usdAccount.balance + PaymentConstants.USD);
        System.out.println("Euro Hesabı Bakiyesi : " + eurAccount.balance + PaymentConstants.EUR);
        if (productList.size() == 0) {
            System.out.println("Satın Aldığınız Bir Ürün Bulunmamaktadır!");
        } else {
            System.out.println("Satın Aldığınız Ürünler : ");
            for (Product product : productList) {
                System.out.println(product.getName());
            }
        }
    }

    public USDAccount getUsdAccount() {
        return usdAccount;
    }

    public void setUsdAccount(USDAccount usdAccount) {
        this.usdAccount = usdAccount;
    }

    public EURAccount getEurAccount() {
        return eurAccount;
    }

    public void setEurAccount(EURAccount eurAccount) {
        this.eurAccount = eurAccount;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}

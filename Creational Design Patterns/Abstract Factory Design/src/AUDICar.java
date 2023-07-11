public class AUDICar implements Car {

    private String age;
    private String price;

    public AUDICar(String age, String price){

        this.age = age;
        this.price = price;

    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public String getPrice() {
        return price;
    }
}
public class BMWCar implements Car {

    private String age;
    private String price;

    public BMWCar(String age, String price){

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
public class Damla implements Water{

    private String name;
    private String price;

    public Damla(String name, String price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrice() {
        return price;
    }
}

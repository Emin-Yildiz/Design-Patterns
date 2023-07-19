public class Computer implements Element{

    private int price;
    private String model;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

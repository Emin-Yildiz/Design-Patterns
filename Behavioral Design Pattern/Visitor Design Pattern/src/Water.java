public class Water implements Element{
    private int price;
    private int volume; // hacim ölçüsü

    public Water(int price, int volume) {
        this.price = price;
        this.volume = volume;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

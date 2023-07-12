import java.util.ArrayList;
import java.util.List;

public class BasicCar implements Car{

    private String brand; // marka
    private double price;

    public BasicCar(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public List<Package> getComponents() {
        return new ArrayList<Package>();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

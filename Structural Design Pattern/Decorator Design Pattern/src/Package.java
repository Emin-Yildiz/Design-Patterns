import java.util.ArrayList;
import java.util.List;

public abstract class Package implements Car {

    private String name;
    private Car car;
    private double price;
    private List<Package> components = new ArrayList<>();

    public Package(String name, Car car, double price) {
        this.name = name;
        this.car = car;
        this.price = price;
        components.add(this);
    }

    @Override
    public double calculatePrice() {
        return car.calculatePrice() + price;
    }

    @Override
    public List<Package> getComponents() {
        List<Package> currentComponentList = car.getComponents();
        currentComponentList.add(this);
        return currentComponentList;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setComponents(List<Package> components) {
        this.components = components;
    }
}

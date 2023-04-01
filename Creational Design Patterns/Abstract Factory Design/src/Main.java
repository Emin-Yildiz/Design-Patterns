
interface Car{

    String getAge();
    String getPrice();
}

interface Motor{

    String getYear();
    String getPrice();
}


interface AbstractFactory{

    Car crateCar(String age, String price);
    Motor createMotor(String year, String price);
}

class BMWCar implements Car {

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

class AUDICar implements Car {

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

class BMWMotor implements Motor{

    private String year;
    private String price;


    public BMWMotor(String year,String price){

        this.price = price;
        this.year = year;

    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public String getPrice() {
        return price;
    }
}

class AUDIMotor implements Motor{

    private String year;
    private String price;

    public AUDIMotor (String year, String price){

        this.price = price;
        this.year = year;

    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public String getPrice() {
        return price;
    }
}

class BMWFactory implements AbstractFactory{


    @Override
    public Car crateCar(String age, String price) {
        return new AUDICar(age,price);
    }

    @Override
    public Motor createMotor(String year, String price) {
        return new AUDIMotor(year,price);
    }
}

class AUDIFactory implements AbstractFactory{


    @Override
    public Car crateCar(String age, String price) {
        return new AUDICar(age,price);
    }

    @Override
    public Motor createMotor(String year, String price) {
        return new AUDIMotor(year,price);
    }
}


public class Main {
    public static void main(String[] args) {

        AbstractFactory audiFactory = new AUDIFactory();
        AbstractFactory bmwFactory = new BMWFactory();

        Car audiCar = audiFactory.crateCar("2","50000");
        Car bmwCar = bmwFactory.crateCar("6","7800");

        Motor audiMotor = audiFactory.createMotor("2008","2300");
        Motor bmwMotor = bmwFactory.createMotor("2023","20000");
    }
}
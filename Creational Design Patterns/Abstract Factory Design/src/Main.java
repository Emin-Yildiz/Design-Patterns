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
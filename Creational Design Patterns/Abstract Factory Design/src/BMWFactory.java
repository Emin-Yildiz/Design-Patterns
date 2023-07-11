public class BMWFactory implements AbstractFactory{


    @Override
    public Car crateCar(String age, String price) {
        return new BMWCar(age,price);
    }

    @Override
    public Motor createMotor(String year, String price) {
        return new BMWMotor(year,price);
    }
}
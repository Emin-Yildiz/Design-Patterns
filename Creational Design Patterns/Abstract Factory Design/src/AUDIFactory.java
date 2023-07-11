public class AUDIFactory implements AbstractFactory{


    @Override
    public Car crateCar(String age, String price) {
        return new AUDICar(age,price);
    }

    @Override
    public Motor createMotor(String year, String price) {
        return new AUDIMotor(year,price);
    }
}
public interface AbstractFactory{

    Car crateCar(String age, String price);
    Motor createMotor(String year, String price);
}
public class AUDIMotor implements Motor{

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
import java.awt.*;

interface Water{
    String getName();
    String getPrice();
}

class Erikli implements Water{

    private String name;
    private String price;

    public Erikli(String name, String price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrice() {
        return price;
    }
}

class Damla implements Water{

    private String name;
    private String price;

    public Damla(String name, String price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrice() {
        return price;
    }
}

//Factory Class
class WaterFactory{

    // Factory Method
    public static Water createWater(String company, String name, String price){

        Water water;

        if(company.equals("Erikli")){
            water = new Erikli(name, price);
        }else if (company.equals("Damla")){
            water = new Damla(name, price);
        }else{
            throw new RuntimeException(company + " markasının üretimi desteklenmemektedir.");
        }

        return water;
    }


}



public class Main {
    public static void main(String[] args) {

        Water erikli = WaterFactory.createWater("Erikli", "Erikli", "5");
        Water damla = WaterFactory.createWater("Damla", "Damla", "4");


    }
}
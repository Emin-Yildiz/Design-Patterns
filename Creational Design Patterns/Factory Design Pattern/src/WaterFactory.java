public class WaterFactory{

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
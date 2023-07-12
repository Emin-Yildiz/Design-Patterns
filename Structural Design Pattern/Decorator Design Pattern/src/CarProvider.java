public class CarProvider {

    private Car car;
    private String brand;

    public void createTesla(boolean hasSunroof, boolean hasHUD, boolean hasSeatHeat, boolean hasCruiseControl){
        brand = "TESLA";
        car = new BasicCar(brand, 685000.0);
        addExtras(hasSunroof, hasHUD, hasCruiseControl, hasSeatHeat);
        showCarInfo(brand);
    }

    public void createFord(boolean hasSunroof, boolean hasHUD, boolean hasSeatHeat, boolean hasCruiseControl){
        brand = "FORD";
        car = new BasicCar(brand, 342566.5);
        addExtras(hasSunroof, hasHUD, hasCruiseControl, hasSeatHeat);
        showCarInfo(brand);
    }

    public void createTogg(boolean hasSunroof, boolean hasHUD, boolean hasSeatHeat, boolean hasCruiseControl){
        brand = "TOGG";
        car = new BasicCar(brand, 1850340.0);
        addExtras(hasSunroof, hasHUD, hasCruiseControl, hasSeatHeat);
        showCarInfo(brand);
    }

    public void createFerrari(boolean hasSunroof, boolean hasHUD, boolean hasSeatHeat, boolean hasCruiseControl){
        brand = "FERRARI";
        car = new BasicCar(brand, 1185106.0);
        addExtras(hasSunroof, hasHUD, hasCruiseControl, hasSeatHeat);
        showCarInfo(brand);
    }

    public void createPorsche(boolean hasSunroof, boolean hasHUD, boolean hasSeatHeat, boolean hasCruiseControl){
        brand = "PORSCHE";
        car = new BasicCar(brand, 888888.0);
        addExtras(hasSunroof, hasHUD, hasCruiseControl, hasSeatHeat);
        showCarInfo(brand);
    }

    private void addExtras(boolean hasSunroof, boolean hasHUD, boolean hasSeatHeat, boolean hasCruiseControl) {
        if (hasSunroof) {
            car = new Sunroof(car, 12000.0);
        }
        if (hasHUD) {
            car = new HUD(car, 8000.0);
        }
        if (hasCruiseControl) {
            car = new CruiseControl(car, 18000.0);
        }
        if (hasSeatHeat) {
            car = new SeatHeat(car, 16000.0);
        }
    }

    public void showCarInfo(String brand) {
        System.out.println("Marka : "+brand);
        System.out.println("Bulunan Özellikler;");
        for(Package component : car.getComponents()){
            System.out.println("  -"+component);
        }
        System.out.println("Fiyat : " + car.calculatePrice());
    }
}

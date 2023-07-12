public class Book {

    private String name;
    private boolean hasTimeOut; // süre bitti mi devam mı?
    private int scheduledHoldingDay; // planlanmış süre
    private int actualHoldingDay; // gerçek süre (yani kitabın aldıktan iade edeceği güne kadar olan süre)
    public static double defaultRentingPrice = 0.65; // kiralama fiyatı

    public Book (String name, int scheduledHoldingDay, int actualHoldingDay){
        this.name = name;
        this.scheduledHoldingDay = scheduledHoldingDay;
        this.actualHoldingDay = actualHoldingDay;
    }

    public boolean hasTimeOut() {
        if(scheduledHoldingDay-actualHoldingDay<0){
            return true;
        }
        else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasTimeOut() {
        return hasTimeOut;
    }

    public void setHasTimeOut(boolean hasTimeOut) {
        this.hasTimeOut = hasTimeOut;
    }

    public int getScheduledHoldingDay() {
        return scheduledHoldingDay;
    }

    public void setScheduledHoldingDay(int scheduledHoldingDay) {
        this.scheduledHoldingDay = scheduledHoldingDay;
    }

    public int getActualHoldingDay() {
        return actualHoldingDay;
    }

    public void setActualHoldingDay(int actualHoldingDay) {
        this.actualHoldingDay = actualHoldingDay;
    }

    public static double getDefaultRentingPrice() {
        return defaultRentingPrice;
    }

    public static void setDefaultRentingPrice(double defaultRentingPrice) {
        Book.defaultRentingPrice = defaultRentingPrice;
    }
}

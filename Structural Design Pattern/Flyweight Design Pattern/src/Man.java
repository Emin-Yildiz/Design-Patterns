public class Man implements Human{

    public static int manCounter = 0;

    private int age;
    private int pulseRate; // kalp atış hızı
    private int diastolikPressure; // küçük kan basıncı
    private int sistolikPressure; // büyük kan basıncı
    private int bloodSugarLevel; // kan şekeri seviyesi

    private String name;

    public Man(String name){
        this.name = name;
        manCounter++;
    }

    @Override
    public double calcStressLevel() {
        return (age + pulseRate + diastolikPressure + sistolikPressure + bloodSugarLevel) / 6;
    }

    @Override
    public void generateRandomValue() {
        age = (int) (Math.random() *70) + 1;
        pulseRate = (int) (Math.random() * 150) + 1;
        diastolikPressure = (int) (Math.random() * 90) + 1;
        sistolikPressure = (int) (Math.random() * 160) + 1;
        bloodSugarLevel = (int) (Math.random() * 140) + 1;
    }

    @Override
    public String getName() {
        return name;
    }
}
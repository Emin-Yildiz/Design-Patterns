import java.util.Random;

public class Woman implements Human {

    public static int womanCounter = 0;
    private int age;
    private int pulseRate; // kalp atış hızı
    private int diastolikPressure; // küçük kan basıncı
    private int sistolikPressure; // büyük kan basıncı
    private int bloodSugarLevel; // kan şekeri seviyesi

    private String name;

    public Woman(String name){
        this.name = name;
        womanCounter++;
    }

    @Override
    public double calcStressLevel() {
        return (age + pulseRate + diastolikPressure + sistolikPressure + bloodSugarLevel) / 6;
    }

    @Override
    public void generateRandomValue() {
        Random random = new Random();
        age = random.nextInt(75) + 1;
        pulseRate = random.nextInt(150) + 1;//(int) (Math.random() * 150) + 1;
        diastolikPressure = random.nextInt(90) + 1;//(int) (Math.random() * 90) + 1;
        sistolikPressure = random.nextInt(160) + 1;//(int) (Math.random() * 160) + 1;
        bloodSugarLevel = random.nextInt(140) + 1;//(int) (Math.random() * 140) + 1;
    }

    @Override
    public String getName() {
        return name;
    }
}

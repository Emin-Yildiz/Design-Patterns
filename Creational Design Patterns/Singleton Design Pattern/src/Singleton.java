public class Singleton {
    private static Singleton singleton = new Singleton();

    private void Singleton(){
        System.out.println("Created singleton object");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

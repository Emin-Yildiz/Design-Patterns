public class Main {
    public static void main(String[] args) {
        CarProvider provider = new CarProvider();

        provider.createPorsche(true,false,true,true);
        System.out.println("-------");
        provider.createFerrari(false,true,true,true);
        System.out.println("-------");
        provider.createFord(true,true,true,true);
        System.out.println("-------");
        provider.createTesla(true,true,true,true);
        System.out.println("-------");
        provider.createTogg(true,true,true,true);
    }
}
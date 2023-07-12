public class Main {
    public static void main(String[] args) {
        HumanProvider.provideHuman(2,2);
        System.out.println("-----");
        System.out.println("Toplam erkek sayısı: " + Man.manCounter);
        System.out.println("Toplam kadın sayısı: " + Woman.womanCounter);
    }
}
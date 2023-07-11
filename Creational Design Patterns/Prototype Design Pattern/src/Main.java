public class Main {
    public static void main(String[] args) {

        BirdFactory birdfactory = new BirdFactory();

        Bird blueBird = birdfactory.createBlueBird();
        Bird blackBird = birdfactory.createBlackBird();
        Bird oldBlueBird = birdfactory.createOldBlueBird(10);
        Bird oldBlackBird = birdfactory.createOldBlackBird(20);

        blueBird.showAnimalInfo();
        System.out.println();
        blackBird.showAnimalInfo();
        System.out.println();
        oldBlackBird.showAnimalInfo();
        System.out.println();
        oldBlueBird.showAnimalInfo();

    }
}
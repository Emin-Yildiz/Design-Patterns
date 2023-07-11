public class BirdFactory implements Factory{

    private static Bird blueBird = new Bird("Blue",2,"parrot","Cici Kuş");
    private static Bird blackBird = new Bird("Black",2,"parrot","Cici Kuş V2");

    @Override
    public Bird createBlueBird() {
        return blueBird;
    }

    @Override
    public Bird createBlackBird() {
        return blackBird;
    }

    @Override
    public Bird createOldBlueBird(int age) {
        Bird oldBlueBird = blueBird.clone();
        oldBlueBird.setAge(age);
        return oldBlueBird;
    }

    @Override
    public Bird createOldBlackBird(int age) {
        Bird oldBlackBird = blackBird.clone();
        oldBlackBird.setAge(age);
        return oldBlackBird;
    }
}
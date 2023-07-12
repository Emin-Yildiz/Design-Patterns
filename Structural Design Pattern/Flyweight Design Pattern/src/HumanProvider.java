public class HumanProvider {

    private static Human human;

    public static void provideHuman(int numberOfWoman, int numberOfMan){

        for (int i = 0; i < numberOfWoman; i++) {
            human = HumanFactory.createHuman("Woman");
            human.generateRandomValue();
            System.out.println(human.getName() + " isimli kişinin stres seviyesi: "   +human.calcStressLevel());
        }

        for (int i = 0; i < numberOfMan; i++) {
            human = HumanFactory.createHuman("Man");
            human.generateRandomValue();
            System.out.println(human.getName() + " isimli kişinin stres seviyesi: "   +human.calcStressLevel());
        }
    }
}

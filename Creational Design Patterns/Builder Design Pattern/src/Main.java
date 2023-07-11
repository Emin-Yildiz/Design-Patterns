public class Main {
    public static void main(String[] args) {

        Human emin = HumanBuilder.startBuild(2001,"Emin","Yıldız",174,"Brown","curly").Build();

        Human emin2 = HumanBuilder.buildHumanWithJob(2001,"Emin","Yıldız",174,"Brown","curly","engineer").Build();


    }
}
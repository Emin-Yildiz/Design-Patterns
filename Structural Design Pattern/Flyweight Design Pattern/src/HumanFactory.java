import java.util.HashMap;
import java.util.Map;

public class HumanFactory {
    private static final Map<String,Human> humans = new HashMap();

    public static Human createHuman(String humanType){
        Human human = null;

        if(humans.get(humanType)==null){
            if(humanType.equals("Woman")){
                human = new Woman("Beyza");
            }
            else if(humanType.equals("Man")){
                human = new Man("Emin");
            }
            humans.put(humanType,human);
        }
        else{
            human = humans.get(humanType);
        }

        return human;
    }

}

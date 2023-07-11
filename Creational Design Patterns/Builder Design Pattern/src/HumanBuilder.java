public class HumanBuilder{

    private int birthYear;
    private String name;
    private String lastName;

    private int size;
    private String eyeColor;
    private String hairType;

    private String job;
    private int salary;
    private int experience;

    public Human Build(){

        Human human = new Human();

        human.setBirtyear(birthYear);
        human.setName(name);
        human.setLastName(lastName);
        human.setSize(size);
        human.setEyeColor(eyeColor);
        human.setHairType(hairType);
        human.setJob(job);
        human.setSalary(salary);
        human.setExperience(experience);

        return human;
    }

    public static HumanBuilder startBuild(int birtyear, String name, String lastName, int size, String eyeColor, String hairType){

        HumanBuilder humanBuilder = new HumanBuilder();

        humanBuilder.birthYear = birtyear;
        humanBuilder.name = name;
        humanBuilder.lastName = lastName;
        humanBuilder.size = size;
        humanBuilder.eyeColor = eyeColor;
        humanBuilder.hairType = hairType;

        return humanBuilder;
    }

    public static HumanBuilder buildHumanWithJob(int birtyear, String name, String lastName, int size, String eyeColor, String hairType, String job){
        HumanBuilder humanBuilder = new HumanBuilder();

        humanBuilder.birthYear = birtyear;
        humanBuilder.name = name;
        humanBuilder.lastName = lastName;
        humanBuilder.size = size;
        humanBuilder.eyeColor = eyeColor;
        humanBuilder.hairType = hairType;
        humanBuilder.job = job;

        return humanBuilder;
    }

    public HumanBuilder setSalary(int salary){
        this.salary = salary;
        return this;
    }

}
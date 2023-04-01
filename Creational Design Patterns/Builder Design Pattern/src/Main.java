
class Human{

    private int birtyear;
    private String name;
    private String lastName;

    private int size;
    private String eyeColor;
    private String hairType;

    private String job;
    private int salary;
    private int experience;


    public void setBirtyear(int birtyear){
        this.birtyear = birtyear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public void setHairType(String hairType){
        this.hairType = hairType;
    }

    public void setJob(String job){
        this.job = job;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

}

class HumanBuilder{

    private int birtyear;
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

        human.setBirtyear(birtyear);
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

        humanBuilder.birtyear = birtyear;
        humanBuilder.name = name;
        humanBuilder.lastName = lastName;
        humanBuilder.size = size;
        humanBuilder.eyeColor = eyeColor;
        humanBuilder.hairType = hairType;

        return humanBuilder;
    }

    public static HumanBuilder buildHumanWithJob(int birtyear, String name, String lastName, int size, String eyeColor, String hairType, String job){
        HumanBuilder humanBuilder = new HumanBuilder();

        humanBuilder.birtyear = birtyear;
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


public class Main {
    public static void main(String[] args) {

        Human emin = HumanBuilder.startBuild(2001,"Emin","Yıldız",174,"Brown","curly").Build();

        Human emin2 = HumanBuilder.buildHumanWithJob(2001,"Emin","Yıldız",174,"Brown","curly","engineer").Build();


    }
}
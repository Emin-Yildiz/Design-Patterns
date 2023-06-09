public class Bird implements Cloneable{

    private String featherColor;
    private int age;
    private String gender;
    private String name;


    public Bird(String featherColor, int age, String animalKinds, String name){

        this.featherColor = featherColor;
        this.age = age;
        this.gender = animalKinds;
        this.name = name;
    }

    public void showAnimalInfo(){

        System.out.println("Feather Color: " + featherColor +
                "\nAge: " + age +
                "\nAnimal Kind: " + gender +
                "\nName: " + name
        );

    }

    @Override
    public Bird clone(){

        Bird animals = null;

        try {
            animals = (Bird) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return animals;
    }

    public String getFeatherColor(){
        return featherColor;
    }

    public void setFeatherColor(String featherColor){
        this.featherColor = featherColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
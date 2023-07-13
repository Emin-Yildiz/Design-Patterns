public class NurseEmployee extends Employee{

    public NurseEmployee(String name, String departman, String position){
        super(name,departman,position);
    }

    @Override
    public void manageAnotherEmployee(String request) {
        super.manageAnotherEmployee(request);
    }
}

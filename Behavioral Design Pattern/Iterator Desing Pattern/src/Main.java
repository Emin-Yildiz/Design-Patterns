public class Main {
    public static void main(String[] args) {
        Iterator iterator;
        Nurse nurse;

        NurseArrayProvider nurseArrayProvider = new NurseArrayProvider();
        NurseListProvider nurseListProvider = new NurseListProvider();

        System.out.println("--------------List--------------");
        iterator = nurseListProvider.getIterator();
        while (iterator.hasNext()){
            nurse = (Nurse) iterator.next(); // Object return ettiği için nurse nesnesi dönüyor geriye
            System.out.println(nurse.getName());
        }
        
        System.out.println("--------------Array--------------");
        iterator = nurseArrayProvider.getIterator();
        while (iterator.hasNext()){
            nurse = (Nurse) iterator.next();
            System.out.println(nurse.getName());
        }
    }
}
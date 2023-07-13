public class ProxyEmployeeManager implements IEmployeeManager{
    /*
    işlem gerçekleştirmek istenilen nesne ile ilgili kontroller burada yapılır böylece asıl nesnedeki gereksiz yükü azaltmış oluruz.
     */

    private RealEmployeeManager realEmployeeManager;
    @Override
    public void assignEmployeeToDepartman(Employee employee) {
        if(employee.getPosition().equals("DOKTOR")){
            realEmployeeManager = new RealEmployeeManager();
            realEmployeeManager.assignEmployeeToDepartman(employee);
        }
        else {
            System.out.println("Yetkisiz işlem girişimi! Personel : "+employee.getName());
        }
    }

    @Override
    public void removeEmployeeFromDepartman(Employee employee) {
        if(employee.getPosition().equals("DOKTOR")){
            realEmployeeManager = new RealEmployeeManager();
            realEmployeeManager.removeEmployeeFromDepartman(employee);
        }
        else {
            System.out.println("Yetkisiz işlem girişimi! Personel : "+employee.getName());
        }
    }

    @Override
    public void updateEmployeeRecord(Employee employee) {
        if(employee.getDepartman().equals("İnsan Kaynakları")){
            realEmployeeManager = new RealEmployeeManager();
            realEmployeeManager.updateEmployeeRecord(employee);
        }
        else{
            System.out.println("Yetkisiz işlem girişimi! Personel : "+employee.getName());
        }
    }

    @Override
    public void showEmployeeInfo(Employee employee) {
        if(employee.getDepartman().equals("İnsan Kaynakları") && employee.getPosition().equals("Uzman")){
            realEmployeeManager = new RealEmployeeManager();
            realEmployeeManager.showEmployeeInfo(employee);
        }
        else{
            System.out.println("Yetkisiz işlem girişimi! Personel : "+employee.getName());
        }
    }

    @Override
    public void assignTaskToEmployee(Employee employee) {
        realEmployeeManager = new RealEmployeeManager();
        realEmployeeManager.assignTaskToEmployee(employee);
    }
}

public class RealEmployeeManager implements IEmployeeManager{
    @Override
    public void assignEmployeeToDepartman(Employee employee) {
        System.out.println("Projeye çalışan atama sayfası yükleniyor");
    }

    @Override
    public void removeEmployeeFromDepartman(Employee employee) {
        System.out.println("Departmanda çalışan çıkarma sayfası yükleniyor");
    }

    @Override
    public void updateEmployeeRecord(Employee employee) {
        System.out.println("Çalışan bilgilerini güncelleme sayfaası yükleniyor");
    }

    @Override
    public void showEmployeeInfo(Employee employee) {
        System.out.println("Çalışan bilgilerini gösterme sayfaası yükleniyor");
    }

    @Override
    public void assignTaskToEmployee(Employee employee) {
        System.out.println("Çalışan görev atama sayfaası yükleniyor");
    }
}

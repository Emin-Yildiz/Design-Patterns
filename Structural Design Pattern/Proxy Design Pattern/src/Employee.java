public class Employee {

    private String name;
    private String departman;
    private String position;
    private ProxyEmployeeManager proxyEmployeeManager;
    public Employee(String name, String departman, String position) {
        this.name = name;
        this.departman = departman;
        this.position = position;
    }

    public void manageAnotherEmployee(String request){ // bu metod çalışanların birbiri ile ilgili işlemleri gerçekleştirebiliyor olsun
        proxyEmployeeManager = new ProxyEmployeeManager();
        if(request.equals("Depatmana Çalışan Ata")){
            proxyEmployeeManager.assignEmployeeToDepartman(this);
        }
        if(request.equals("Depatmandan Çalışan Sil")){
            proxyEmployeeManager.removeEmployeeFromDepartman(this);
        }
        if(request.equals("Çalışan Bilgilerini Güncelle")){
            proxyEmployeeManager.updateEmployeeRecord(this);
        }
        if(request.equals("Çalışan Bilgilerini Görüntüle")){
            proxyEmployeeManager.showEmployeeInfo(this);
        }
        if(request.equals("Çalışan Görevlendir")){
            proxyEmployeeManager.assignTaskToEmployee(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

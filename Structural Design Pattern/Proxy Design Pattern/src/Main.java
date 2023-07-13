public class Main {
    public static void main(String[] args) {

        String request = "Projeye Çalışan Ata";

        Employee nurse = new NurseEmployee("Beyza YILDIZDAĞ", "KADIN DOĞUM","HEMŞİRE");
        Employee doktor = new NurseEmployee("Beyza YILDIZDAĞ", "KADIN DOĞUM","DOKTOR");
        Employee employee = new NurseEmployee("Emin Yıldız", "HASTANE","İŞÇİ");

        nurse.manageAnotherEmployee(request);
        doktor.manageAnotherEmployee(request);
        employee.manageAnotherEmployee(request);
        System.out.println("--");

        request = "Çalışan Bilgilerini Görüntüle";

        nurse.manageAnotherEmployee(request);
        doktor.manageAnotherEmployee(request);
        employee.manageAnotherEmployee(request);

    }
}
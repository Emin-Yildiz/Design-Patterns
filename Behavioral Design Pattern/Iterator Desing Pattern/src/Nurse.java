public class Nurse {
    private String name;
    private String hospital;

    public Nurse(String name, String hospital){
        this.name = name;
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}

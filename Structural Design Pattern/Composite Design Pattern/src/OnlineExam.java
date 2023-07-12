public class OnlineExam implements Exam{

    private int id;
    private String examName;
    private String examTime;

    public OnlineExam(int id, String examName, String examTime) {
        this.id = id;
        this.examName = examName;
        this.examTime = examTime;
    }

    @Override
    public void showExamInfo() {
        System.out.println(
                "Sınav id: " + id +
                        "\nSınav Adı: " + examName +
                        "\nSınav Tarihi: " + examTime
        );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }
}

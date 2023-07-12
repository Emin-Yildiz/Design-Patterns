public class Main {

    public static void main(String[] args) {
        ExamContainer onlineExam = new ExamContainer();
        ExamContainer interviewExam = new ExamContainer();

        onlineExam.addExam(new OnlineExam(0,"Mühendislik Ekonomisi","3.7.23"));
        onlineExam.addExam(new InterviewExam(0,"Yüksek Lisans Mülakat","5.9.23"));

        onlineExam.showExamInfo();


    }

}
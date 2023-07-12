import java.util.ArrayList;
import java.util.List;

/*
sınav ile ilgili işlemler tek bir sınıf üzerinden yürütülür bu sayede kullanıcı tek bir nesne üzerinden bütün işlemlerini halledebilir.
 */

public class ExamContainer implements Exam{

    private List<Exam> exams = new ArrayList<>();

    @Override
    public void showExamInfo() {
        for (Exam exam : exams){
            exam.showExamInfo();
        }
    }

    public void addExam(Exam exam){
        exams.add(exam);
    }

    public void removeExam(Exam exam){
        exams.remove(exam);
    }

}

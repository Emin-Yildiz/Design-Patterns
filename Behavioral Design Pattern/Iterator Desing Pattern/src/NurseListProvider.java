import java.util.ArrayList;
import java.util.List;

public class NurseListProvider implements Container{

    List<Nurse> nurses = getNurseList();

    private List<Nurse> getNurseList() {
        List<Nurse> nurses = new ArrayList<>();

        nurses.add(new Nurse("Beyza Yıldızdağ","Sivas Numune"));
        nurses.add(new Nurse("Enes Korkmaz","Sivas Cumhuriyet"));
        nurses.add(new Nurse("Faruk Tur","Sivas Cumhuriyet"));

        return nurses;
    }

    @Override
    public Iterator getIterator() {
        return new NurseListIterator(nurses);
    }
}

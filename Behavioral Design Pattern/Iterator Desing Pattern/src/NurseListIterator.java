import java.util.List;

public class NurseListIterator implements Iterator {

    private int listIndex;
    private List<Nurse> nurses;
    public NurseListIterator(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    @Override
    public boolean hasNext() {
        if(listIndex < nurses.size()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        if (this.hasNext()){
            return nurses.get(listIndex++);
        }else {
            return null;
        }

    }
}

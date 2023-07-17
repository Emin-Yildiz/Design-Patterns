public class NurseArrayIterator implements Iterator {
    private int arrayIndex;
    Nurse[] nurses;
    public NurseArrayIterator(Nurse[] nurses) {
        this.nurses = nurses;
    }

    @Override
    public boolean hasNext() {
        if (arrayIndex < nurses.length){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public Object next() {

        if(this.hasNext()){
            return nurses[arrayIndex++];
        }else {
            return null;
        }
    }
}


public class NurseArrayProvider implements Container{

    Nurse [] nurses = getNurseList();

    public static Nurse[] getNurseList() {
        Nurse beyza = new Nurse("Beyza Yıldızdağ","Sivas Numune");
        Nurse enes = new Nurse("Enes Korkmaz","Sivas Cumhuriyet");
        Nurse faruk = new Nurse("Faruk Tur","Sivas Cumhuriyet");

        return new Nurse[]{beyza,enes,faruk};
    }

    @Override
    public Iterator getIterator() {
        return new NurseArrayIterator(nurses);
    }
}

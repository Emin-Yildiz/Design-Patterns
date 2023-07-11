public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton doubleCheckedLockingSingleton;
    public static int counter;

    public DoubleCheckedLockingSingleton(){
        counter++;
    }

    public static DoubleCheckedLockingSingleton getInstance(){

        if (doubleCheckedLockingSingleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (doubleCheckedLockingSingleton == null) {
                    doubleCheckedLockingSingleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return doubleCheckedLockingSingleton;

    }
}

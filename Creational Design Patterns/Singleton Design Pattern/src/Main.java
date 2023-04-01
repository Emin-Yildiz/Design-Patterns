
class Singleton {

    private static Singleton singleton = new Singleton();

    private void Singleton(){
        System.out.println("Created singleton object");
    }

    public static Singleton getInstance(){
        return singleton;
    }
}

class LazySingleton{

    public static LazySingleton lazySingleton;

    private void LazySingleton(){

    }

    public static LazySingleton getInstance(){

        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}

class DoubleCheckedLockingSingleton{

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


class ThreadLazySingleton{

    private static ThreadLazySingleton threadLazySingleton;
    public static int counter;

    private ThreadLazySingleton(){
        counter++;
    }

    public static ThreadLazySingleton getInstance(){

        if(threadLazySingleton == null){
            threadLazySingleton = new ThreadLazySingleton();
        }
        return threadLazySingleton;
    }

}

public class Main extends Thread{
    public static void main(String[] args) {

        DoubleCheckedLockingSingleton singleton;
        ThreadLazySingleton lazysingleton;

        for (int i = 0; i < 1000; i++) {
            new Main().start();
        }

        System.out.println("Total number of DoubleCheckedLockingSingleton objects: " + DoubleCheckedLockingSingleton.counter);
        System.out.println("Total number of ThreadLazySingleton objects: " + ThreadLazySingleton.counter);
    }

    @Override
    public void run(){

        DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
        ThreadLazySingleton lazysingleton = ThreadLazySingleton.getInstance();

    }
}


//public class Main {
//
//    public static void main(String[] args) {
//
//
//        LazySingleton lazysingleton1 = LazySingleton.getInstance();
//        LazySingleton lazysingleton2 = LazySingleton.getInstance();
//
//        if(lazysingleton1==lazysingleton2){
//            System.out.println("This objects is equals");
//        }
//        else{
//            System.out.println("This objects is not equals");
//        }
//
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//
//        if(singleton1 == singleton2){
//            System.out.println("This objects is equals");
//        }else {
//            System.out.println("This object is not equals");
//        }
//    }
//}
/*
Problem:

Nesne oluştururken bir nesne oluşturup o nesneyi heryerden erişmek hem bellek avantajı sağlar hemde güvenlik açıklarını engeller.

BU yöntem genellikle veritabanı gibi tek bir nesne oluşturup erişim sağlamanın yeterli olduğu yerlerde kullanılır.

*/

/*
Çözüm:

Constructor metod private hale getirilir bu sayede dışarıdan yeni bir nesne oluşturulmaz.
Class içine bir nesne oluşturulur ve bu nesneye ihtiyacı olan herkes erişebilir şekilde yapılandırılır.
*/


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
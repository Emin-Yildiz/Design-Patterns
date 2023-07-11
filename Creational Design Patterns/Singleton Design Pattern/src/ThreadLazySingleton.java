public class ThreadLazySingleton {
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

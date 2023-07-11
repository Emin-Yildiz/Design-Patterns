public class LazySingleton{

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
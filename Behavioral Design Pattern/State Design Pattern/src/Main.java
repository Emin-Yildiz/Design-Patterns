public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        TvOffAction tvOffAction = new TvOffAction();
        TvOnAction tvOnAction = new TvOnAction();

        tv.setState(tvOnAction);
        tv.doAction();

        tv.setState(tvOffAction);
        tv.doAction();
    }
}
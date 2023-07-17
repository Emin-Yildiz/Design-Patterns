public abstract class User {
    protected Chat chat;
    protected String name;

    public User(Chat chat, String name){
        this.chat = chat;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}

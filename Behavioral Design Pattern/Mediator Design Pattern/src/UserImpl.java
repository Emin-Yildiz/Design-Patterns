public class UserImpl extends User{
    public UserImpl(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " Sending Message: " + msg);
        chat.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " Receive Message: " + msg);
    }
}

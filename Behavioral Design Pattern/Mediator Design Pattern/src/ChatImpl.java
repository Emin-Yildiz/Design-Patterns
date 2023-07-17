import java.util.ArrayList;
import java.util.List;

public class ChatImpl implements Chat{ // kullanıcılar arasındaki iletişimi sağlıyacaktır.

    List<User> users;

    public ChatImpl(){
        this.users = new ArrayList<>();
    }
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User userr: this.users){
            if (userr != user){  // kullanıcı kendi dışındaki herkese mesaj gönderir.
                userr.receive(msg);
            }
        }
    }
}

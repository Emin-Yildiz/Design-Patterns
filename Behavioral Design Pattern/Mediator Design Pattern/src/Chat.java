public interface Chat {
    void addUser(User user);
    void sendMessage(String msg, User user);
}

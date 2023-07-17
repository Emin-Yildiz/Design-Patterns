public class Main {
    public static void main(String[] args) {
        Chat chat = new ChatImpl();

        User emin = new UserImpl(chat,"emin");
        User beyza = new UserImpl(chat,"Beyza");
        User zeynep = new UserImpl(chat,"Zeynep");
        User zekiye = new UserImpl(chat,"Zekiye");

        chat.addUser(emin);
        chat.addUser(beyza);
        chat.addUser(zekiye);
        chat.addUser(zeynep);

        emin.send("beyzaa");
    }
}
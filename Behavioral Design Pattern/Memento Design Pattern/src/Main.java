public class Main {
    public static void main(String[] args) {
        Text text = new Text(1,"selam","orjinal nesne");
        System.out.println(text);

        TextMemento memento = text.createMemento(); // nesne geçmişe dönük kopyalandı.

        text.setDescription("çakma nesne");
        System.out.println(text);

        text.restore(memento); // nesne eski haline geri getirildi.
        System.out.println(text);
    }
}
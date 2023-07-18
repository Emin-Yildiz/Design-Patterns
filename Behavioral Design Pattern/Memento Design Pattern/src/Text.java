public class Text {
    private int id;
    private String text;
    private String description;

    public Text(int id, String text,String description){
        super();
        this.id = id;
        this.text = text;
        this.description = description;
    }

    public TextMemento createMemento(){  // nesnenin kopasını oluşturup saklmaak için kullanılan metod
        TextMemento memento = new TextMemento(id,text,description);
        return memento;
    }

    public void restore(TextMemento memento){ // nesneyi eski haline dönderebilmek için kullanılan metod
        this.text = memento.getText();
        this.id = memento.getId();
        this.description = memento.getDescription();
    }

    @Override
    public String toString() {
        return "Text [id = " + id + ", text = " +text + ", description = " + description + "]";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

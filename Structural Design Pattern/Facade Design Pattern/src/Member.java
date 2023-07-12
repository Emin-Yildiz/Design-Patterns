import java.util.ArrayList;

public class Member {

    private int id;
    private String name;
    private double debt;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void rentBook(Book book){
        books.add(book);
    }
    public void returnBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}

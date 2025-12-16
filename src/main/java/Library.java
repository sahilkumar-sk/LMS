package src.main.java;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, User> users = new HashMap<>();
    private Map<String, Book> books = new HashMap<>();
    
    public void addUser(User user){
        users.put(user.getUserId(), user);
    }

    public void addBook(Book book){
        books.put(book.getIsbn(), book);
    }

    public void borrowBook(String userId, String isbn){
        User user = users.get(userId);
        Book book = books.get(isbn);

        if(user==null || book==null){
            System.out.println("Invalid user ID or book ISBN.");
            return;
        }

        user.borrowBook(book);
    }
    public void returnBook(String userId, String isbn){
        User user = users.get(userId);
        Book book = books.get(isbn);

        if(user==null || book==null){
            System.out.println("Invalid user ID or book ISBN.");
            return;
        }

        user.returnBook(book);
    }
}

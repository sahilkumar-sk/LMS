import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, User> users = new HashMap<>();
    private Map<String, Borrowable> items = new HashMap<>();
    
    public void addUser(User user){
        users.put(user.getUserId(), user);
    }

    public void addBook(Book book){
        items.put(book.getIsbn(), book);
    }

    public void borrowItem(String userId, String isbn){
        User user = users.get(userId);
        Borrowable item = items.get(isbn);

        if(user==null || item==null){
            System.out.println("Invalid user ID or item ISBN.");
            return;
        }

        user.borrowItem(item, isbn);
    }
    public void returnItem(String userId, String isbn){
        User user = users.get(userId);
        Borrowable item = items.get(isbn);

        if(user==null || item==null){
            System.out.println("Invalid user ID or item ISBN.");
            return;
        }

        user.returnItem(item, isbn);
    }
}

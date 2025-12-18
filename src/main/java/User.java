import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String name;
    private String userId;
    private List<String> borrowedIsbns = new ArrayList<>();

    public User(String name, String userId){
        this.name = name;
        this.userId = userId;
    }

    public String getName(){
        return name;
    }

    public String getUserId(){
        return userId;
    }

    public int getBorrowedCount(){
        return borrowedIsbns.size();
    }
    public abstract int getBorrowLimit();

    public boolean hasBorrowed(String isbn){
        return borrowedIsbns.contains(isbn);
    }

    public boolean borrowItem(Borrowable item, String isbn){
        if (item == null || isbn == null) {
            System.out.println("Invalid item.");
            return false;
        }
        
        if (getBorrowedCount() >= getBorrowLimit()) {
        System.out.println(getName() + " has reached borrow limit (" + getBorrowLimit() + " items).");
        return false;
        }

        if (!item.borrowItem()){
            System.out.println("No copies available for borrowing.");
            return false;
        }

        borrowedIsbns.add(isbn);
        System.out.println(getName() + " borrowed " + item.getDisplayName());
        return true;
    }

    public boolean returnItem(Borrowable item, String isbn){
        if (item == null || isbn == null) {
            System.out.println("Invalid item.");
            return false;
        }

        if (!borrowedIsbns.contains(isbn)) {
            System.out.println(getName() + " did NOT borrow this item.");
            return false;
        }

        item.returnItem();
        borrowedIsbns.remove(isbn);
        System.out.println(getName() + " returned " + item.getDisplayName());
        return true;
    }
}

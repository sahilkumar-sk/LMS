package src.main.java;
public class User {
    private String name;
    private String userId;
    private int booksBorrowed;

    public User(String name, String userId){
        this.name = name;
        this.userId = userId;
        this.booksBorrowed = 0;

    }
    public String getName(){
        return name;
    }
    public String getUserId(){
        return userId;
    }
    public int getBooksBorrowed(){
        return booksBorrowed;
    }
    public boolean borrowBook(Book book){
        if(book.getCopiesAvailable() <= 0){
            System.out.println("No copies available for " + book.getTitle());
            return false;
        }
        book.setCopiesAvailable(book.getCopiesAvailable()-1);

        booksBorrowed++;
        System.out.println(name + " borrowed " + book.getTitle());
        return true;
    }

    public boolean returnBook(Book book){
        if (getBooksBorrowed() <= 0){
            System.out.println(getName() + " has no books to return.");
            return false;
        }
        book.setCopiesAvailable(book.getCopiesAvailable() + 1 );
        booksBorrowed--;
        System.out.println(getName() + " returned " + book.getTitle());
        return true;
    }
}


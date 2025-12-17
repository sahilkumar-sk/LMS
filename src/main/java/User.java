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
        return true;
    }

    public boolean returnBook(Book book){
        if (getBooksBorrowed() <= 0){
            return false;
        }
        book.setCopiesAvailable(book.getCopiesAvailable() + 1 );
        booksBorrowed--;
        return true;
    }
}


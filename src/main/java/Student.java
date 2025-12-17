public class Student extends User {
    private static final int DEFAULT_MAX_BOOKS = 2;

    public Student(String name, String userId){
        super(name, userId);
    }

    public int getMaxBooksAllowed(){
        return DEFAULT_MAX_BOOKS;
    }
    @Override
    public boolean borrowBook(Book book){
        // Students have a limit on the number of books they can borrow
        if(getBooksBorrowed() >= DEFAULT_MAX_BOOKS){
            System.out.println("Student " + getName() + " has reached borrow limit (" + DEFAULT_MAX_BOOKS + " books).");
            return false;
        }
        System.out.println("Student " + getName() + " borrowed " + book.getTitle());
        return super.borrowBook(book);
    }
    @Override
    public boolean returnBook(Book book){
        if(getBooksBorrowed() <= 0){
            System.out.println("Student " + getName() + " has no books to return.");
            return false;
        }
        super.returnBook(book);
        
        System.out.println("Student " + getName() + " returned " + book.getTitle());
        return true;
    }
}
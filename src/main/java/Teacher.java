public class Teacher extends User {

    private static final int DEFAULT_MAX_BOOKS = 10;
    private String department;

    public Teacher(String name, String userId, String department) {
        super(name, userId);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean borrowBook(Book book) {
        if (getBooksBorrowed() >= DEFAULT_MAX_BOOKS) {
            System.out.println("Teacher " + getName()
                    + " has reached borrow limit (" + DEFAULT_MAX_BOOKS + " books).");
            return false;
        }
        System.out.println("Teacher " + getName() + " borrowed " + book.getTitle());
        return super.borrowBook(book);
    }
    @Override
    public boolean returnBook(Book book){
        if (getBooksBorrowed() <= 0){
            System.out.println("Teacher " + getName() + " has no books to return.");
            return false;
        }
        boolean result = super.returnBook(book);
        if (result) {
            System.out.println("Teacher " + getName() + " returned " + book.getTitle());
        }
        return result;
    }
}

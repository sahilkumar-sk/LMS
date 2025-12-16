package src.main.java;
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
        return super.borrowBook(book);
    }
}

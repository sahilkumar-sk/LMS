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
    public boolean borrowItem(Borrowable item){
        if (getBooksBorrowed() >= DEFAULT_MAX_BOOKS) {
            System.out.println(getName() + " has reached borrow limit (" + DEFAULT_MAX_BOOKS + " items).");
            return false;
        }
        super.borrowItem(item);
        return true;
    }
    @Override
    public boolean returnItem(Borrowable item){
        if (getBooksBorrowed() <= 0){
            System.out.println(getName() + " has no books to return.");
            return false;
        }
        super.returnItem(item);
        return true;
    }
}

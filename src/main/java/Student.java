public class Student extends User {
    private static final int DEFAULT_MAX_BOOKS = 2;

    public Student(String name, String userId){
        super(name, userId);
    }

    public int getMaxBooksAllowed(){
        return DEFAULT_MAX_BOOKS;
    }
    @Override
    public boolean borrowItem(Borrowable item, String isbn){
        if(getBorrowedCount() >= DEFAULT_MAX_BOOKS){
            System.out.println(getName() +   " has reached borrow limit (" + DEFAULT_MAX_BOOKS + " items).");
            return false;
        }
        super.borrowItem(item, isbn);
        return true;
    }
    @Override
    public boolean returnItem(Borrowable item, String isbn){
        if(getBorrowedCount() <= 0){
            System.out.println(getName() + " has no items to return.");
            return false;
        }
        super.returnItem(item, isbn);
        return true;
    }
}
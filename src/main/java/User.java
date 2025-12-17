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
    public boolean borrowItem(Borrowable item){
        if (item == null) {
    System.out.println("Invalid item.");
    return false;
}
        if(!item.borrowItem()){
            System.out.println("No copies available for borrowing.");
            return false;
        }
        booksBorrowed++;
        System.out.println(getName() + " borrowed " + item.getDisplayName());
        return true;
    }

    public boolean returnItem(Borrowable item){
        if (item == null) {
    System.out.println("Invalid item.");
    return false;
}
        if (booksBorrowed <= 0){
            return false;
        }
        item.returnItem();
        booksBorrowed--;
        System.out.println( getName() + " returned " + item.getDisplayName());
        return true;
    }
}


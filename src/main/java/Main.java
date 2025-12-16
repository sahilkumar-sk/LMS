package src.main.java;
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("OOP", "Author", "111", 11);

        // User s1 = new Student("Ali", "S01", 1);
        // User t1 = new Teacher("Dr. Ahmed", "T01", "Computer Science");
        User u1 = new Student("Sahil", "U01");

        // u1.borrowBook(b1); // User version
        // s1.borrowBook(b1); // Student version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        // t1.borrowBook(b1); // Teacher version
        u1.borrowBook(b1); // User version
        u1.borrowBook(b1); // User version
        u1.borrowBook(b1); // User version
    }
}

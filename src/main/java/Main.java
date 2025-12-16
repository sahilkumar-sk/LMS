package src.main.java;
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        User student = new Student("Ali", "S1");
        User teacher = new Teacher("Ahmed", "T1", "CS");

        library.addUser(student);
        library.addUser(teacher);

        Book book = new Book("Java Basics", "Author", "111", 1);
        library.addBook(book);

        // Borrow
        library.borrowBook("S1", "111");

        // Return
        library.returnBook("S1", "111");

        // Borrow again
        library.borrowBook("T1", "111");
        library.borrowBook("S1", "111");
    }

}

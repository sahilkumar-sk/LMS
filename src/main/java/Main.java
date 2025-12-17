public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        User student = new Student("Ali", "S1");
        User teacher = new Teacher("Ahmed", "T1", "CS");

        library.addUser(student);
        library.addUser(teacher);

        Book book = new Book("Java Basics", "Author", "111", 1);
        library.addBook(book);
        library.borrowItem("S1", "111"); // Student borrows the book
        library.borrowItem("T1", "111"); // Teacher tries to borrow the same book
        library.returnItem("S1", "111"); // Student returns the book
        library.borrowItem("T1", "111"); // Teacher borrows the book
        library.returnItem("T1", "111"); // Teacher returns the book
    }
}

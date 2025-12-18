public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // Create users
        User student = new Student("Ali", "S1");
        User teacher = new Teacher("Sara", "T1", "CS");

        library.addUser(student);
        library.addUser(teacher);

        // Create books
        Book book1 = new Book("OOP in Java", "Herbert", "ISBN1", 1);
        Book book2 = new Book("Data Structures", "CLRS", "ISBN2", 2);

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("\n--- STUDENT TEST ---");
        library.borrowItem("S1", "ISBN1"); // should work
        library.borrowItem("S1", "ISBN2"); // should work
        library.borrowItem("S1", "ISBN2"); // ❌ should fail (limit reached)

        System.out.println("\n--- RETURN TEST ---");
        library.returnItem("S1", "ISBN1"); // should work
        library.returnItem("S1", "ISBN1"); // ❌ should fail (not borrowed)

        System.out.println("\n--- TEACHER TEST ---");
        library.borrowItem("T1", "ISBN2"); // should work
        library.borrowItem("T1", "ISBN2"); // should work
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        Member member1 = new Member("M001", "John");
        Member member2 = new Member("M002", "Sarah");
        Book book1 = new Book("ISBN001", "Java Basics", "James");
        Book book2 = new Book("ISBN002", "OOP Concepts", "Smith");
        Book book3 = new Book("ISBN003", "Database Systems", "Brown");

        library.registerMember(member1);
        library.registerMember(member2);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("=== BEFORE OPERATIONS ===");
        System.out.println(library);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        library.lendBook(book1, member1, "2026-06-13", "2026-06-20");
        library.lendBook(book1, member2, "2026-06-13", "2026-06-20");
        library.lendBook(book2, member2, "2026-06-13", "2026-06-20");
        library.returnBook(book1, member1);
        System.out.println("\n=== AFTER OPERATIONS ===");
        System.out.println(library);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(member1);
        System.out.println(member2);
    }
    
}

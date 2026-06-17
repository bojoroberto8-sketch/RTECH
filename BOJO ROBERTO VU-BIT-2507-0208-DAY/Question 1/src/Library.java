import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public ArrayList<Member> getMembers() {
        return members;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if 
    (book.getTitle().equalsIgnoreCase(title))   {
                        return book;
                 }    
             }
    return null;
         }
    
    public void lendBook(Book book, Member member,
                            String borrowDate, String dueDate) {
            if (!book.isAvailable()) {
                System.out.println("Book is already on loan.");
                return;
            }          
            Loan loan = new Loan(member, book, borrowDate, dueDate);
            member.getLoans().add(loan);
            book.setAvailable(false);
            System.out.println("Book lent successfully.");          
                            }     
                            public void returnBook(Book book, Member member) {
                                Loan foundLoan = null;
                                for (Loan loan : member.getLoans()) {
                                    if (loan.getBook().equals(book)) {
                                        foundLoan = loan;
                                        break;
                                    }
                                }
                            if (foundLoan != null) {
                member.getLoans().remove(foundLoan);
                            book.setAvailable(true);
                            System.out.println("Book returned successfully");                
                            }   else {
                                System.out.println("Loan not found.");
                            }
                     }
         @Override
         public String toString() {
            return "Library [books=" + books.size() +
                     ", members=" + members.size() + "]";
         }

}


public class Loan {
    private Member member;
    private Book book;
    private String borrowDate;
    private String dueDate;

    public Loan() {
    }

    public Loan(Member member, Book book, String borrowDate, String dueDate) {
        this.member = member;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public Member getMember() {
        return member;
    }
    public Book getBook() {
        return book;
    }
    public String getBorrowDate() {
        return borrowDate;
    }
    public String getDueDate() {
        return dueDate;
    }
    public void setMember(Member member) {
        this.member = member;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    @Override
    public String toString() {
        return "Loan [member=" + member +
        ", book=" + book +
        ", borrowDate=" + borrowDate +
        ", dueDate=" + dueDate + "]";
    }
}

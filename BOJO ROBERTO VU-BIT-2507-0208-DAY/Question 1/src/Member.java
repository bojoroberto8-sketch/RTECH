import java.util.ArrayList;

public class Member {

    private String memberId;
    private String name;
    private ArrayList<Loan> loans;

    public Member() {
        loans = new ArrayList<>();
    }
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.loans = new ArrayList<>();
    }
    public String getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Loan> getLoans() {
        return loans;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }
    @Override
    public String toString() {
        return "Member [memberId=" + memberId + 
        ", name=" + name + "]";
    }
}

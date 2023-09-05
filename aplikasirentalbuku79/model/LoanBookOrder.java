package aplikasirentalbuku79.model;

import aplikasirentalbuku79.abstrackclass.CalculateBiayaPinjaman;

public class LoanBookOrder extends CalculateBiayaPinjaman {
    private String LoanID;
    private Member member;
    private BookForLoan bookForLoan;
    private int loanDuration;
    private double loanFee;

    public LoanBookOrder(String loanID, Member member, BookForLoan bookForLoan, int loanDuration, double loanFee) {
        LoanID = loanID;
        this.member = member;
        this.bookForLoan = bookForLoan;
        this.loanDuration = loanDuration;
        this.loanFee = loanFee;
        getFee();
    }

    public String getLoanID() {
        return LoanID;
    }

    public void setLoanID(String loanID) {
        LoanID = loanID;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public BookForLoan getBookForLoan() {
        return bookForLoan;
    }

    public void setBookForLoan(BookForLoan bookForLoan) {
        this.bookForLoan = bookForLoan;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public double getLoanFee() {
        return loanFee;
    }

    public void setLoanFee(double loanFee) {
        this.loanFee = loanFee;
    }

    @Override
    public void getFee() {
        setLoanFee(getBookForLoan().getBookLoanPrice()*getLoanDuration());
    }
}

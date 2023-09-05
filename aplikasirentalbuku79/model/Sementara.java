package aplikasirentalbuku79.model;



public class Sementara extends LoanBookOrder {
   public Sementara(String loanID, Member member, BookForLoan bookForLoan, int loanDuration, double loanFee) {
      super(loanID, member, bookForLoan, loanDuration, loanFee);
   }

}

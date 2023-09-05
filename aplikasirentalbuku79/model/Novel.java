package aplikasirentalbuku79.model;

import aplikasirentalbuku79.inteface.CalculateBook;

public class Novel extends BookForLoan{
    private boolean isASeries;

    public Novel(String bookID, String title, Author author, double bookPrice, double ratesStock, double rateType, double bookLoanPrice, int stock, boolean isASeries) {
        super(bookID, title, author, bookPrice, ratesStock, rateType, bookLoanPrice, stock);
        this.isASeries = isASeries;
    }
}

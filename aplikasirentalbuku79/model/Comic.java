package aplikasirentalbuku79.model;

import aplikasirentalbuku79.abstrackclass.Book;
import aplikasirentalbuku79.inteface.CalculateBook;

public class Comic extends BookForLoan{
    private String Genre;

    public Comic(String bookID, String title, Author author, double bookPrice, double ratesStock, double rateType, double bookLoanPrice, int stock, String genre) {
        super(bookID, title, author, bookPrice, ratesStock, rateType, bookLoanPrice, stock);
        Genre = genre;
    }
}

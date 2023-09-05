package aplikasirentalbuku79.model;

import aplikasirentalbuku79.abstrackclass.Book;
import aplikasirentalbuku79.inteface.CalculateBook;

public class BookForLoan extends Book implements CalculateBook{
    private double bookLoanPrice;
    private int stock;

    public BookForLoan(String bookID, String title, Author author, double bookPrice, double ratesStock, double rateType, double bookLoanPrice, int stock) {
        super(bookID, title, author, bookPrice, ratesStock, rateType);
        this.bookLoanPrice = bookLoanPrice;
        this.stock = stock;
        calculateRateStock();
        calculateRateType();
        calculateBookLoanPrice();
    }


    @Override
    public void calculateRateStock() {
        if ( getStock() < 10){
            setRatesStock(RATES_10DOWN);
        }else {
            setRatesStock(RATES_10UP);
        }
    }

    public double getBookLoanPrice() {
        return bookLoanPrice;
    }

    public void setBookLoanPrice(double bookLoanPrice) {
        this.bookLoanPrice = bookLoanPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void calculateRateType() {
        if (getAuthor() instanceof Mangaka){
            setRateType(RATES_COMIC);
        }else {
            setRateType(RATES_NOVEL);
        }
    }


    @Override
    public void calculateBookLoanPrice() {
        setBookLoanPrice((getRatesStock() + getRateType())*getBookPrice());
    }
}

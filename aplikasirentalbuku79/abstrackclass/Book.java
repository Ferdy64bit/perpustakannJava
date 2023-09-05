package aplikasirentalbuku79.abstrackclass;

import aplikasirentalbuku79.model.Author;

public abstract class Book {
    private String bookID;
    private String title;
    private Author author;
    private double bookPrice;

    private double ratesStock;
    private double rateType;

    public Book(String bookID, String title, Author author, double bookPrice, double ratesStock, double rateType) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.bookPrice = bookPrice;
        this.ratesStock = ratesStock;
        this.rateType = rateType;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public double getRatesStock() {
        return ratesStock;
    }

    public void setRatesStock(double ratesStock) {
        this.ratesStock = ratesStock;
    }

    public double getRateType() {
        return rateType;
    }

    public void setRateType(double rateType) {
        this.rateType = rateType;
    }
    public abstract void calculateRateStock();
    public abstract void calculateRateType();
    public abstract void calculateBookLoanPrice();
}

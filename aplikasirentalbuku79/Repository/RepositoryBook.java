package aplikasirentalbuku79.Repository;

import aplikasirentalbuku79.abstrackclass.Book;
import aplikasirentalbuku79.model.*;

import java.util.Arrays;
import java.util.List;

public class RepositoryBook {
    public List<Book> getAllBook(){
        Author author1 = new Author("Masashi Kisimoto");
        Author author2 = new Author("Yoshihiro Togashi");
        Author author3 = new Author("J.K Rowling");
        Author author4 = new Author("Tere Liye");
        Author author5 = new Author("Dee Lestari");

        Mangaka mangaka1 = new Mangaka(author1.fullName(), 48, "Japan");
        Mangaka mangaka2 = new Mangaka(author2.fullName(), 56, "Japan");

        Novelis novelis1 = new Novelis(author3.fullName(), 57, "England");
        Novelis novelis2 = new Novelis(author4.fullName(), 35,"Indonesia");
        Novelis novelis3 = new Novelis(author5.fullName(), 30,"Indonesia");

        Comic comic1 = new Comic("Comic - 001","Uzumaki Naruto", mangaka1,55000,0,0,0,10,"Shounen");
        Comic comic2 = new Comic("Comic - 002","The Worst Client", mangaka1, 35000, 0, 0,0,20,"Shounen");
        Comic comic3 = new Comic("Comic - 003","For the Sake of Dreams...!!",mangaka1,35000,0,0,0,15,"Shounen");
        Comic comic4 = new Comic("Comic - 004","Hunter X Hunter : The Day of Departure",mangaka2,50000,0,0,0,15,"Fantasy");
        Comic comic5 = new Comic("Comic - 005","Hunter X Hunter : A Struggle in the Mist",mangaka2,80000,0,0,0,25,"Fantasy");

        Novel novel1 = new Novel("Novel - 001","Harry Potter and the Philosopher's Stone",novelis1,150000,0,0,0,10,true);
        Novel novel2 = new Novel("Novel - 002","Harry Potter and the Chamber of Secrets",novelis1,150000,0,0,0,10,true);
        Novel novel3 = new Novel("Novel - 003","Harry Potter and the Prisoner of Azkaban",novelis1,200000,0,0,0,15,true);
        Novel novel4 = new Novel("Novel - 004","Ayah Aku Berbeda",novelis2,35000,0,0,0,15,false);
        Novel novel5 = new Novel("Novel - 005","Madre",novelis3,80000,0,0,0,10,false);


     List<Book> listAllBook = Arrays.asList(comic1,comic2,comic3,comic4,comic5,novel1,novel2,novel3,novel4,novel5);
    return listAllBook;
    }
}

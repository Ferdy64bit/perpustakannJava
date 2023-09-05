package aplikasirentalbuku79.controller;

import aplikasirentalbuku79.abstrackclass.Book;
import aplikasirentalbuku79.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;

public class SearhDataGenaral {
    public static List<Book> getAllBook(List<Book> listAllBook) {
        List<Book> bookListList = new ArrayList<Book>();
        for (Book book : listAllBook) {
//            validasi name sebagai key ketentuan
            if (book.getAuthor().fullName().equalsIgnoreCase("Masashi Kisimoto") ||
                    book.getAuthor().fullName().equalsIgnoreCase("J.K Rowling")) {
                bookListList.add(book);
            }
        }
        return bookListList;
    }


    public static List<LoanBookOrder> getAllLoanBook(List<Book> listAllBook, List<Member> memberList, String memberName, String titleBook, String cek, int durasi) {
        boolean tidakAda = false;
        List<LoanBookOrder> bookListList = new ArrayList<LoanBookOrder>();
        for (Member member : memberList) {
            for (Book book : listAllBook) {
                LoanBookOrder loanBookOrder = new LoanBookOrder(cek, member, ((BookForLoan) book), durasi, 0);
                if (((BookForLoan) book).getStock() > 0) {
                    if (member.fullName().equalsIgnoreCase(memberName) && book.getTitle().equalsIgnoreCase(titleBook)) {
                        bookListList.add(loanBookOrder);
                        book.calculateRateStock();
                        book.calculateBookLoanPrice();
                        ((BookForLoan) book).setStock(((BookForLoan) book).getStock() - 1);
                        tidakAda = true;
                    }
                }
            }
        }
        if (!tidakAda) {
            System.out.println();
            System.out.println("Buku Tidak Ada / Tidak Boleh Di Pinjamkan");
        }
        return bookListList;
    }


    public static void getAllLOrder(List<Sementara> listAllOrder, String idOrder) {
        boolean adaOrder = false;
        List<Sementara> orderList = new ArrayList<>();
        Iterator<Sementara> iterator = listAllOrder.iterator();

        while (iterator.hasNext()) {
            Sementara order = iterator.next();
            if (order.getLoanID().equalsIgnoreCase(idOrder)) {
                orderList.add(order);
                iterator.remove();
                order.getBookForLoan().setStock(order.getBookForLoan().getStock() + 1);
                adaOrder = true;
            }
        }

        if (!adaOrder) {
            System.out.println();
            System.out.println("Error Orderan Tidak Ada");
        } else {
            System.out.println();
            System.out.println("Orderan Telah di kembalikan");
        }
        System.out.println();
        System.out.println("Orderan Yang Di Return");
        System.out.println("================================");
        ServicesDataGeneral.printData(orderList.toArray(new Sementara[0]));
        System.out.println();
        System.out.println("Orderan Yang Tersisa");
        System.out.println("=================================");
        ServicesDataGeneral.printDataIdOrder(listAllOrder.toArray(new Sementara[0]));
    }
}

package aplikasirentalbuku79.model;

import aplikasirentalbuku79.abstrackclass.Book;

import java.text.DecimalFormat;
import java.util.List;

public class ServicesDataGeneral {
//    case 1

    public static void displayAuthorTable(List<Book> listData) {
        System.out.println();
        System.out.println();
        System.out.println("Daftar Buku Yang Boleh Di Pinjamkan.");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-4s | %-11s | %-50s | %-20s | %-6s |\n",
                "No.", "Book ID", "Title", "Author", "Stock");
        System.out.println("-------------------------------------------------------------");

        int num = 1;
        for (Book data : listData) {
            String bookID = data.getBookID();
            String title = data.getTitle();
            String authorName = data.getAuthor().getName();
            String stock = (data instanceof BookForLoan) ? String.valueOf(((BookForLoan) data).getStock()) : "";

            System.out.printf("| %-4s | %-10s | %-50s | %-20s | %-6s |\n",
                    num++, bookID, title, authorName, stock);
        }

        System.out.println("-------------------------------------------------------------");
    }
    public static void printDataLoanBook(List<LoanBookOrder> listData) {
        System.out.println();
        System.out.println("No\t| Loan ID | \t| Member Name |\t| Loan Duration |");
        System.out.println("---------------------------------------------");

        int num = 1;
        for (LoanBookOrder data : listData) {
            String loanId = data.getLoanID();
            String memberName = data.getMember().getMemberName();
            int loanDuration = data.getLoanDuration();

            System.out.printf("| %d\t | %s\t | %s\t | %d |\n", num++, loanId, memberName, loanDuration);
        }

        System.out.println("---------------------------------------------");
    }

    public static void printData(Sementara[] listData) {
        System.out.println();
        DecimalFormat currencyFormat = new DecimalFormat("Rp #,##0.00");

        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-2s | %-7s | %-10s | %-10s | %-45s | %-4s | %-4s | %-4s |\n",
                "No.", "Loan Id", "Member Name", "Book Id", "Title", "Loan Book Price", "Loan Duration", "Loan Fee");
        System.out.println("-------------------------------------------------------------");

        int num = 1;
        for (Sementara data : listData) {
            String loanId = data.getLoanID();
            String memberName = data.getMember().getMemberName();
            String bookId = data.getBookForLoan().getBookID();
            String title = data.getBookForLoan().getTitle();
            double loanBookPrice = data.getBookForLoan().getBookLoanPrice();
            int loanDuration = data.getLoanDuration();
            double loanFee = data.getLoanFee();

            System.out.printf("| %-2s | %-7s | %-10s | %-10s | %-45s | %-5s | %-4s | %-4s |\n",
                    num++, loanId, memberName, bookId, title, currencyFormat.format(loanBookPrice), loanDuration, currencyFormat.format(loanFee));
        }
        System.out.println("-------------------------------------------------------------");
    }


    public static void printDataIdOrder(Sementara[] listData){
        System.out.println();
        System.out.println("No\t| Loan ID | \t| Member Name |\t| Loan Duration |");
        System.out.println("---------------------------------------------");

        int num = 1;
        for (LoanBookOrder data : listData) {
            String loanId = data.getLoanID();
            String memberName = data.getMember().getMemberName();
            int loanDuration = data.getLoanDuration();

            System.out.printf("| %d\t | %s\t | %s\t | %d |\n", num++, loanId, memberName, loanDuration);
        }

        System.out.println("---------------------------------------------");
    }


}

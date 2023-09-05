package aplikasirentalbuku79.MenuRepository;



import aplikasirentalbuku79.Repository.RepositoryBook;
import aplikasirentalbuku79.Repository.RepositoryMember;
import aplikasirentalbuku79.abstrackclass.Book;
import aplikasirentalbuku79.controller.SearhDataGenaral;
import aplikasirentalbuku79.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    private Scanner scanner = new Scanner(System.in);
    private List<Sementara> sementarasList = new ArrayList<>();

    public void display() {
        RepositoryBook repositoryBook = new RepositoryBook();
        List<Book> bookList = repositoryBook.getAllBook();

        RepositoryMember repositoryMember = new RepositoryMember();
        List<Member> memberList = repositoryMember.getAllMember();


        int choice;
        int durasi;

        String member;
        String title;
        int ordID = 1;
        String ord = "Ord-";
        do {
            System.out.println();
            System.out.println("======== Main Menu ========");
            System.out.println("1. Buku yang Boleh Pinjam");
            System.out.println("2. Orderan Baru ");
            System.out.println("3. Return Buku ");
            System.out.println("4. Lihat Data Orderan");
            System.out.println("0. Keluar ");
            List<Book> listbook = SearhDataGenaral.getAllBook(bookList);


            System.out.printf("Pilih : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<Book> getAllBook = SearhDataGenaral.getAllBook(bookList);
                    ServicesDataGeneral.displayAuthorTable(getAllBook);
                    break;
                case 2:
                    String cek = ord+ordID++;
                    System.out.println("Masukan Nama Member : ");
                    member = scanner.nextLine();
                    System.out.println("Masukan Judul Buku : ");
                    title = scanner.nextLine();
                    System.out.println("Durasi pinjaman");
                    durasi = scanner.nextInt();
                    List<LoanBookOrder> listBookPinjam = SearhDataGenaral.getAllLoanBook(listbook, memberList, member, title, cek, durasi);
                        ServicesDataGeneral.printDataLoanBook(listBookPinjam);
                        for (LoanBookOrder data : listBookPinjam) {
                            Sementara sementara = new Sementara(data.getLoanID(), data.getMember(), data.getBookForLoan(), data.getLoanDuration(), data.getLoanFee());
                            sementarasList.add(sementara);
                        }
                    break;


                case 3:
                    System.out.println();
                    System.out.println("Masuukan ID Yang ingin Di Return : ");
                    String idOrder = scanner.nextLine();
                    SearhDataGenaral.getAllLOrder(sementarasList,idOrder);
                    break;

                case 4:
                    System.out.println("Data Semua Orderan....");
                    ServicesDataGeneral.printData(sementarasList.toArray(new Sementara[0]));
                    break;

                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Menu Tidak Ada");
            }
        } while (choice != 0);
    }
}



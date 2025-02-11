import Task1.CannotDivideBy0Exception;
import Task1.Divider;
import Task2.Book;
import Task2.BookRepository;
import Task2.NoBookFoundException;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(Divider.divide(10, 0));
        } catch (CannotDivideBy0Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            System.out.println(Divider.divide(0, 10));
        } catch (CannotDivideBy0Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println();

        BookRepository br1 = new BookRepository();
        Book b1 = new Book(98545415,"Nice Title","Not Nice Author", 1997);
        Book b2 = new Book(4815312,"Good Title","Good Author", 1875);
        br1.addBook(b1);
        br1.addBook(b2);
        System.out.println("To String from Book test");
        System.out.println(b1.toString());
        System.out.println(b2.toString());

        System.out.println();

        System.out.println("Successful Search By ID:");
        try {
            br1.searchBookById(1);
        }catch (NoBookFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("Successful Search By Title:");
        try {
            br1.searchBookByTitle("Nice Title");
        }catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        br1.removeBook(b1);

        System.out.println("Successful Removal By ID");
        try {
            br1.removeBookById(0);
            System.out.println("Success!");
        } catch (NoBookFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("Failed Search By ID");
        try {
            br1.searchBookById(6);
        }catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        System.out.println("Failed Search By Title:");
        try {
            br1.searchBookByTitle("Nice Title");
        }catch (NoBookFoundException ee) {
            System.out.println(ee.getMessage());
        }

        System.out.println();

        System.out.println("Failed Removal on ID");
        try {
            br1.removeBookById(6);
            System.out.println("Success!");
        }catch (NoBookFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println();



    }
}
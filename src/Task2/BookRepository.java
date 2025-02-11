package Task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> bookRepository = new ArrayList<Book>();

    public void addBook(Book b) { bookRepository.add(b); }

    public void addBook(int isbn, String title, String author, int publishYear) {
        bookRepository.add(new Book(isbn, title, author, publishYear));
    }

    public void removeBook(Book b) { bookRepository.remove(b); }

   public void searchBookByTitle(String title) throws NoBookFoundException{
       boolean isNotFound = true;
        for (Book book : bookRepository){
            if (book.getTitle().equals(title)) {
                System.out.println(book.toString());
                isNotFound = false;
            }
            if (isNotFound) throw new NoBookFoundException(String.format("Book with title '%s' not found",title));
        }
   }

   public void searchBookById(int id) throws NoBookFoundException {
        if (id < 0 || id > bookRepository.size()) throw new NoBookFoundException(String.format("Book with ID: %s not found",id));
        else {
            System.out.println(bookRepository.get(id).toString());
        }
   }

   public void removeBookById(int id) throws NoBookFoundException {
       if (id < 0 || id > bookRepository.size()) throw new NoBookFoundException(String.format("Book with ID: %s not found",id));
       else {
           bookRepository.remove(id);
       }
   }


}

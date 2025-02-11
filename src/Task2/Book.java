package Task2;

public class Book {
    private int isbn,publishYear;
    private String title,author;

    public Book(int isbn, String title, String author, int publishYear){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public int getIsbn() { return isbn; }

    public void setIsbn(int isbn) { this.isbn = isbn; }

    public int getPublishYear() { return publishYear; }

    public void setPublishYear(int publishYear) { this.publishYear = publishYear; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String toString(){
        return String.format("Author: %s \tTitle: %s \tPublishing Year: %s \tISBN: ",
                            author,title,publishYear,isbn);
    }


}

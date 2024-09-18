 package ch.bbw.medienverwaltung;

 public class Book {

    private String title;
    private String author;
    private String isbn;
    private int pages;


     public Book(String title, String author, String isbn, int pages) {
         this.title = title;
         this.author = author;
         this.isbn = isbn;
         this.pages = pages;
     }

     @Override
    public String toString() {
        return "Book:" +
                "\n    title='" + title + '\'' +
                "\n    author='" + author + '\'' +
                "\n    isbn='" + isbn + '\'' +
                "\n    pages=" + pages;
    }

    public void print() {
        System.out.println("Book:" +
                "\n    title='" + title + '\'' +
                "\n    Author='" + author + '\'' +
                "\n    isbn='" + isbn + '\'' +
                "\n    pages=" + pages);
    }
}

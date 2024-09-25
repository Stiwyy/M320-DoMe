package ch.bbw.medienverwaltung;

public class Book extends Medium {
    private String author;
    private String isbn;
    private int pages;

    public Book(String title, String author, String isbn, int pages) {
        super(title, false, "<no comment>", 0);
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }
    public Book(String title, String author, String isbn, int pages, double price) {
        super(title, false, "<no comment>", price);
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("### Klasse Book ###");
        super.print();
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Pages: " + pages);
        System.out.println();
    }
}

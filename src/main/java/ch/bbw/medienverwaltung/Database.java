package ch.bbw.medienverwaltung;
import java.util.ArrayList;

public class Database {
	
	// TODO: Diese Klasse ist wirklich schlecht programmiert
	
	private ArrayList<CD> cds;
	private ArrayList<Video> videos;
	private ArrayList<Book> books;

	public Database() {
		cds = new ArrayList<>();
		videos = new ArrayList<>();
		books  = new ArrayList<Book>();
	}

	public void addCD(CD cd) {
		cds.add(cd);
	}

	public void addVideo(Video video) {
		videos.add(video);
	}

	public void addBook(Book book) { books.add(book); }
	
	public void printList() {
		
		// print list of CDs
		for (CD cd : cds) {
			cd.print();
		}

		// print list of videos
		for (Video video : videos) {
			video.print();
		}

		for (Book book : books) {
			book.print();
		}

	}
}

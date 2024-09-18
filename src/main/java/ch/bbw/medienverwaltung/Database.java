package ch.bbw.medienverwaltung;

import java.util.ArrayList;

public class Database {
	private ArrayList<Book> books;
	private ArrayList<Video> videos;
	private ArrayList<CD> cds;

	public Database() {
		books = new ArrayList<>();
		videos = new ArrayList<>();
		cds = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public void addVideo(Video video) {
		videos.add(video);
	}

	public void addCD(CD cd) {
		cds.add(cd);
	}

	public void printList() {
		System.out.println("Books:");
		for (Book book : books) {
			book.print();
		}

		System.out.println("\nVideos:");
		for (Video video : videos) {
			video.print();
		}

		System.out.println("\nCDs:");
		for (CD cd : cds) {
			cd.print();
		}
	}
}
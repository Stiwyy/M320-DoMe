package ch.bbw.medienverwaltung;

public class Video extends Medium {
	private String director;
	private int playingTime;

	public Video(String title, String director, int playingTime) {
		super(title, false, "<no comment>", 0);
		this.director = director;
		this.playingTime = playingTime;
	}
	public Video(String title, String director, int playingTime, double price) {
		super(title, false, "<no comment>", price);
		this.director = director;
		this.playingTime = playingTime;
	}

	@Override
	public void print() {
		System.out.println("### Klasse Video ###");
		super.print();
		System.out.println("Director: " + director);
		System.out.println("Playing Time: " + playingTime + " mins");
		System.out.println();
	}
}

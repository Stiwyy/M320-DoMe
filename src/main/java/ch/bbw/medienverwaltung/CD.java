package ch.bbw.medienverwaltung;

public class CD extends Medium {
	private String artist;
	private int numberOfTracks;
	private int playingTime;

	public CD(String title, String artist, int tracks, int playingTime) {
		super(title, false, "<no comment>", 0);
		this.artist = artist;
		this.numberOfTracks = tracks;
		this.playingTime = playingTime;
	}

	public CD(String title, String artist, int tracks, int playingTime, double price) {
		super(title, false, "<no comment>", price);
		this.artist = artist;
		this.numberOfTracks = tracks;
		this.playingTime = playingTime;
	}

	@Override
	public void print() {
		System.out.println("### Klasse CD ###");
		super.print();
		System.out.println("Artist: " + artist);
		System.out.println("Tracks: " + numberOfTracks);
		System.out.println("Playing Time: " + playingTime + " mins");
		System.out.println();
	}
}

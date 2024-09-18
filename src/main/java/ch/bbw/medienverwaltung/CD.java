package ch.bbw.medienverwaltung;

public class CD {

	private String title;
	private String artist;
	private int numberOfTracks;
	private int playingTime;
	private boolean gotIt;
	private String comment;

	public CD(String title, String artist, int tracks, int playingTime) {
		this.title = title;
		this.artist = artist;
		this.numberOfTracks = tracks;
		this.playingTime = playingTime;
		this.gotIt = false;
		this.comment = "<no comment>";
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setOwn(boolean ownIt) {
		gotIt = ownIt;
	}

	public boolean getOwn() {
		return gotIt;
	}

	public void print() {
		System.out.print("CD: " + title + " (" + playingTime + " mins)");
		if (gotIt) {
			System.out.println("*");
		} else {
			System.out.println();
		}
		System.out.println("    " + artist);
		System.out.println("    tracks: " + numberOfTracks);
		System.out.println("    " + comment);
	}
}

package ch.bbw.medienverwaltung;
import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<Medium> medias;

	public Database() {
		medias = new ArrayList<Medium>();
	}

	public void addMedia(Medium media) {
		medias.add(media);
	}

	public void printList() {
		medias.forEach(Medium::print);
	}
}

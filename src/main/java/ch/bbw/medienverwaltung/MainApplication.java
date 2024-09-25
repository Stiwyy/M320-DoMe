package ch.bbw.medienverwaltung;

public class MainApplication {

	public static void main(String[] args) {
		Database db = new Database();
		CD cd1 = new CD("John Norah", "Fall", 13 , 68);
		cd1.setComment("tolle Musik");
		cd1.setOwn(true);
		cd1.setPrice(12.95);
		Video vd1 = new Video("Lord of the rings", "Jackson", 168);
		vd1.setPrice(20.50);
		Book bh1 = new Book("Das Parfüm", "fdij", "978-3-257-22800-7", 4534);
		bh1.setPrice(9.95);

		db.addMedia(cd1);
		db.addMedia(vd1);
		db.addMedia(bh1);
		db.printList();


	}
}

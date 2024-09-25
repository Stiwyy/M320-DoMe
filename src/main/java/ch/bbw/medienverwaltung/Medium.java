package ch.bbw.medienverwaltung;

public class Medium {
    private String title;
    private boolean gotIt;
    private String comment;
    private double price;

    public Medium(String title, boolean gotIt, String comment, double price) {
        this.title = title;
        this.gotIt = gotIt;
        this.comment = comment;
        this.price = price;
    }

    
    public String getTitle() {
        return title;
    }

    public boolean getGotIt() {
        return gotIt;
    }

    public String getComment() {
        return comment;
    }
    public double getPrice() {
        return price;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setOwn(boolean ownIt) {
        this.gotIt = ownIt;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void print() {
        System.out.println("Title: " + title + (gotIt ? "*" : ""));
        System.out.println("Comment: " + comment);
        System.out.println("Price: " + price);
    }
}

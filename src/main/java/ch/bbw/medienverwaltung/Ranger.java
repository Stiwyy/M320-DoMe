package ch.bbw.medienverwaltung;

public class Ranger {
    private String lastname;
    private String firstname;
    private String rank;
    private int Age;

    public Ranger(String lastname, String firstname, String rank, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.rank = rank;
        Age = age;
    }

    @Override
    public String toString() {
        return "Ranger: \n" +
                "lastname='" + lastname + '\'' +
                "\nfirstname='" + firstname + '\'' +
                "\nrank='" + rank + '\'' +
                "\nAge=" + Age ;
    }
}

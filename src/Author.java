public class Author {
    private String firstName;
    private String surName;

    public Author () {

    }
    public Author (String firstName, String surName) {

        this.firstName = firstName;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "автор: " + firstName + " " + surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}

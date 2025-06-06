public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // constructor to create a person
    public Person(String lastName, String firstName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    // returns a string combining name and address
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // constructor to create an address
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // returns a string of the full address
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}

// equals() and compareTo() subclasses were adapted from https://medium.com/@dr4wone/equals-vs-compareto-in-java-understanding-the-differences-fce0a0d4b292

public class Money {
    private long dollars;
    private long cents;

    // constructor that takes a total amount and converts to dollars and cents
    public Money(double amount) {
        long totalCents = Math.round(amount * 100);
        this.dollars = totalCents / 100;
        this.cents = totalCents % 100;
    }

    // copy constructor to create a new Money object with the same values
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // adds two Money objects
    public Money add(Money otherAmount) {
        long totalCents = this.dollars * 100 + this.cents +
                otherAmount.dollars * 100 + otherAmount.cents;
        return new Money(totalCents / 100.0);
    }

    // subtracts one Money object from another
    public Money subtract(Money otherAmount) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherAmount.dollars * 100 + otherAmount.cents;
        long resultCents = totalCents1 - totalCents2;
        return new Money(resultCents / 100.0);
    }

    // compares this Money object with another one
    public int compareTo(Money otherObject) {
        if (this.dollars != otherObject.dollars) {
            return Long.compare(this.dollars, otherObject.dollars);
        } else {
            return Long.compare(this.cents, otherObject.cents);
        }
    }

    // checks if two Money objects have the same dollar and cent values
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Money other = (Money) otherObject;
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // returns a string in proper money format
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // constructor to create a credit card
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;         // copy of person
        this.creditLimit = new Money(limit);            // copy of money for limit
        this.balance = new Money(0);                    // start with zero balance
    }

    // returns a copy of the current balance
    public Money getBalance() {
        return new Money(balance);                      // return defensive copy
    }

    // returns a copy of the credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit);                  // return defensive copy
    }

    // returns the owner's personal information
    public String getPersonals() {
        return owner.toString();                        // call person's toString
    }

    // adds a charge to the balance if it doesn't exceed the credit limit
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // subtracts a payment from the balance
    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}

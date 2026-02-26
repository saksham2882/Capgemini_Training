package Calculator;

public abstract class Account {
    private double interestRate;
    private double amount;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract double calculateInterest() throws InvalidInputException;
}
package Calculator;

public class RDAccount extends Account {
    private int noOfMonths;
    private double monthlyAmount;
    private int ageOfACHolder;

    public RDAccount(double monthlyAmount, int noOfMonths, int ageOfACHolder) {
        this.monthlyAmount = monthlyAmount;
        this.noOfMonths = noOfMonths;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    public double calculateInterest() throws InvalidInputException {
        if (monthlyAmount < 0 || noOfMonths < 0){
            throw new InvalidInputException("Invalid Input");
        }

        boolean isSenior = ageOfACHolder >= 60;

        if (noOfMonths == 6){
            setInterestRate(isSenior ? 8.00 : 7.50);
        }
        else if (noOfMonths == 9){
            setInterestRate(isSenior ? 8.25 : 7.75);
        }
        else if (noOfMonths == 12){
            setInterestRate(isSenior ? 8.50 : 8.00);
        }
        else if (noOfMonths == 15){
            setInterestRate(isSenior ? 8.75 : 8.25);
        }
        else if (noOfMonths == 18){
            setInterestRate(isSenior ? 9.00 : 8.50);
        }
        else if (noOfMonths == 21){
            setInterestRate(isSenior ? 9.25 : 8.75);
        }
        else{
            throw new InvalidInputException("Invalid Months");
        }

        setAmount(monthlyAmount * noOfMonths);

        return (getAmount() * getInterestRate()) / 100;
    }
}
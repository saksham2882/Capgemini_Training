package Calculator;

public class FDAccount extends Account {
    private int noOfDays;
    private int ageOfACHolder;

    public FDAccount(double amount, int noOfDays, int ageOfACHolder) {
        setAmount(amount);
        this.noOfDays = noOfDays;
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    public double calculateInterest() throws InvalidInputException {
        if (getAmount() < 0){
            throw new InvalidInputException("Invalid Amount");
        }

        if (noOfDays < 0){
            throw new InvalidInputException("Invalid Number of days.");
        }

        boolean isSenior = ageOfACHolder >= 60;

        if (getAmount() < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14){
                setInterestRate(isSenior ? 5.00 : 4.50);
            }
            else if (noOfDays <= 29){
                setInterestRate(isSenior ? 5.25 : 4.75);
            }
            else if (noOfDays <= 45) {
                setInterestRate(isSenior ? 6.00 : 5.50);
            }
            else if (noOfDays <= 60){
                setInterestRate(isSenior ? 7.50 : 7.00);
            }
            else if (noOfDays <= 184){
                setInterestRate(isSenior ? 8.00 : 7.50);
            }
            else if (noOfDays <= 365){
                setInterestRate(isSenior ? 8.50 : 8.00);
            }
            else{
                throw new InvalidInputException("Invalid Period");
            }
        }
        else {
            if (noOfDays >= 7 && noOfDays <= 14){
                setInterestRate(6.50);
            }
            else if (noOfDays <= 29){
                setInterestRate(6.75);
            }
            else if (noOfDays <= 45){
                setInterestRate(6.75);
            }
            else if (noOfDays <= 60){
                setInterestRate(8.00);
            }
            else if (noOfDays <= 184){
                setInterestRate(8.50);
            }
            else if (noOfDays <= 365){
                setInterestRate(10.00);
            }
            else{
                throw new InvalidInputException("Invalid Period");
            }
        }

        return (getAmount() * getInterestRate()) / 100;
    }
}
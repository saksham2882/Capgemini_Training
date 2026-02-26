package Calculator;

public class SBAccount extends Account {
    private String accountType;

    public SBAccount(double amount, String accountType) {
        setAmount(amount);
        this.accountType = accountType;
    }

    @Override
    public double calculateInterest() throws InvalidInputException {

        if (getAmount() < 0){
            throw new InvalidInputException("Invalid Amount");
        }

        if (accountType.equalsIgnoreCase("Normal")){
            setInterestRate(4);
        }

        else if (accountType.equalsIgnoreCase("NRI")){
            setInterestRate(6);
        }

        else {
            throw new InvalidInputException("Invalid Account Type");
        }

        return (getAmount() * getInterestRate()) / 100;
    }
}
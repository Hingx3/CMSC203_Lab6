
public class CheckingAccount extends BankAccount {
	//The cost of clearing one check
	private static final double FEE = 0.15;

	public CheckingAccount(String name, double initialAmount) {
		//Call the constructor for the superclass
		super(name, initialAmount);
		setAccountNumber(getAccountNumber() + "-10");
	}

	public boolean withdraw(double amount) {
		//Calculate amount after fees
		double amountAfterFees = (amount + FEE);
		return super.withdraw(amountAfterFees);
	}

}

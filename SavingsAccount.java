
public class SavingsAccount extends BankAccount{
	//Set the annual interest rate
	private final double rate = 0.025;
	
	private static int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) 
	{
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public SavingsAccount(SavingsAccount newSavingsAccount, double balance) 
	{
		super(newSavingsAccount, balance);		
		savingsNumber++;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	public void postInterest() 
	{
		//Calculate monthly rate
		double monthlyRate = (rate / 12);
		
		//Calculate monthly fees
		double monthlyInterest = monthlyRate * getBalance();
		
		//Deposit
		deposit(monthlyInterest);
	}
	
	@Override
	public String getAccountNumber() 
	{
		return accountNumber;
	}
	
	
	
	
	
	
	
	
}
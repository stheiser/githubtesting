
public class BankAccount 
{
	//default constructor (provides inital values to instance fields)
	public BankAccount()
	{
		balance = 254.78;
	}
	//parameterized constructor
	public BankAccount(double someBalance)
	{
		balance = someBalance;
	}

	//withdraw method
	public void withdraw(double someWithdrawal)
	{
		balance = balance - someWithdrawal;	//withdraws some amount
	}
	
	
	//deposit method
	public void deposit(double someDeposit)
	{
		balance = balance + someDeposit;	//deposits some amount
	}
	
	//check balance method
	public double getBalance()
	{
		return balance;
	}
	
	//instance fields
	private double balance;
}

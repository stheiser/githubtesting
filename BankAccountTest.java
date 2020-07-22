import javax.swing.JOptionPane;

public class BankAccountTest
{

	public static void main(String[] args)
	{
		//welcome message
		System.out.println("Welcome to Heiser Bank");
		
		//create object
		BankAccount access = new BankAccount();
		BankAccount access2 = new BankAccount();
		System.out.println("Account holder one's balance is $" + access.getBalance());
		access.deposit(150.23);
		access.withdraw(56.32);
		System.out.println("Account holder one's new balance is $" + access.getBalance());
		
		System.out.println("Account holder two's balance is $" + access2.getBalance());
		access2.deposit(456.12);
		access2.deposit(12.89);
		access2.withdraw(6500.54);
		System.out.println("Account holder two's new balance is $" + access2.getBalance());
		
		double initBalance = Double.parseDouble(JOptionPane.showInputDialog("Please enter a starting balance"));
		BankAccount access3 = new BankAccount(initBalance);
		System.out.println("Account holder three's initial balance is $" + access3.getBalance());
		access3.deposit(1254.23);
		access3.deposit(456.25);
		access3.withdraw(4587.36);
		System.out.println("Account holder three's new balance is $" + access3.getBalance());
	}

}
